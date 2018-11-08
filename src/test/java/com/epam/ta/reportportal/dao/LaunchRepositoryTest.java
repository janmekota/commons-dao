/*
 *  Copyright (C) 2018 EPAM Systems
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.commons.querygen.Condition;
import com.epam.ta.reportportal.commons.querygen.Filter;
import com.epam.ta.reportportal.commons.querygen.FilterCondition;
import com.epam.ta.reportportal.config.TestConfiguration;
import com.epam.ta.reportportal.config.util.SqlRunner;
import com.epam.ta.reportportal.entity.enums.KeepLogsDelay;
import com.epam.ta.reportportal.entity.enums.LaunchModeEnum;
import com.epam.ta.reportportal.entity.enums.StatusEnum;
import com.epam.ta.reportportal.entity.launch.Launch;
import com.epam.ta.reportportal.ws.model.launch.Mode;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Sets;
import org.apache.commons.collections.CollectionUtils;
import org.hamcrest.Matchers;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.epam.ta.reportportal.commons.EntityUtils.TO_DATE;
import static com.epam.ta.reportportal.commons.querygen.constant.GeneralCriteriaConstant.CRITERIA_PROJECT_ID;
import static com.epam.ta.reportportal.dao.constant.TestConstants.LAST_MODIFIED_BEFORE;
import static com.epam.ta.reportportal.dao.constant.TestConstants.SUPERADMIN_PERSONAL_PROJECT_ID;

/**
 * @author Ivan Budaev
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
@Transactional("transactionManager")
public class LaunchRepositoryTest {

	@Autowired
	private LaunchRepository launchRepository;

	@BeforeClass
	public static void init() throws SQLException {
		SqlRunner.runSqlScripts("/launch/launch-down.sql", "/user/user-project-down.sql");
		SqlRunner.runSqlScripts("/user/user-project-up.sql", "/launch/launch-up.sql");
	}

	@AfterClass
	public static void destroy() throws SQLException {
		SqlRunner.runSqlScripts("/launch/launch-down.sql", "/user/user-project-down.sql");
	}

	@Test
	public void streamLaunchIdsTest() {

		Stream<Long> stream = launchRepository.streamIdsWithStatusModifiedBefore(SUPERADMIN_PERSONAL_PROJECT_ID,
				StatusEnum.FAILED,
				LAST_MODIFIED_BEFORE
		);

		Assert.assertNotNull(stream);
		List<Long> ids = stream.collect(Collectors.toList());
		Assert.assertTrue(CollectionUtils.isNotEmpty(ids));
		Assert.assertEquals(12L, ids.size());
	}

	@Test
	public void getIdsModifiedBeforeTest() {

		Date before = TO_DATE.apply(LAST_MODIFIED_BEFORE.minusSeconds(Duration.ofDays(KeepLogsDelay.TWO_WEEKS.getDays() - 1).getSeconds()));

		Page<Long> modifiedBefore = launchRepository.getIdsModifiedBefore(SUPERADMIN_PERSONAL_PROJECT_ID, before, PageRequest.of(0, 12));

		Assert.assertNotNull(modifiedBefore.getContent());
		Assert.assertTrue(CollectionUtils.isNotEmpty(modifiedBefore.getContent()));
		Assert.assertEquals(12L, modifiedBefore.getNumberOfElements());
	}

	@Test
	public void testLaunches() {
		List<Launch> launches = launchRepository.findByProjectIdAndStartTimeGreaterThanAndMode(1l,
				LocalDateTime.now().minusMonths(1),
				LaunchModeEnum.DEFAULT
		);
		Assert.assertThat(launches.size(), Matchers.greaterThan(0));
	}

	@Test
	public void testLoadLaunchesHistory() {
		List<Launch> demoLaunchS = launchRepository.findLaunchesHistory(2, 2L, "Demo launch s", 2L);
		Assert.assertThat(demoLaunchS.size(), Matchers.equalTo(2));
		demoLaunchS.forEach(it -> Assert.assertThat(it.getName(), Matchers.equalToIgnoringCase("Demo launch s")));
	}

	@Test
	public void mergeLaunchTestItems() {
		long time = System.nanoTime() / 1000000;
		launchRepository.mergeLaunchTestItems(1L);
		System.out.println(System.nanoTime() / 1000000 - time);
		System.out.println("OK");
	}

	@Test
	public void findAllLatestLaunchesTest() {

		Page<Launch> allLatestByFilter = launchRepository.findAllLatestByFilter(buildDefaultFilter(1L), PageRequest.of(0, 2));

		Assert.assertNotNull(allLatestByFilter);
		Assert.assertEquals(2, allLatestByFilter.getNumberOfElements());
	}

	@Test
	public void getLaunchNamesTest() {
		List<String> launchNames = launchRepository.getLaunchNames(1L, "launch", LaunchModeEnum.DEFAULT.toString());

		Assert.assertNotNull(launchNames);
		Assert.assertTrue(CollectionUtils.isNotEmpty(launchNames));
	}

	@Test
	public void jsonParsingTest() throws JsonProcessingException {
		Launch launch = launchRepository.findById(2L).get();

		String string = new ObjectMapper().writeValueAsString(launch);
	}

	@Test
	public void findLaunchByFilterTest() {
		List<Launch> launches = launchRepository.findByFilter(buildDefaultFilter(1L).withCondition(new FilterCondition(Condition.CONTAINS,
				false,
				"build",
				"tags"
		)));

		launches.forEach(l -> Assert.assertTrue(CollectionUtils.isNotEmpty(l.getTags())));
	}

	private Filter buildDefaultFilter(Long projectId) {
		Set<FilterCondition> conditionSet = Sets.newHashSet(new FilterCondition(Condition.EQUALS,
						false,
						String.valueOf(projectId),
						CRITERIA_PROJECT_ID
				),
				new FilterCondition(Condition.NOT_EQUALS, false, StatusEnum.IN_PROGRESS.name(), "status"),
				new FilterCondition(Condition.EQUALS, false, Mode.DEFAULT.toString(), "mode")
		);
		return new Filter(Launch.class, conditionSet);
	}
}
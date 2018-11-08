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

import com.epam.ta.reportportal.config.TestConfiguration;
import com.epam.ta.reportportal.config.util.SqlRunner;
import com.epam.ta.reportportal.entity.enums.StatusEnum;
import com.epam.ta.reportportal.entity.item.TestItem;
import org.apache.commons.collections.CollectionUtils;
import org.assertj.core.util.Lists;
import org.hamcrest.Matchers;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ivan Budaev
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
@Transactional("transactionManager")
public class TestItemRepositoryTest {

	@Autowired
	private TestItemRepository testItemRepository;

	@BeforeClass
	public static void init() throws SQLException {
		SqlRunner.runSqlScripts("/log/log-down.sql", "/item/item-down.sql", "/launch/launch-down.sql", "/user/user-project-down.sql");

		SqlRunner.runSqlScripts("/user/user-project-up.sql", "/launch/launch-up.sql", "/item/item-up.sql", "/log/log-up.sql");

	}

	@AfterClass
	public static void destroy() throws SQLException {
		SqlRunner.runSqlScripts("/log/log-down.sql", "/item/item-down.sql", "/launch/launch-down.sql", "/user/user-project-down.sql");
	}

	@Test
	public void streamItemIdsTest() {
		Stream<Long> stream = testItemRepository.streamTestItemIdsByLaunchId(1L);

		Assert.assertNotNull(stream);

		List<Long> ids = stream.collect(Collectors.toList());

		Assert.assertTrue(CollectionUtils.isNotEmpty(ids));
		Assert.assertEquals(5, ids.size());
	}

	@Test
	public void hasItemsInStatusAddedLatelyTest() {
		Duration duration = Duration.ofHours(1);

		Assert.assertTrue(testItemRepository.hasItemsInStatusAddedLately(1L, duration, StatusEnum.FAILED));
	}

	@Test
	public void hasLogsTest() {
		Assert.assertTrue(testItemRepository.hasLogs(1L, Duration.ofDays(12).plusHours(23), StatusEnum.IN_PROGRESS));
	}

	@Test
	public void selectPathNames() {
		Map<Long, String> results = testItemRepository.selectPathNames("1.2.3");
		Assert.assertThat(results.getClass(), Matchers.theInstance(LinkedHashMap.class));
		Assert.assertThat(results.size(), Matchers.equalTo(2));
		System.out.println();
	}

	@Test
	public void testLoadItemsHistory() {
		List<TestItem> testItems = testItemRepository.loadItemsHistory(Lists.newArrayList("auto:3d3ef012c6687480d6fb9b4a3fa9471d"),
				Lists.newArrayList(9L, 10L, 11L, 12L, 13L)
		);
	}

	@Test
	public void findTestItemsByLaunchId() {

		List<TestItem> testItemList = testItemRepository.findTestItemsByLaunchId(1L);

		Assert.assertNotNull(testItemList);
	}
}
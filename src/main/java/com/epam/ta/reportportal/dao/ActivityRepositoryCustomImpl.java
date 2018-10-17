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
import com.epam.ta.reportportal.commons.querygen.QueryBuilder;
import com.epam.ta.reportportal.entity.Activity;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import static com.epam.ta.reportportal.dao.util.RecordMappers.ACTIVITY_MAPPER;
import static com.epam.ta.reportportal.jooq.tables.JActivity.ACTIVITY;

/**
 * @author Ihar Kahadouski
 */
@Repository
public class ActivityRepositoryCustomImpl implements ActivityRepositoryCustom {

	private static final String PROJECT_ID_COLUMN = "project_id";
	private static final String CREATION_DATE_COLUMN = "creation_date";
	private static final String OBJECT_ID_COLUMN = "object_id";

	private DSLContext dsl;

	@Autowired
	public ActivityRepositoryCustomImpl(DSLContext dsl) {
		this.dsl = dsl;
	}

	@Override
	public List<Activity> findActivitiesByTestItemId(Long testItemId, Filter filter, Pageable pageable) {
		Sort sort = new Sort(Sort.Direction.DESC, CREATION_DATE_COLUMN);
		FilterCondition testItemIdCondition = FilterCondition.builder()
				.withCondition(Condition.EQUALS)
				.withSearchCriteria(OBJECT_ID_COLUMN)
				.withValue(testItemId.toString())
				.build();
		return dsl.fetch(QueryBuilder.newBuilder(filter.withCondition(testItemIdCondition)).with(sort).build()).map(ACTIVITY_MAPPER);
	}

	@Override
	public List<Activity> findActivitiesByProjectId(Long projectId, Filter filter, Pageable pageable) {
		FilterCondition projectIdCondition = FilterCondition.builder()
				.withCondition(Condition.EQUALS)
				.withSearchCriteria(PROJECT_ID_COLUMN)
				.withValue(projectId.toString())
				.build();
		return dsl.fetch(QueryBuilder.newBuilder(filter.withCondition(projectIdCondition)).with(pageable).build()).map(ACTIVITY_MAPPER);
	}

	@Override
	public void deleteModifiedLaterAgo(Long projectId, Duration period) {
		LocalDateTime bound = LocalDateTime.now().minus(period);
		dsl.delete(ACTIVITY).where(ACTIVITY.PROJECT_ID.eq(projectId)).and(ACTIVITY.CREATION_DATE.lt(Timestamp.valueOf(bound))).execute();
	}

	@Override
	public List<Activity> findByFilterWithSortingAndLimit(Filter filter, Sort sort, int limit) {
		return dsl.fetch(QueryBuilder.newBuilder(filter).with(sort).with(limit).build()).map(ACTIVITY_MAPPER);
	}

	@Override
	public List<Activity> findByFilter(Filter filter) {
		return dsl.fetch(QueryBuilder.newBuilder(filter).build()).map(ACTIVITY_MAPPER);
	}

	@Override
	public Page<Activity> findByFilter(Filter filter, Pageable pageable) {
		QueryBuilder queryBuilder = QueryBuilder.newBuilder(filter);
		return PageableExecutionUtils.getPage(dsl.fetch(queryBuilder.with(pageable).build()).map(ACTIVITY_MAPPER),
				pageable,
				() -> dsl.fetchCount(queryBuilder.build())
		);
	}
}
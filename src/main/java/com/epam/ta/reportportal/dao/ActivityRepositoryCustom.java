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

import com.epam.ta.reportportal.commons.querygen.Filter;
import com.epam.ta.reportportal.entity.Activity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.time.Duration;
import java.util.List;

/**
 * @author Ihar Kahadouski
 */
public interface ActivityRepositoryCustom extends FilterableRepository<Activity> {

	/**
	 * Find list of {@link com.epam.ta.reportportal.entity.Activity}
	 * for specified {@link com.epam.ta.reportportal.entity.item.TestItem}
	 *
	 * @param testItemId ID of {@link com.epam.ta.reportportal.entity.item.TestItem}
	 * @param filter     Filter
	 * @param sort       Sorting details
	 * @param pageable   Page Details
	 * @return Found activities
	 */
	List<Activity> findActivitiesByTestItemId(Long testItemId, Filter filter, Sort sort, Pageable pageable);

	/**
	 * Find list of {@link com.epam.ta.reportportal.entity.Activity}
	 * for specified {@link com.epam.ta.reportportal.entity.project.Project}
	 *
	 * @param projectId ID of {@link com.epam.ta.reportportal.entity.project.Project}
	 * @param filter    Filter
	 * @param pageable  Page Details
	 * @return Found activities
	 */
	List<Activity> findActivitiesByProjectId(Long projectId, Filter filter, Pageable pageable);

	/**
	 * Delete outdated activities
	 *
	 * @param projectId ID of project
	 * @param period    Time period
	 */
	void deleteModifiedLaterAgo(Long projectId, Duration period);

	/**
	 * Find limiting count of results
	 *
	 * @param filter    Filter
	 * @param sort        Sorting details
	 * @param limit    Maximum number of returning items
	 * @return Found activities
	 */
	List<Activity> findByFilterWithSortingAndLimit(Filter filter, Sort sort, int limit);
}
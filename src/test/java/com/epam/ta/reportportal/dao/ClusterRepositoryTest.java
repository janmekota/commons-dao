/*
 * Copyright 2021 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.BaseTest;
import com.epam.ta.reportportal.entity.cluster.Cluster;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@Sql("/db/fill/launch/launch-fill.sql")
class ClusterRepositoryTest extends BaseTest {

	private static final long CLUSTER_ID_START_VALUE = 1L;
	private static final long CLUSTER_ID_END_VALUE = 4L;
	private static final long PROJECT_ID = 1L;
	private static final long LAUNCH_ID = 1L;

	@Autowired
	private ClusterRepository clusterRepository;

	@BeforeEach
	void insertClusters() {
		final List<Cluster> clusters = LongStream.range(CLUSTER_ID_START_VALUE, CLUSTER_ID_END_VALUE).mapToObj(id -> {
			final Cluster cluster = new Cluster();
			cluster.setId(id);
			cluster.setLaunchId(LAUNCH_ID);
			cluster.setMessage("Message");
			return cluster;
		}).collect(Collectors.toList());
		clusterRepository.saveAll(clusters);
	}

	@AfterEach
	void removeClusters() {
		LongStream.range(CLUSTER_ID_START_VALUE, CLUSTER_ID_END_VALUE)
				.mapToObj(clusterRepository::findById)
				.forEach(cluster -> cluster.ifPresent(clusterRepository::delete));
	}

	@Test
	void shouldFindByLaunchId() {
		final List<Cluster> clusters = clusterRepository.findAllByLaunchIdOrderById(LAUNCH_ID);
		assertFalse(clusters.isEmpty());
		assertEquals(3, clusters.size());
		clusters.forEach(cluster -> assertEquals(LAUNCH_ID, cluster.getLaunchId()));
	}

	@Test
	void shouldDeleteByLaunchId() {
		final int removed = clusterRepository.deleteAllByLaunchId(LAUNCH_ID);
		assertEquals(3, removed);

		final List<Cluster> clusters = clusterRepository.findAllByLaunchIdOrderById(LAUNCH_ID);
		assertTrue(clusters.isEmpty());
	}

	@Test
	void shouldDeleteByProjectId() {
		final int removed = clusterRepository.deleteAllByProjectId(PROJECT_ID);
		assertEquals(3, removed);

		final List<Cluster> clusters = clusterRepository.findAllByLaunchIdOrderById(LAUNCH_ID);
		assertTrue(clusters.isEmpty());
	}

}
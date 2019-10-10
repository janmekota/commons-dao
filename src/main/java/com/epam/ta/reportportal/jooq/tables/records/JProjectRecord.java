/*
 * Copyright 2019 EPAM Systems
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

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JProject;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.11" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JProjectRecord extends UpdatableRecordImpl<JProjectRecord>
		implements Record6<Long, String, String, String, Timestamp, Object> {

	private static final long serialVersionUID = -618648114;

	/**
	 * Setter for <code>public.project.id</code>.
	 */
	public void setId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.project.id</code>.
	 */
	public Long getId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.project.name</code>.
	 */
	public void setName(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.project.name</code>.
	 */
	public String getName() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>public.project.project_type</code>.
	 */
	public void setProjectType(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.project.project_type</code>.
	 */
	public String getProjectType() {
		return (String) get(2);
	}

	/**
	 * Setter for <code>public.project.organization</code>.
	 */
	public void setOrganization(String value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.project.organization</code>.
	 */
	public String getOrganization() {
		return (String) get(3);
	}

	/**
	 * Setter for <code>public.project.creation_date</code>.
	 */
	public void setCreationDate(Timestamp value) {
		set(4, value);
	}

	/**
	 * Getter for <code>public.project.creation_date</code>.
	 */
	public Timestamp getCreationDate() {
		return (Timestamp) get(4);
	}

	/**
	 * Setter for <code>public.project.metadata</code>.
	 */
	public void setMetadata(Object value) {
		set(5, value);
	}

	/**
	 * Getter for <code>public.project.metadata</code>.
	 */
	public Object getMetadata() {
		return get(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Long, String, String, String, Timestamp, Object> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Long, String, String, String, Timestamp, Object> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JProject.PROJECT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JProject.PROJECT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return JProject.PROJECT.PROJECT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return JProject.PROJECT.ORGANIZATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return JProject.PROJECT.CREATION_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field6() {
		return JProject.PROJECT.METADATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component3() {
		return getProjectType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component4() {
		return getOrganization();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp component5() {
		return getCreationDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object component6() {
		return getMetadata();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getProjectType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getOrganization();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getCreationDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value6() {
		return getMetadata();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectRecord value3(String value) {
		setProjectType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectRecord value4(String value) {
		setOrganization(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectRecord value5(Timestamp value) {
		setCreationDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectRecord value6(Object value) {
		setMetadata(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectRecord values(Long value1, String value2, String value3, String value4, Timestamp value5, Object value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JProjectRecord
	 */
	public JProjectRecord() {
		super(JProject.PROJECT);
	}

	/**
	 * Create a detached, initialised JProjectRecord
	 */
	public JProjectRecord(Long id, String name, String projectType, String organization, Timestamp creationDate, Object metadata) {
		super(JProject.PROJECT);

		set(0, id);
		set(1, name);
		set(2, projectType);
		set(3, organization);
		set(4, creationDate);
		set(5, metadata);
	}
}

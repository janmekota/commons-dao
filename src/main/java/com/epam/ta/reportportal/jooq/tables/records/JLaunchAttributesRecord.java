/*
 * Copyright 2018 EPAM Systems
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

import com.epam.ta.reportportal.jooq.tables.JLaunchAttributes;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.7" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JLaunchAttributesRecord extends TableRecordImpl<JLaunchAttributesRecord> implements Record2<Long, String> {

	private static final long serialVersionUID = -1815794881;

	/**
	 * Setter for <code>public.launch_attributes.sender_case_id</code>.
	 */
	public void setSenderCaseId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.launch_attributes.sender_case_id</code>.
	 */
	public Long getSenderCaseId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.launch_attributes.launch_attribute</code>.
	 */
	public void setLaunchAttribute(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.launch_attributes.launch_attribute</code>.
	 */
	public String getLaunchAttribute() {
		return (String) get(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JLaunchAttributes.LAUNCH_ATTRIBUTES.SENDER_CASE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JLaunchAttributes.LAUNCH_ATTRIBUTES.LAUNCH_ATTRIBUTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getSenderCaseId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component2() {
		return getLaunchAttribute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getSenderCaseId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getLaunchAttribute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchAttributesRecord value1(Long value) {
		setSenderCaseId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchAttributesRecord value2(String value) {
		setLaunchAttribute(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunchAttributesRecord values(Long value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JLaunchAttributesRecord
	 */
	public JLaunchAttributesRecord() {
		super(JLaunchAttributes.LAUNCH_ATTRIBUTES);
	}

	/**
	 * Create a detached, initialised JLaunchAttributesRecord
	 */
	public JLaunchAttributesRecord(Long senderCaseId, String launchAttribute) {
		super(JLaunchAttributes.LAUNCH_ATTRIBUTES);

		set(0, senderCaseId);
		set(1, launchAttribute);
	}
}

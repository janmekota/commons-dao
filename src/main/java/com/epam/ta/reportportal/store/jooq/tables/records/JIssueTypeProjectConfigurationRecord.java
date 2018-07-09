/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.tables.JIssueTypeProjectConfiguration;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIssueTypeProjectConfigurationRecord extends UpdatableRecordImpl<JIssueTypeProjectConfigurationRecord>
		implements Record2<Long, Long> {

	private static final long serialVersionUID = 753043414;

	/**
	 * Setter for <code>public.issue_type_project_configuration.configuration_id</code>.
	 */
	public void setConfigurationId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.issue_type_project_configuration.configuration_id</code>.
	 */
	public Long getConfigurationId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.issue_type_project_configuration.issue_type_id</code>.
	 */
	public void setIssueTypeId(Long value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.issue_type_project_configuration.issue_type_id</code>.
	 */
	public Long getIssueTypeId() {
		return (Long) get(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Long, Long> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.CONFIGURATION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.ISSUE_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getConfigurationId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component2() {
		return getIssueTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getConfigurationId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getIssueTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueTypeProjectConfigurationRecord value1(Long value) {
		setConfigurationId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueTypeProjectConfigurationRecord value2(Long value) {
		setIssueTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueTypeProjectConfigurationRecord values(Long value1, Long value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JIssueTypeProjectConfigurationRecord
	 */
	public JIssueTypeProjectConfigurationRecord() {
		super(JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION);
	}

	/**
	 * Create a detached, initialised JIssueTypeProjectConfigurationRecord
	 */
	public JIssueTypeProjectConfigurationRecord(Long configurationId, Long issueTypeId) {
		super(JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION);

		set(0, configurationId);
		set(1, issueTypeId);
	}
}

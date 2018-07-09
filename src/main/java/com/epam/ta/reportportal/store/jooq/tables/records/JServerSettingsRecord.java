/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.tables.JServerSettings;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JServerSettingsRecord extends UpdatableRecordImpl<JServerSettingsRecord> implements Record3<Short, String, String> {

	private static final long serialVersionUID = -1939810868;

	/**
	 * Setter for <code>public.server_settings.id</code>.
	 */
	public void setId(Short value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.server_settings.id</code>.
	 */
	public Short getId() {
		return (Short) get(0);
	}

	/**
	 * Setter for <code>public.server_settings.key</code>.
	 */
	public void setKey(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.server_settings.key</code>.
	 */
	public String getKey() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>public.server_settings.value</code>.
	 */
	public void setValue(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.server_settings.value</code>.
	 */
	public String getValue() {
		return (String) get(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Short> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Short, String, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Short, String, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field1() {
		return JServerSettings.SERVER_SETTINGS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JServerSettings.SERVER_SETTINGS.KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return JServerSettings.SERVER_SETTINGS.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short component1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component2() {
		return getKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component3() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JServerSettingsRecord value1(Short value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JServerSettingsRecord value2(String value) {
		setKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JServerSettingsRecord value3(String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JServerSettingsRecord values(Short value1, String value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JServerSettingsRecord
	 */
	public JServerSettingsRecord() {
		super(JServerSettings.SERVER_SETTINGS);
	}

	/**
	 * Create a detached, initialised JServerSettingsRecord
	 */
	public JServerSettingsRecord(Short id, String key, String value) {
		super(JServerSettings.SERVER_SETTINGS);

		set(0, id);
		set(1, key);
		set(2, value);
	}
}

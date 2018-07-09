/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.tables.JParameter;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JParameterRecord extends TableRecordImpl<JParameterRecord> implements Record3<Long, String, String> {

	private static final long serialVersionUID = 1502446622;

	/**
	 * Setter for <code>public.parameter.item_id</code>.
	 */
	public void setItemId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.parameter.item_id</code>.
	 */
	public Long getItemId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.parameter.key</code>.
	 */
	public void setKey(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.parameter.key</code>.
	 */
	public String getKey() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>public.parameter.value</code>.
	 */
	public void setValue(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.parameter.value</code>.
	 */
	public String getValue() {
		return (String) get(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Long, String, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Long, String, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JParameter.PARAMETER.ITEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JParameter.PARAMETER.KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return JParameter.PARAMETER.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getItemId();
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
	public Long value1() {
		return getItemId();
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
	public JParameterRecord value1(Long value) {
		setItemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JParameterRecord value2(String value) {
		setKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JParameterRecord value3(String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JParameterRecord values(Long value1, String value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JParameterRecord
	 */
	public JParameterRecord() {
		super(JParameter.PARAMETER);
	}

	/**
	 * Create a detached, initialised JParameterRecord
	 */
	public JParameterRecord(Long itemId, String key, String value) {
		super(JParameter.PARAMETER);

		set(0, itemId);
		set(1, key);
		set(2, value);
	}
}

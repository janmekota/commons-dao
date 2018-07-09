/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.enums.JTestItemTypeEnum;
import com.epam.ta.reportportal.store.jooq.tables.JTestItem;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTestItemRecord extends UpdatableRecordImpl<JTestItemRecord>
		implements Record7<Long, String, JTestItemTypeEnum, Timestamp, String, Timestamp, String> {

	private static final long serialVersionUID = -1122000626;

	/**
	 * Setter for <code>public.test_item.item_id</code>.
	 */
	public void setItemId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.test_item.item_id</code>.
	 */
	public Long getItemId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.test_item.name</code>.
	 */
	public void setName(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.test_item.name</code>.
	 */
	public String getName() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>public.test_item.type</code>.
	 */
	public void setType(JTestItemTypeEnum value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.test_item.type</code>.
	 */
	public JTestItemTypeEnum getType() {
		return (JTestItemTypeEnum) get(2);
	}

	/**
	 * Setter for <code>public.test_item.start_time</code>.
	 */
	public void setStartTime(Timestamp value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.test_item.start_time</code>.
	 */
	public Timestamp getStartTime() {
		return (Timestamp) get(3);
	}

	/**
	 * Setter for <code>public.test_item.description</code>.
	 */
	public void setDescription(String value) {
		set(4, value);
	}

	/**
	 * Getter for <code>public.test_item.description</code>.
	 */
	public String getDescription() {
		return (String) get(4);
	}

	/**
	 * Setter for <code>public.test_item.last_modified</code>.
	 */
	public void setLastModified(Timestamp value) {
		set(5, value);
	}

	/**
	 * Getter for <code>public.test_item.last_modified</code>.
	 */
	public Timestamp getLastModified() {
		return (Timestamp) get(5);
	}

	/**
	 * Setter for <code>public.test_item.unique_id</code>.
	 */
	public void setUniqueId(String value) {
		set(6, value);
	}

	/**
	 * Getter for <code>public.test_item.unique_id</code>.
	 */
	public String getUniqueId() {
		return (String) get(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Long, String, JTestItemTypeEnum, Timestamp, String, Timestamp, String> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Long, String, JTestItemTypeEnum, Timestamp, String, Timestamp, String> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JTestItem.TEST_ITEM.ITEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JTestItem.TEST_ITEM.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<JTestItemTypeEnum> field3() {
		return JTestItem.TEST_ITEM.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return JTestItem.TEST_ITEM.START_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return JTestItem.TEST_ITEM.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return JTestItem.TEST_ITEM.LAST_MODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return JTestItem.TEST_ITEM.UNIQUE_ID;
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
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemTypeEnum component3() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp component4() {
		return getStartTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component5() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp component6() {
		return getLastModified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component7() {
		return getUniqueId();
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
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemTypeEnum value3() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getStartTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getLastModified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getUniqueId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemRecord value1(Long value) {
		setItemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemRecord value3(JTestItemTypeEnum value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemRecord value4(Timestamp value) {
		setStartTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemRecord value5(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemRecord value6(Timestamp value) {
		setLastModified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemRecord value7(String value) {
		setUniqueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemRecord values(Long value1, String value2, JTestItemTypeEnum value3, Timestamp value4, String value5, Timestamp value6,
			String value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JTestItemRecord
	 */
	public JTestItemRecord() {
		super(JTestItem.TEST_ITEM);
	}

	/**
	 * Create a detached, initialised JTestItemRecord
	 */
	public JTestItemRecord(Long itemId, String name, JTestItemTypeEnum type, Timestamp startTime, String description,
			Timestamp lastModified, String uniqueId) {
		super(JTestItem.TEST_ITEM);

		set(0, itemId);
		set(1, name);
		set(2, type);
		set(3, startTime);
		set(4, description);
		set(5, lastModified);
		set(6, uniqueId);
	}
}

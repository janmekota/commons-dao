/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.tables.JLog;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JLogRecord extends UpdatableRecordImpl<JLogRecord>
		implements Record9<Long, Timestamp, String, Long, Timestamp, Integer, String, String, String> {

	private static final long serialVersionUID = 1585164914;

	/**
	 * Setter for <code>public.log.id</code>.
	 */
	public void setId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.log.id</code>.
	 */
	public Long getId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.log.log_time</code>.
	 */
	public void setLogTime(Timestamp value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.log.log_time</code>.
	 */
	public Timestamp getLogTime() {
		return (Timestamp) get(1);
	}

	/**
	 * Setter for <code>public.log.log_message</code>.
	 */
	public void setLogMessage(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.log.log_message</code>.
	 */
	public String getLogMessage() {
		return (String) get(2);
	}

	/**
	 * Setter for <code>public.log.item_id</code>.
	 */
	public void setItemId(Long value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.log.item_id</code>.
	 */
	public Long getItemId() {
		return (Long) get(3);
	}

	/**
	 * Setter for <code>public.log.last_modified</code>.
	 */
	public void setLastModified(Timestamp value) {
		set(4, value);
	}

	/**
	 * Getter for <code>public.log.last_modified</code>.
	 */
	public Timestamp getLastModified() {
		return (Timestamp) get(4);
	}

	/**
	 * Setter for <code>public.log.log_level</code>.
	 */
	public void setLogLevel(Integer value) {
		set(5, value);
	}

	/**
	 * Getter for <code>public.log.log_level</code>.
	 */
	public Integer getLogLevel() {
		return (Integer) get(5);
	}

	/**
	 * Setter for <code>public.log.file_path</code>.
	 */
	public void setFilePath(String value) {
		set(6, value);
	}

	/**
	 * Getter for <code>public.log.file_path</code>.
	 */
	public String getFilePath() {
		return (String) get(6);
	}

	/**
	 * Setter for <code>public.log.thumbnail_file_path</code>.
	 */
	public void setThumbnailFilePath(String value) {
		set(7, value);
	}

	/**
	 * Getter for <code>public.log.thumbnail_file_path</code>.
	 */
	public String getThumbnailFilePath() {
		return (String) get(7);
	}

	/**
	 * Setter for <code>public.log.content_type</code>.
	 */
	public void setContentType(String value) {
		set(8, value);
	}

	/**
	 * Getter for <code>public.log.content_type</code>.
	 */
	public String getContentType() {
		return (String) get(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Long, Timestamp, String, Long, Timestamp, Integer, String, String, String> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Long, Timestamp, String, Long, Timestamp, Integer, String, String, String> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JLog.LOG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field2() {
		return JLog.LOG.LOG_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return JLog.LOG.LOG_MESSAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return JLog.LOG.ITEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return JLog.LOG.LAST_MODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return JLog.LOG.LOG_LEVEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return JLog.LOG.FILE_PATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return JLog.LOG.THUMBNAIL_FILE_PATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return JLog.LOG.CONTENT_TYPE;
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
	public Timestamp component2() {
		return getLogTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component3() {
		return getLogMessage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component4() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp component5() {
		return getLastModified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer component6() {
		return getLogLevel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component7() {
		return getFilePath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component8() {
		return getThumbnailFilePath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component9() {
		return getContentType();
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
	public Timestamp value2() {
		return getLogTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLogMessage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getLastModified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getLogLevel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getFilePath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getThumbnailFilePath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getContentType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLogRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLogRecord value2(Timestamp value) {
		setLogTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLogRecord value3(String value) {
		setLogMessage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLogRecord value4(Long value) {
		setItemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLogRecord value5(Timestamp value) {
		setLastModified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLogRecord value6(Integer value) {
		setLogLevel(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLogRecord value7(String value) {
		setFilePath(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLogRecord value8(String value) {
		setThumbnailFilePath(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLogRecord value9(String value) {
		setContentType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLogRecord values(Long value1, Timestamp value2, String value3, Long value4, Timestamp value5, Integer value6, String value7,
			String value8, String value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JLogRecord
	 */
	public JLogRecord() {
		super(JLog.LOG);
	}

	/**
	 * Create a detached, initialised JLogRecord
	 */
	public JLogRecord(Long id, Timestamp logTime, String logMessage, Long itemId, Timestamp lastModified, Integer logLevel, String filePath,
			String thumbnailFilePath, String contentType) {
		super(JLog.LOG);

		set(0, id);
		set(1, logTime);
		set(2, logMessage);
		set(3, itemId);
		set(4, lastModified);
		set(5, logLevel);
		set(6, filePath);
		set(7, thumbnailFilePath);
		set(8, contentType);
	}
}

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
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JLogRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.11" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JLog extends TableImpl<JLogRecord> {

	private static final long serialVersionUID = 1606235672;

	/**
	 * The reference instance of <code>public.log</code>
	 */
	public static final JLog LOG = new JLog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JLogRecord> getRecordType() {
		return JLogRecord.class;
	}

	/**
	 * The column <code>public.log.id</code>.
	 */
	public final TableField<JLogRecord, Long> ID = createField("id",
			org.jooq.impl.SQLDataType.BIGINT.nullable(false)
					.defaultValue(org.jooq.impl.DSL.field("nextval('log_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)),
			this,
			""
	);

	/**
	 * The column <code>public.log.uuid</code>.
	 */
	public final TableField<JLogRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

	/**
	 * The column <code>public.log.log_time</code>.
	 */
	public final TableField<JLogRecord, Timestamp> LOG_TIME = createField("log_time",
			org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false),
			this,
			""
	);

	/**
	 * The column <code>public.log.log_message</code>.
	 */
	public final TableField<JLogRecord, String> LOG_MESSAGE = createField("log_message",
			org.jooq.impl.SQLDataType.CLOB.nullable(false),
			this,
			""
	);

	/**
	 * The column <code>public.log.item_id</code>.
	 */
	public final TableField<JLogRecord, Long> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.log.launch_id</code>.
	 */
	public final TableField<JLogRecord, Long> LAUNCH_ID = createField("launch_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.log.last_modified</code>.
	 */
	public final TableField<JLogRecord, Timestamp> LAST_MODIFIED = createField("last_modified",
			org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false),
			this,
			""
	);

	/**
	 * The column <code>public.log.log_level</code>.
	 */
	public final TableField<JLogRecord, Integer> LOG_LEVEL = createField("log_level",
			org.jooq.impl.SQLDataType.INTEGER.nullable(false),
			this,
			""
	);

	/**
	 * The column <code>public.log.attachment_id</code>.
	 */
	public final TableField<JLogRecord, Long> ATTACHMENT_ID = createField("attachment_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.log</code> table reference
	 */
	public JLog() {
		this(DSL.name("log"), null);
	}

	/**
	 * Create an aliased <code>public.log</code> table reference
	 */
	public JLog(String alias) {
		this(DSL.name(alias), LOG);
	}

	/**
	 * Create an aliased <code>public.log</code> table reference
	 */
	public JLog(Name alias) {
		this(alias, LOG);
	}

	private JLog(Name alias, Table<JLogRecord> aliased) {
		this(alias, aliased, null);
	}

	private JLog(Name alias, Table<JLogRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, DSL.comment(""));
	}

	public <O extends Record> JLog(Table<O> child, ForeignKey<O, JLogRecord> key) {
		super(child, key, LOG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return JPublic.PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Index> getIndexes() {
		return Arrays.<Index>asList(Indexes.LOG_MESSAGE_TRGM_IDX,
				Indexes.LOG_PK,
				Indexes.LOG_TI_IDX,
				Indexes.LOG_UUID_IDX,
				Indexes.LOG_UUID_KEY
		);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JLogRecord, Long> getIdentity() {
		return Keys.IDENTITY_LOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JLogRecord> getPrimaryKey() {
		return Keys.LOG_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JLogRecord>> getKeys() {
		return Arrays.<UniqueKey<JLogRecord>>asList(Keys.LOG_PK, Keys.LOG_UUID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JLogRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JLogRecord, ?>>asList(Keys.LOG__LOG_ITEM_ID_FKEY,
				Keys.LOG__LOG_LAUNCH_ID_FKEY,
				Keys.LOG__LOG_ATTACHMENT_ID_FKEY
		);
	}

	public JTestItem testItem() {
		return new JTestItem(this, Keys.LOG__LOG_ITEM_ID_FKEY);
	}

	public JLaunch launch() {
		return new JLaunch(this, Keys.LOG__LOG_LAUNCH_ID_FKEY);
	}

	public JAttachment attachment() {
		return new JAttachment(this, Keys.LOG__LOG_ATTACHMENT_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLog as(String alias) {
		return new JLog(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLog as(Name alias) {
		return new JLog(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JLog rename(String name) {
		return new JLog(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JLog rename(Name name) {
		return new JLog(name, null);
	}
}

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
import com.epam.ta.reportportal.jooq.tables.records.JRestorePasswordBidRecord;
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
public class JRestorePasswordBid extends TableImpl<JRestorePasswordBidRecord> {

	private static final long serialVersionUID = 686111723;

	/**
	 * The reference instance of <code>public.restore_password_bid</code>
	 */
	public static final JRestorePasswordBid RESTORE_PASSWORD_BID = new JRestorePasswordBid();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JRestorePasswordBidRecord> getRecordType() {
		return JRestorePasswordBidRecord.class;
	}

	/**
	 * The column <code>public.restore_password_bid.uuid</code>.
	 */
	public final TableField<JRestorePasswordBidRecord, String> UUID = createField("uuid",
			org.jooq.impl.SQLDataType.VARCHAR.nullable(false),
			this,
			""
	);

	/**
	 * The column <code>public.restore_password_bid.last_modified</code>.
	 */
	public final TableField<JRestorePasswordBidRecord, Timestamp> LAST_MODIFIED = createField("last_modified",
			org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)),
			this,
			""
	);

	/**
	 * The column <code>public.restore_password_bid.email</code>.
	 */
	public final TableField<JRestorePasswordBidRecord, String> EMAIL = createField("email",
			org.jooq.impl.SQLDataType.VARCHAR.nullable(false),
			this,
			""
	);

	/**
	 * Create a <code>public.restore_password_bid</code> table reference
	 */
	public JRestorePasswordBid() {
		this(DSL.name("restore_password_bid"), null);
	}

	/**
	 * Create an aliased <code>public.restore_password_bid</code> table reference
	 */
	public JRestorePasswordBid(String alias) {
		this(DSL.name(alias), RESTORE_PASSWORD_BID);
	}

	/**
	 * Create an aliased <code>public.restore_password_bid</code> table reference
	 */
	public JRestorePasswordBid(Name alias) {
		this(alias, RESTORE_PASSWORD_BID);
	}

	private JRestorePasswordBid(Name alias, Table<JRestorePasswordBidRecord> aliased) {
		this(alias, aliased, null);
	}

	private JRestorePasswordBid(Name alias, Table<JRestorePasswordBidRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, DSL.comment(""));
	}

	public <O extends Record> JRestorePasswordBid(Table<O> child, ForeignKey<O, JRestorePasswordBidRecord> key) {
		super(child, key, RESTORE_PASSWORD_BID);
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
		return Arrays.<Index>asList(Indexes.RESTORE_PASSWORD_BID_EMAIL_KEY, Indexes.RESTORE_PASSWORD_BID_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JRestorePasswordBidRecord> getPrimaryKey() {
		return Keys.RESTORE_PASSWORD_BID_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JRestorePasswordBidRecord>> getKeys() {
		return Arrays.<UniqueKey<JRestorePasswordBidRecord>>asList(Keys.RESTORE_PASSWORD_BID_PK, Keys.RESTORE_PASSWORD_BID_EMAIL_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JRestorePasswordBid as(String alias) {
		return new JRestorePasswordBid(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JRestorePasswordBid as(Name alias) {
		return new JRestorePasswordBid(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JRestorePasswordBid rename(String name) {
		return new JRestorePasswordBid(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JRestorePasswordBid rename(Name name) {
		return new JRestorePasswordBid(name, null);
	}
}

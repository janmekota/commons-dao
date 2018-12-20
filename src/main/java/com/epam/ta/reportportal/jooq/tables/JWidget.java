/*
 * Copyright (C) 2018 EPAM Systems
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
import com.epam.ta.reportportal.jooq.tables.records.JWidgetRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.7" }, comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JWidget extends TableImpl<JWidgetRecord> {

	private static final long serialVersionUID = 1276587978;

	/**
	 * The reference instance of <code>public.widget</code>
	 */
	public static final JWidget WIDGET = new JWidget();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JWidgetRecord> getRecordType() {
		return JWidgetRecord.class;
	}

	/**
	 * The column <code>public.widget.id</code>.
	 */
	public final TableField<JWidgetRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.widget.name</code>.
	 */
	public final TableField<JWidgetRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>public.widget.description</code>.
	 */
	public final TableField<JWidgetRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.widget.widget_type</code>.
	 */
	public final TableField<JWidgetRecord, String> WIDGET_TYPE = createField(
			"widget_type",
			org.jooq.impl.SQLDataType.VARCHAR.nullable(false),
			this,
			""
	);

	/**
	 * The column <code>public.widget.items_count</code>.
	 */
	public final TableField<JWidgetRecord, Short> ITEMS_COUNT = createField("items_count", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>public.widget.widget_options</code>.
	 */
	public final TableField<JWidgetRecord, Object> WIDGET_OPTIONS = createField(
			"widget_options",
			org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""),
			this,
			""
	);

	/**
	 * Create a <code>public.widget</code> table reference
	 */
	public JWidget() {
		this(DSL.name("widget"), null);
	}

	/**
	 * Create an aliased <code>public.widget</code> table reference
	 */
	public JWidget(String alias) {
		this(DSL.name(alias), WIDGET);
	}

	/**
	 * Create an aliased <code>public.widget</code> table reference
	 */
	public JWidget(Name alias) {
		this(alias, WIDGET);
	}

	private JWidget(Name alias, Table<JWidgetRecord> aliased) {
		this(alias, aliased, null);
	}

	private JWidget(Name alias, Table<JWidgetRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, DSL.comment(""));
	}

	public <O extends Record> JWidget(Table<O> child, ForeignKey<O, JWidgetRecord> key) {
		super(child, key, WIDGET);
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
		return Arrays.<Index>asList(Indexes.WIDGET_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JWidgetRecord> getPrimaryKey() {
		return Keys.WIDGET_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JWidgetRecord>> getKeys() {
		return Arrays.<UniqueKey<JWidgetRecord>>asList(Keys.WIDGET_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JWidgetRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JWidgetRecord, ?>>asList(Keys.WIDGET__WIDGET_ID_FK);
	}

	public JShareableEntity shareableEntity() {
		return new JShareableEntity(this, Keys.WIDGET__WIDGET_ID_FK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JWidget as(String alias) {
		return new JWidget(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JWidget as(Name alias) {
		return new JWidget(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JWidget rename(String name) {
		return new JWidget(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JWidget rename(Name name) {
		return new JWidget(name, null);
	}
}

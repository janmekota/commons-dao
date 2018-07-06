/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JContentFieldRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JContentField extends TableImpl<JContentFieldRecord> {

	private static final long serialVersionUID = 1675762798;

	/**
	 * The reference instance of <code>public.content_field</code>
	 */
	public static final JContentField CONTENT_FIELD = new JContentField();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JContentFieldRecord> getRecordType() {
		return JContentFieldRecord.class;
	}

	/**
	 * The column <code>public.content_field.id</code>.
	 */
	public final TableField<JContentFieldRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.content_field.field</code>.
	 */
	public final TableField<JContentFieldRecord, String> FIELD = createField(
			"field", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * Create a <code>public.content_field</code> table reference
	 */
	public JContentField() {
		this(DSL.name("content_field"), null);
	}

	/**
	 * Create an aliased <code>public.content_field</code> table reference
	 */
	public JContentField(String alias) {
		this(DSL.name(alias), CONTENT_FIELD);
	}

	/**
	 * Create an aliased <code>public.content_field</code> table reference
	 */
	public JContentField(Name alias) {
		this(alias, CONTENT_FIELD);
	}

	private JContentField(Name alias, Table<JContentFieldRecord> aliased) {
		this(alias, aliased, null);
	}

	private JContentField(Name alias, Table<JContentFieldRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, "");
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
	public List<ForeignKey<JContentFieldRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JContentFieldRecord, ?>>asList(Keys.CONTENT_FIELD__CONTENT_FIELD_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JContentField as(String alias) {
		return new JContentField(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JContentField as(Name alias) {
		return new JContentField(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JContentField rename(String name) {
		return new JContentField(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JContentField rename(Name name) {
		return new JContentField(name, null);
	}
}

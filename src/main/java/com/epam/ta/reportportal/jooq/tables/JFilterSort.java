/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.enums.JSortDirectionEnum;
import com.epam.ta.reportportal.jooq.tables.records.JFilterSortRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JFilterSort extends TableImpl<JFilterSortRecord> {

    private static final long serialVersionUID = -471324172;

    /**
     * The reference instance of <code>public.filter_sort</code>
     */
    public static final JFilterSort FILTER_SORT = new JFilterSort();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JFilterSortRecord> getRecordType() {
        return JFilterSortRecord.class;
    }

    /**
     * The column <code>public.filter_sort.id</code>.
     */
    public final TableField<JFilterSortRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('filter_sort_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.filter_sort.filter_id</code>.
     */
    public final TableField<JFilterSortRecord, Long> FILTER_ID = createField("filter_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.filter_sort.field</code>.
     */
    public final TableField<JFilterSortRecord, String> FIELD = createField("field", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.filter_sort.direction</code>.
     */
    public final TableField<JFilterSortRecord, JSortDirectionEnum> DIRECTION = createField("direction", org.jooq.impl.SQLDataType.VARCHAR.nullable(false).defaultValue(org.jooq.impl.DSL.field("'ASC'::sort_direction_enum", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.epam.ta.reportportal.jooq.enums.JSortDirectionEnum.class), this, "");

    /**
     * Create a <code>public.filter_sort</code> table reference
     */
    public JFilterSort() {
        this(DSL.name("filter_sort"), null);
    }

    /**
     * Create an aliased <code>public.filter_sort</code> table reference
     */
    public JFilterSort(String alias) {
        this(DSL.name(alias), FILTER_SORT);
    }

    /**
     * Create an aliased <code>public.filter_sort</code> table reference
     */
    public JFilterSort(Name alias) {
        this(alias, FILTER_SORT);
    }

    private JFilterSort(Name alias, Table<JFilterSortRecord> aliased) {
        this(alias, aliased, null);
    }

    private JFilterSort(Name alias, Table<JFilterSortRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JFilterSort(Table<O> child, ForeignKey<O, JFilterSortRecord> key) {
        super(child, key, FILTER_SORT);
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
        return Arrays.<Index>asList(Indexes.FILTER_SORT_FILTER_IDX, Indexes.FILTER_SORT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JFilterSortRecord, Long> getIdentity() {
        return Keys.IDENTITY_FILTER_SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JFilterSortRecord> getPrimaryKey() {
        return Keys.FILTER_SORT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JFilterSortRecord>> getKeys() {
        return Arrays.<UniqueKey<JFilterSortRecord>>asList(Keys.FILTER_SORT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JFilterSortRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JFilterSortRecord, ?>>asList(Keys.FILTER_SORT__FILTER_SORT_FILTER_ID_FKEY);
    }

    public JFilter filter() {
        return new JFilter(this, Keys.FILTER_SORT__FILTER_SORT_FILTER_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterSort as(String alias) {
        return new JFilterSort(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterSort as(Name alias) {
        return new JFilterSort(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JFilterSort rename(String name) {
        return new JFilterSort(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JFilterSort rename(Name name) {
        return new JFilterSort(name, null);
    }
}

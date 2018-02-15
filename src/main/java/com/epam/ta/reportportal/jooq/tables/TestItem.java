/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.Public;
import com.epam.ta.reportportal.jooq.enums.TestItemTypeEnum;
import com.epam.ta.reportportal.jooq.tables.records.TestItemRecord;
import com.epam.ta.reportportal.jooq.udt.records.ParameterRecord;
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
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestItem extends TableImpl<TestItemRecord> {

    private static final long serialVersionUID = 1403360555;

    /**
     * The reference instance of <code>public.test_item</code>
     */
    public static final TestItem TEST_ITEM = new TestItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestItemRecord> getRecordType() {
        return TestItemRecord.class;
    }

    /**
     * The column <code>public.test_item.id</code>.
     */
    public final TableField<TestItemRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test_item_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.test_item.name</code>.
     */
    public final TableField<TestItemRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.test_item.type</code>.
     */
    public final TableField<TestItemRecord, TestItemTypeEnum> TYPE = createField("type", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.jooq.enums.TestItemTypeEnum.class), this, "");

    /**
     * The column <code>public.test_item.start_time</code>.
     */
    public final TableField<TestItemRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.test_item.description</code>.
     */
    public final TableField<TestItemRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.test_item.parameters</code>.
     */
    public final TableField<TestItemRecord, ParameterRecord[]> PARAMETERS = createField("parameters", com.epam.ta.reportportal.jooq.udt.Parameter.PARAMETER.getDataType().getArrayDataType(), this, "");

    /**
     * The column <code>public.test_item.last_modified</code>.
     */
    public final TableField<TestItemRecord, Timestamp> LAST_MODIFIED = createField("last_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.test_item.unique_id</code>.
     */
    public final TableField<TestItemRecord, String> UNIQUE_ID = createField("unique_id", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * Create a <code>public.test_item</code> table reference
     */
    public TestItem() {
        this(DSL.name("test_item"), null);
    }

    /**
     * Create an aliased <code>public.test_item</code> table reference
     */
    public TestItem(String alias) {
        this(DSL.name(alias), TEST_ITEM);
    }

    /**
     * Create an aliased <code>public.test_item</code> table reference
     */
    public TestItem(Name alias) {
        this(alias, TEST_ITEM);
    }

    private TestItem(Name alias, Table<TestItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestItem(Name alias, Table<TestItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TEST_ITEM_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TestItemRecord, Long> getIdentity() {
        return Keys.IDENTITY_TEST_ITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestItemRecord> getPrimaryKey() {
        return Keys.TEST_ITEM_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestItemRecord>> getKeys() {
        return Arrays.<UniqueKey<TestItemRecord>>asList(Keys.TEST_ITEM_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestItem as(String alias) {
        return new TestItem(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestItem as(Name alias) {
        return new TestItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TestItem rename(String name) {
        return new TestItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TestItem rename(Name name) {
        return new TestItem(name, null);
    }
}

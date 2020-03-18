/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.enums.JTestItemTypeEnum;
import com.epam.ta.reportportal.jooq.tables.records.JTestItemRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
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
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTestItem extends TableImpl<JTestItemRecord> {

    private static final long serialVersionUID = -1944533377;

    /**
     * The reference instance of <code>public.test_item</code>
     */
    public static final JTestItem TEST_ITEM = new JTestItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTestItemRecord> getRecordType() {
        return JTestItemRecord.class;
    }

    /**
     * The column <code>public.test_item.item_id</code>.
     */
    public final TableField<JTestItemRecord, Long> ITEM_ID = createField(DSL.name("item_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test_item_item_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.test_item.uuid</code>.
     */
    public final TableField<JTestItemRecord, String> UUID = createField(DSL.name("uuid"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.test_item.name</code>.
     */
    public final TableField<JTestItemRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>public.test_item.code_ref</code>.
     */
    public final TableField<JTestItemRecord, String> CODE_REF = createField(DSL.name("code_ref"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.test_item.type</code>.
     */
    public final TableField<JTestItemRecord, JTestItemTypeEnum> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(com.epam.ta.reportportal.jooq.enums.JTestItemTypeEnum.class), this, "");

    /**
     * The column <code>public.test_item.start_time</code>.
     */
    public final TableField<JTestItemRecord, Timestamp> START_TIME = createField(DSL.name("start_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.test_item.description</code>.
     */
    public final TableField<JTestItemRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.test_item.last_modified</code>.
     */
    public final TableField<JTestItemRecord, Timestamp> LAST_MODIFIED = createField(DSL.name("last_modified"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.test_item.path</code>.
     */
    public final TableField<JTestItemRecord, Object> PATH = createField(DSL.name("path"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"ltree\""), this, "");

    /**
     * The column <code>public.test_item.unique_id</code>.
     */
    public final TableField<JTestItemRecord, String> UNIQUE_ID = createField(DSL.name("unique_id"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>public.test_item.test_case_id</code>.
     */
    public final TableField<JTestItemRecord, String> TEST_CASE_ID = createField(DSL.name("test_case_id"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>public.test_item.has_children</code>.
     */
    public final TableField<JTestItemRecord, Boolean> HAS_CHILDREN = createField(DSL.name("has_children"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.test_item.has_retries</code>.
     */
    public final TableField<JTestItemRecord, Boolean> HAS_RETRIES = createField(DSL.name("has_retries"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.test_item.has_stats</code>.
     */
    public final TableField<JTestItemRecord, Boolean> HAS_STATS = createField(DSL.name("has_stats"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.test_item.parent_id</code>.
     */
    public final TableField<JTestItemRecord, Long> PARENT_ID = createField(DSL.name("parent_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.test_item.retry_of</code>.
     */
    public final TableField<JTestItemRecord, Long> RETRY_OF = createField(DSL.name("retry_of"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.test_item.launch_id</code>.
     */
    public final TableField<JTestItemRecord, Long> LAUNCH_ID = createField(DSL.name("launch_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.test_item.test_case_hash</code>.
     */
    public final TableField<JTestItemRecord, Integer> TEST_CASE_HASH = createField(DSL.name("test_case_hash"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.test_item</code> table reference
     */
    public JTestItem() {
        this(DSL.name("test_item"), null);
    }

    /**
     * Create an aliased <code>public.test_item</code> table reference
     */
    public JTestItem(String alias) {
        this(DSL.name(alias), TEST_ITEM);
    }

    /**
     * Create an aliased <code>public.test_item</code> table reference
     */
    public JTestItem(Name alias) {
        this(alias, TEST_ITEM);
    }

    private JTestItem(Name alias, Table<JTestItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTestItem(Name alias, Table<JTestItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JTestItem(Table<O> child, ForeignKey<O, JTestItemRecord> key) {
        super(child, key, TEST_ITEM);
    }

    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ITEM_TEST_CASE_ID_IDX, Indexes.ITEM_TEST_CASE_ID_LAUNCH_ID_IDX, Indexes.PATH_GIST_IDX, Indexes.PATH_IDX, Indexes.TEST_CASE_HASH_IDX, Indexes.TEST_CASE_HASH_LAUNCH_ID_IDX, Indexes.TEST_ITEM_PK, Indexes.TEST_ITEM_UNIQUE_ID_IDX, Indexes.TEST_ITEM_UNIQUE_ID_LAUNCH_ID_IDX, Indexes.TEST_ITEM_UUID_KEY, Indexes.TI_LAUNCH_IDX, Indexes.TI_PARENT_IDX, Indexes.TI_RETRY_OF_IDX, Indexes.TI_UUID_IDX);
    }

    @Override
    public Identity<JTestItemRecord, Long> getIdentity() {
        return Keys.IDENTITY_TEST_ITEM;
    }

    @Override
    public UniqueKey<JTestItemRecord> getPrimaryKey() {
        return Keys.TEST_ITEM_PK;
    }

    @Override
    public List<UniqueKey<JTestItemRecord>> getKeys() {
        return Arrays.<UniqueKey<JTestItemRecord>>asList(Keys.TEST_ITEM_PK, Keys.TEST_ITEM_UUID_KEY);
    }

    @Override
    public List<ForeignKey<JTestItemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JTestItemRecord, ?>>asList(Keys.TEST_ITEM__TEST_ITEM_PARENT_ID_FKEY, Keys.TEST_ITEM__TEST_ITEM_RETRY_OF_FKEY, Keys.TEST_ITEM__TEST_ITEM_LAUNCH_ID_FKEY);
    }

    public com.epam.ta.reportportal.jooq.tables.JTestItem testItem_TestItemParentIdFkey() {
        return new com.epam.ta.reportportal.jooq.tables.JTestItem(this, Keys.TEST_ITEM__TEST_ITEM_PARENT_ID_FKEY);
    }

    public com.epam.ta.reportportal.jooq.tables.JTestItem testItem_TestItemRetryOfFkey() {
        return new com.epam.ta.reportportal.jooq.tables.JTestItem(this, Keys.TEST_ITEM__TEST_ITEM_RETRY_OF_FKEY);
    }

    public JLaunch launch() {
        return new JLaunch(this, Keys.TEST_ITEM__TEST_ITEM_LAUNCH_ID_FKEY);
    }

    @Override
    public JTestItem as(String alias) {
        return new JTestItem(DSL.name(alias), this);
    }

    @Override
    public JTestItem as(Name alias) {
        return new JTestItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTestItem rename(String name) {
        return new JTestItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTestItem rename(Name name) {
        return new JTestItem(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, String, String, String, JTestItemTypeEnum, Timestamp, String, Timestamp, Object, String, String, Boolean, Boolean, Boolean, Long, Long, Long, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}

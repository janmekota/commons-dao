/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JShareableEntityRecord;

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
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JShareableEntity extends TableImpl<JShareableEntityRecord> {

    private static final long serialVersionUID = -342136813;

    /**
     * The reference instance of <code>public.shareable_entity</code>
     */
    public static final JShareableEntity SHAREABLE_ENTITY = new JShareableEntity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JShareableEntityRecord> getRecordType() {
        return JShareableEntityRecord.class;
    }

    /**
     * The column <code>public.shareable_entity.id</code>.
     */
    public final TableField<JShareableEntityRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('shareable_entity_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.shareable_entity.shared</code>.
     */
    public final TableField<JShareableEntityRecord, Boolean> SHARED = createField("shared", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.shareable_entity.owner</code>.
     */
    public final TableField<JShareableEntityRecord, String> OWNER = createField("owner", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.shareable_entity.project_id</code>.
     */
    public final TableField<JShareableEntityRecord, Long> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.shareable_entity</code> table reference
     */
    public JShareableEntity() {
        this(DSL.name("shareable_entity"), null);
    }

    /**
     * Create an aliased <code>public.shareable_entity</code> table reference
     */
    public JShareableEntity(String alias) {
        this(DSL.name(alias), SHAREABLE_ENTITY);
    }

    /**
     * Create an aliased <code>public.shareable_entity</code> table reference
     */
    public JShareableEntity(Name alias) {
        this(alias, SHAREABLE_ENTITY);
    }

    private JShareableEntity(Name alias, Table<JShareableEntityRecord> aliased) {
        this(alias, aliased, null);
    }

    private JShareableEntity(Name alias, Table<JShareableEntityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JShareableEntity(Table<O> child, ForeignKey<O, JShareableEntityRecord> key) {
        super(child, key, SHAREABLE_ENTITY);
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
        return Arrays.<Index>asList(Indexes.SHAREABLE_PK, Indexes.SHARED_ENTITY_OWNERX, Indexes.SHARED_ENTITY_PROJECT_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JShareableEntityRecord, Long> getIdentity() {
        return Keys.IDENTITY_SHAREABLE_ENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JShareableEntityRecord> getPrimaryKey() {
        return Keys.SHAREABLE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JShareableEntityRecord>> getKeys() {
        return Arrays.<UniqueKey<JShareableEntityRecord>>asList(Keys.SHAREABLE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JShareableEntityRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JShareableEntityRecord, ?>>asList(Keys.SHAREABLE_ENTITY__SHAREABLE_ENTITY_OWNER_FKEY, Keys.SHAREABLE_ENTITY__SHAREABLE_ENTITY_PROJECT_ID_FKEY);
    }

    public JUsers users() {
        return new JUsers(this, Keys.SHAREABLE_ENTITY__SHAREABLE_ENTITY_OWNER_FKEY);
    }

    public JProject project() {
        return new JProject(this, Keys.SHAREABLE_ENTITY__SHAREABLE_ENTITY_PROJECT_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JShareableEntity as(String alias) {
        return new JShareableEntity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JShareableEntity as(Name alias) {
        return new JShareableEntity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JShareableEntity rename(String name) {
        return new JShareableEntity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JShareableEntity rename(Name name) {
        return new JShareableEntity(name, null);
    }
}

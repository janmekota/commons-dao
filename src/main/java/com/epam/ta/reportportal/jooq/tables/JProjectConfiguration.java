/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.enums.JProjectTypeEnum;
import com.epam.ta.reportportal.jooq.tables.records.JProjectConfigurationRecord;
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
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JProjectConfiguration extends TableImpl<JProjectConfigurationRecord> {

    private static final long serialVersionUID = 1778011419;

    /**
     * The reference instance of <code>public.project_configuration</code>
     */
    public static final JProjectConfiguration PROJECT_CONFIGURATION = new JProjectConfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JProjectConfigurationRecord> getRecordType() {
        return JProjectConfigurationRecord.class;
    }

    /**
     * The column <code>public.project_configuration.id</code>.
     */
    public final TableField<JProjectConfigurationRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.project_configuration.project_type</code>.
     */
    public final TableField<JProjectConfigurationRecord, JProjectTypeEnum> PROJECT_TYPE = createField("project_type", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.jooq.enums.JProjectTypeEnum.class), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @Deprecated
    public final TableField<JProjectConfigurationRecord, Object> INTERRUPT_TIMEOUT = createField("interrupt_timeout", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @Deprecated
    public final TableField<JProjectConfigurationRecord, Object> KEEP_LOGS_INTERVAL = createField("keep_logs_interval", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @Deprecated
    public final TableField<JProjectConfigurationRecord, Object> KEEP_SCREENSHOTS_INTERVAL = createField("keep_screenshots_interval", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), this, "");

    /**
     * The column <code>public.project_configuration.aa_enabled</code>.
     */
    public final TableField<JProjectConfigurationRecord, Boolean> AA_ENABLED = createField("aa_enabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @Deprecated
    public final TableField<JProjectConfigurationRecord, Object> METADATA = createField("metadata", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), this, "");

    /**
     * The column <code>public.project_configuration.email_configuration_id</code>.
     */
    public final TableField<JProjectConfigurationRecord, Long> EMAIL_CONFIGURATION_ID = createField("email_configuration_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.project_configuration.created_on</code>.
     */
    public final TableField<JProjectConfigurationRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.project_configuration</code> table reference
     */
    public JProjectConfiguration() {
        this(DSL.name("project_configuration"), null);
    }

    /**
     * Create an aliased <code>public.project_configuration</code> table reference
     */
    public JProjectConfiguration(String alias) {
        this(DSL.name(alias), PROJECT_CONFIGURATION);
    }

    /**
     * Create an aliased <code>public.project_configuration</code> table reference
     */
    public JProjectConfiguration(Name alias) {
        this(alias, PROJECT_CONFIGURATION);
    }

    private JProjectConfiguration(Name alias, Table<JProjectConfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private JProjectConfiguration(Name alias, Table<JProjectConfigurationRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_KEY, Indexes.PROJECT_CONFIGURATION_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JProjectConfigurationRecord> getPrimaryKey() {
        return Keys.PROJECT_CONFIGURATION_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JProjectConfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<JProjectConfigurationRecord>>asList(Keys.PROJECT_CONFIGURATION_PK, Keys.PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JProjectConfigurationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JProjectConfigurationRecord, ?>>asList(Keys.PROJECT_CONFIGURATION__PROJECT_CONFIGURATION_ID_FKEY, Keys.PROJECT_CONFIGURATION__PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectConfiguration as(String alias) {
        return new JProjectConfiguration(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectConfiguration as(Name alias) {
        return new JProjectConfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JProjectConfiguration rename(String name) {
        return new JProjectConfiguration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JProjectConfiguration rename(Name name) {
        return new JProjectConfiguration(name, null);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JIssueTicketRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
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
public class JIssueTicket extends TableImpl<JIssueTicketRecord> {

	private static final long serialVersionUID = 1964506462;

    /**
     * The reference instance of <code>public.issue_ticket</code>
     */
    public static final JIssueTicket ISSUE_TICKET = new JIssueTicket();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JIssueTicketRecord> getRecordType() {
        return JIssueTicketRecord.class;
    }

    /**
     * The column <code>public.issue_ticket.issue_id</code>.
     */
    public final TableField<JIssueTicketRecord, Long> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.issue_ticket.ticket_id</code>.
     */
    public final TableField<JIssueTicketRecord, Long> TICKET_ID = createField("ticket_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.issue_ticket</code> table reference
     */
    public JIssueTicket() {
        this(DSL.name("issue_ticket"), null);
    }

    /**
     * Create an aliased <code>public.issue_ticket</code> table reference
     */
    public JIssueTicket(String alias) {
        this(DSL.name(alias), ISSUE_TICKET);
    }

    /**
     * Create an aliased <code>public.issue_ticket</code> table reference
     */
    public JIssueTicket(Name alias) {
        this(alias, ISSUE_TICKET);
    }

    private JIssueTicket(Name alias, Table<JIssueTicketRecord> aliased) {
        this(alias, aliased, null);
    }

    private JIssueTicket(Name alias, Table<JIssueTicketRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ISSUE_TICKET_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JIssueTicketRecord> getPrimaryKey() {
        return Keys.ISSUE_TICKET_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JIssueTicketRecord>> getKeys() {
        return Arrays.<UniqueKey<JIssueTicketRecord>>asList(Keys.ISSUE_TICKET_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JIssueTicketRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JIssueTicketRecord, ?>>asList(Keys.ISSUE_TICKET__ISSUE_TICKET_ISSUE_ID_FKEY, Keys.ISSUE_TICKET__ISSUE_TICKET_TICKET_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIssueTicket as(String alias) {
        return new JIssueTicket(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIssueTicket as(Name alias) {
        return new JIssueTicket(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JIssueTicket rename(String name) {
        return new JIssueTicket(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JIssueTicket rename(Name name) {
        return new JIssueTicket(name, null);
    }
}

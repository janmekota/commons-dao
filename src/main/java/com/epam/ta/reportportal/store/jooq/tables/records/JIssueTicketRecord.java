/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.tables.JIssueTicket;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIssueTicketRecord extends UpdatableRecordImpl<JIssueTicketRecord> implements Record2<Long, Long> {

	private static final long serialVersionUID = -365270463;

	/**
	 * Setter for <code>public.issue_ticket.issue_id</code>.
	 */
	public void setIssueId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.issue_ticket.issue_id</code>.
	 */
	public Long getIssueId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.issue_ticket.ticket_id</code>.
	 */
	public void setTicketId(Long value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.issue_ticket.ticket_id</code>.
	 */
	public Long getTicketId() {
		return (Long) get(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Long, Long> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JIssueTicket.ISSUE_TICKET.ISSUE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return JIssueTicket.ISSUE_TICKET.TICKET_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getIssueId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component2() {
		return getTicketId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getIssueId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getTicketId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueTicketRecord value1(Long value) {
		setIssueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueTicketRecord value2(Long value) {
		setTicketId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueTicketRecord values(Long value1, Long value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JIssueTicketRecord
	 */
	public JIssueTicketRecord() {
		super(JIssueTicket.ISSUE_TICKET);
	}

	/**
	 * Create a detached, initialised JIssueTicketRecord
	 */
	public JIssueTicketRecord(Long issueId, Long ticketId) {
		super(JIssueTicket.ISSUE_TICKET);

		set(0, issueId);
		set(1, ticketId);
	}
}

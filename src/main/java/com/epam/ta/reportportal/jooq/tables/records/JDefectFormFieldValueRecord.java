/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JDefectFormFieldValue;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import javax.annotation.Generated;

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
public class JDefectFormFieldValueRecord extends TableRecordImpl<JDefectFormFieldValueRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1295925885;

    /**
     * Setter for <code>public.defect_form_field_value.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.defect_form_field_value.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.defect_form_field_value.values</code>.
     */
    public void setValues(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.defect_form_field_value.values</code>.
     */
    public String getValues() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JDefectFormFieldValue.DEFECT_FORM_FIELD_VALUE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JDefectFormFieldValue.DEFECT_FORM_FIELD_VALUE.VALUES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getValues();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getValues();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDefectFormFieldValueRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDefectFormFieldValueRecord value2(String value) {
        setValues(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDefectFormFieldValueRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JDefectFormFieldValueRecord
     */
    public JDefectFormFieldValueRecord() {
        super(JDefectFormFieldValue.DEFECT_FORM_FIELD_VALUE);
    }

    /**
     * Create a detached, initialised JDefectFormFieldValueRecord
     */
    public JDefectFormFieldValueRecord(Long id, String values) {
        super(JDefectFormFieldValue.DEFECT_FORM_FIELD_VALUE);

        set(0, id);
        set(1, values);
    }
}

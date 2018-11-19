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
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.tables.JWidgetOption;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JWidgetOptionRecord extends UpdatableRecordImpl<JWidgetOptionRecord> implements Record4<Long, Long, String, String> {

    private static final long serialVersionUID = 1580224862;

    /**
     * Setter for <code>public.widget_option.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.widget_option.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.widget_option.widget_id</code>.
     */
    public void setWidgetId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.widget_option.widget_id</code>.
     */
    public Long getWidgetId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.widget_option.option</code>.
     */
    public void setOption(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.widget_option.option</code>.
     */
    public String getOption() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.widget_option.value</code>.
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.widget_option.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JWidgetOption.WIDGET_OPTION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return JWidgetOption.WIDGET_OPTION.WIDGET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JWidgetOption.WIDGET_OPTION.OPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JWidgetOption.WIDGET_OPTION.VALUE;
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
    public Long component2() {
        return getWidgetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getValue();
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
    public Long value2() {
        return getWidgetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JWidgetOptionRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JWidgetOptionRecord value2(Long value) {
        setWidgetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JWidgetOptionRecord value3(String value) {
        setOption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JWidgetOptionRecord value4(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JWidgetOptionRecord values(Long value1, Long value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JWidgetOptionRecord
     */
    public JWidgetOptionRecord() {
        super(JWidgetOption.WIDGET_OPTION);
    }

    /**
     * Create a detached, initialised JWidgetOptionRecord
     */
    public JWidgetOptionRecord(Long id, Long widgetId, String option, String value) {
        super(JWidgetOption.WIDGET_OPTION);

        set(0, id);
        set(1, widgetId);
        set(2, option);
        set(3, value);
    }
}

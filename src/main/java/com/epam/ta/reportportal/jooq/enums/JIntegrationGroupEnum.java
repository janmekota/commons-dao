/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.enums;


import com.epam.ta.reportportal.jooq.JPublic;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum JIntegrationGroupEnum implements EnumType {

    BTS("BTS"),

    NOTIFICATION("NOTIFICATION"),

    AUTH("AUTH"),

    OTHER("OTHER");

    private final String literal;

    private JIntegrationGroupEnum(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
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
    public String getName() {
        return "integration_group_enum";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}

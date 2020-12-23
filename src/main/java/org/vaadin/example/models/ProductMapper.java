package org.vaadin.example.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product map(ResultSet rs, StatementContext ctx) throws SQLException {
        return new Product(rs.getString("product_code"), rs.getString("product_name"), rs.getString("product_scale"),
                rs.getString("product_vendor"), rs.getString("product_description"), rs.getInt("quantity_in_stock"),
                rs.getBigDecimal("buy_price"), rs.getBigDecimal("msrp"), rs.getString("product_line"));
    }

}

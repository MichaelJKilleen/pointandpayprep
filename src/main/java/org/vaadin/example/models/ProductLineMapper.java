package org.vaadin.example.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

public class ProductLineMapper implements RowMapper<ProductLineDetail> {
    @Override
    public ProductLineDetail map(ResultSet rs, StatementContext ctx) throws SQLException {
        return new ProductLineDetail(rs.getString("product_line"), rs.getString("text_description"));
    }
}

package org.vaadin.example.service.persist;

import java.util.List;

import org.jdbi.v3.core.Jdbi;
import org.vaadin.example.models.ProductLineDetail;
import org.vaadin.example.models.ProductLineMapper;

public class ProductLineServiceImpl implements ProductLineService {

    @Override
    public List<String> productLines() {
        Jdbi jdbi = Jdbi.create("jdbc:mysql://localhost:3306/classicmodels4", "myuser", "P@ssw0rd!");

        return jdbi.withHandle(handle -> {
            return handle.createQuery("select product_line from product_lines").mapTo(String.class).list();
        });
    }

    @Override
    public ProductLineDetail productLineDetail(String productLineId) {
        Jdbi jdbi = Jdbi.create("jdbc:mysql://localhost:3306/classicmodels4", "myuser", "P@ssw0rd!");

        return jdbi.withHandle(handle -> {
            return handle.createQuery("select * from product_lines where product_line = ?").bind(0, productLineId)
                    .map(new ProductLineMapper()).one();
        });

    }

}

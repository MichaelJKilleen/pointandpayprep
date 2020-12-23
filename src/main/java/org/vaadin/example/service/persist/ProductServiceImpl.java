package org.vaadin.example.service.persist;

import java.util.List;

import org.jdbi.v3.core.Jdbi;
import org.vaadin.example.models.Product;
import org.vaadin.example.models.ProductMapper;

public class ProductServiceImpl implements ProductService {

    @Override
    public Product findByProductCode(String productCode) {
        Jdbi jdbi = Jdbi.create("jdbc:mysql://localhost:3306/classicmodels4", "myuser", "P@ssw0rd!");
        return jdbi.withHandle(handle -> {
            return handle.createQuery("select * from products where product_code = ?").bind(0, productCode)
                    .map(new ProductMapper()).one();
        });
    }

    @Override
    public Product findByproductName(String productName) {
        Jdbi jdbi = Jdbi.create("jdbc:mysql://localhost:3306/classicmodels4", "myuser", "P@ssw0rd!");
        return jdbi.withHandle(handle -> {
            return handle.createQuery("select * from products where product_name = ?").bind(0, productName)
                    .map(new ProductMapper()).one();
        });
    }

    @Override
    public List<Product> findAll() {
        Jdbi jdbi = Jdbi.create("jdbc:mysql://localhost:3306/classicmodels4", "myuser", "P@ssw0rd!");
        return jdbi.withHandle(handle -> {
            return handle.createQuery("select * from products").map(new ProductMapper()).list();
        });
    }

    @Override
    public List<Product> findAllByProductLine(String productLine) {
        Jdbi jdbi = Jdbi.create("jdbc:mysql://localhost:3306/classicmodels4", "myuser", "P@ssw0rd!");
        return jdbi.withHandle(handle -> {
            return handle.createQuery("select * from products where product_line = ?").bind(0, productLine)
                    .map(new ProductMapper()).list();
        });
    }

}

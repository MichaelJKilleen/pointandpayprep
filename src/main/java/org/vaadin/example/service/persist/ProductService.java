package org.vaadin.example.service.persist;

import java.util.List;

import org.vaadin.example.models.Product;

public interface ProductService {

    Product findByProductCode(String productCode);

    Product findByproductName(String productName);

    List<Product> findAll();

    List<Product> findAllByProductLine(String productLine);
}

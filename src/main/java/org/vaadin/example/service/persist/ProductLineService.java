package org.vaadin.example.service.persist;

import java.util.List;

import org.vaadin.example.models.ProductLine;
import org.vaadin.example.models.ProductLineDetail;

public interface ProductLineService {

    List<String> productLines();

    ProductLineDetail productLineDetail(String productLine);
}

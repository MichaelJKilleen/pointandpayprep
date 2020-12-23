package org.vaadin.example.service.persist;

import java.util.Arrays;
import java.util.List;

import org.vaadin.example.models.ProductLine;
import org.vaadin.example.models.ProductLineDetail;

public class MockProductLineService implements ProductLineService {

    @Override
    public List<String> productLines() {
        return Arrays.asList("Classic Cars", "Motorcycles", "Planes", "Ships", "Trains", "Trucks and Buses",
                "Vintage Cars");
    }

    @Override
    public ProductLineDetail productLineDetail(String productLine) {
        // TODO Auto-generated method stub
        return null;
    }

}

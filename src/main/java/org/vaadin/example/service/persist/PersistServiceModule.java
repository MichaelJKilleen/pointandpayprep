package org.vaadin.example.service.persist;

import com.google.inject.AbstractModule;

public class PersistServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ProductLineService.class).to(ProductLineServiceImpl.class);
        bind(ProductService.class).to(ProductServiceImpl.class);

    }
}

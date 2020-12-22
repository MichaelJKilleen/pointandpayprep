package org.vaadin.example.service;

import com.google.inject.AbstractModule;

public class HelloWorldModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloWorldService.class).to(HelloWorldServiceImpl.class);
        bind(GreetService.class).to(GreetServiceImpl.class);
    }
}

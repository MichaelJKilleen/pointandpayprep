package org.vaadin.example.service;

public class HelloWorldServiceImpl implements HelloWorldService {

    public HelloWorldServiceImpl() {
        // TEST
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, world!");

    }

}

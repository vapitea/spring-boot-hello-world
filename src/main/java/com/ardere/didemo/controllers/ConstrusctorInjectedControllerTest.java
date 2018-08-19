package com.ardere.didemo.controllers;

import com.ardere.didemo.services.GreetingService;

public class ConstrusctorInjectedControllerTest {

    private GreetingService greetingService;

    public ConstrusctorInjectedControllerTest(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){

        return greetingService.sayGreeting();
    }
}

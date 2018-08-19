package com.ardere.didemo.controllers;

import com.ardere.didemo.services.GreetingService;

public class ConsturctorInjectedController {

    private GreetingService greetingService;

    public ConsturctorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}

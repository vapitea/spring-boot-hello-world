package com.ardere.didemo.controllers;

import com.ardere.didemo.services.GreetingService;
import com.ardere.didemo.services.GreetingServiceImpl;

public class GetterInjectedController {


    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

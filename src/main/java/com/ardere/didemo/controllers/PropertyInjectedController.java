package com.ardere.didemo.controllers;


import com.ardere.didemo.services.GreetingService;
import com.ardere.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


public class PropertyInjectedController {


    public GreetingServiceImpl greetingServiceImpl;

    String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}

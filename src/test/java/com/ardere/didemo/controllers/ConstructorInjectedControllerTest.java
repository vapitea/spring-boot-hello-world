package com.ardere.didemo.controllers;

import com.ardere.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConsturctorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        constructorInjectedController = new ConsturctorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void sayGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.GREETINGS_STRANGER,constructorInjectedController.sayHello()) ;
    }
}

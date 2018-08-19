package com.ardere.didemo.controllers;

import com.ardere.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.GREETINGS_STRANGER,getterInjectedController.sayHello());
    }
}

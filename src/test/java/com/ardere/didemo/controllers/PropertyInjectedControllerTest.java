package com.ardere.didemo.controllers;


import com.ardere.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PropertyInjectedControllerTest {


    public PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws  Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();

    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.GREETINGS_STRANGER,this.propertyInjectedController.sayHello());
    }


}

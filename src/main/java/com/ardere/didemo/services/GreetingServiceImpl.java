package com.ardere.didemo.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String GREETINGS_STRANGER = "GREETINGS_STRANGER";

    @Override
    public String sayGreeting() {

        return GREETINGS_STRANGER;
    }
}

package com.emerson;


//This SpanishGreeting class implements the GreetingInterface
public class SpanishGreeting implements GreetingInterface{


    //Here is the implementation of the abstract method from GreetingInterface
    @Override
    public String sayYourGreeting() {
        return "Buenos dias programadores";
    }
}

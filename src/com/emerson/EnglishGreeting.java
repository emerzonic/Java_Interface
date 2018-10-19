package com.emerson;


//This EnglishGreeting class implements the GreetingInterface
public class EnglishGreeting implements GreetingInterface{


    //Here is the implementation of the abstract method from GreetingInterface
    @Override
    public String sayYourGreeting() {
        return "Good morning coders";
    }
}

package com.emerson;


//This FrenchGreeting class implements the GreetingInterface
public class FrenchGreeting implements GreetingInterface{


    //Here is the implementation of the abstract method from GreetingInterface
    @Override
    public String sayYourGreeting() {
        return "Bonjour les codeurs";
    }
}

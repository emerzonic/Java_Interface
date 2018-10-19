package com.emerson;

public class Main {

    public static void main(String[] args) {

        //Create new instances of the classes
        GreetingInterface engilshGreeting = new EnglishGreeting();
        GreetingInterface frenchGreeting = new FrenchGreeting();
        GreetingInterface spanishGreeting = new SpanishGreeting();


        //call the implemented methods of each class
        System.out.println(engilshGreeting.sayYourGreeting()); //output: Good morning coders
        System.out.println(frenchGreeting.sayYourGreeting());   //output: Bonjour les codeurs
        System.out.println(spanishGreeting.sayYourGreeting());  //output: Buenos dias programadores

    }
}

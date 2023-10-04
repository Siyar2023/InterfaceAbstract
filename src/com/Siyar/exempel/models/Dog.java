package com.Siyar.exempel.models;

//Dog ska ärva från Animal, skriv implements Animal från paketet.
//tryck över"Public class dog implement Animal" röd markerad felet och välj implements method.
//Välj alla methods.

public class Dog implements Animal{ //Lägg till implement Animal
    @Override
    public void name() {
        System.out.println("Fido:");
    }

    @Override
    public void move() {
        System.out.println("Runs frantically");
    }

    @Override
    public void eat() {
        System.out.println("Devours everything");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 50% of the time");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof, bark bark");

    }

    @Override
    public void myAbstractMethod() {

    }
}

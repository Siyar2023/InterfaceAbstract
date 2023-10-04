package com.Siyar.exempel.models;

//Kat ska ärva från Animal, skriv implements Animal från paketet.
//tryck över"Public class Cat implement Animal" röd markerad felet och välj implements method.
//Välj alla methods så kommer du upp @Override.

public class Cat implements Animal{ //Lägg till implement Animal
    @Override
    public void name() {
        System.out.println("Kasper:");

    }

    @Override
    public void move() {
        System.out.println("Moves graciously");
    }

    @Override
    public void eat() {
        System.out.println("mom nom nom");
    }

    @Override
    public void sleep() {
        System.out.println("Slepp 80% of the time");
    }

    @Override
    public void makeSound() {
        System.out.println("Miyaw miyaw");
    }

    @Override
    public void myAbstractMethod() {

    }
}

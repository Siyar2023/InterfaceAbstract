package com.Siyar.exempel.models;

//Abstract - 1inheritance (arv)
// As a Standart, methods are ´PUBLIC`
// Uses keyword: implements

public interface Animal {
    //TODO - Give relevant names
    // TODO - Implement Inheritance
    // TODO - SUPER VIKTIG: private vis/mod


    //Abstract Methods
    void name();
    void move();
    void eat();
    void sleep();
    void makeSound();
    void myAbstractMethod();



    default void typeOfAnimal(String typeOfAnimal){
        System.out.println(typeOfAnimal);
    }
}

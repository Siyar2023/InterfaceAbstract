package com.Siyar.exempel.models;

//Abstract class - marked by keyword abstract.
//TODO- test visibility mod
public abstract class AAnimal {


    public abstract void eat(); //utan måsvingar, includes abstracts, excludes body

    public void makeSound() { //ordinary method med måsvingar, exclude abstract, include bodys
        System.out.println("Some random animal noise");

    }

    }


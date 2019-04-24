package main.java.animals;

import Flyable.Flyable;

import java.awt.*;

public class Reptile extends Animal implements Flyable {

    public Reptile(String name){
        this.name = name;
    }

    @Override
    public void land() {
        System.out.println("Reptile lands.");
    }

    @Override
    public void fly() {
        System.out.println("Some reptile can fly I think.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String breed() {
        return " pushing out eggs.";
    }

    @Override
    Color getColor() {
        return null;
    }

    @Override
    int getAge() {
        return 0;
    }

    @Override
    int getLegs() {
        return 0;
    }
}

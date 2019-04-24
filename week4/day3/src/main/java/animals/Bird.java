package main.java.animals;

import Flyable.Flyable;

import java.awt.*;

public class Bird extends Animal implements Flyable {

    public Bird(String name){
        this.name = name;
    }
    @Override
    public void land() {
        System.out.println("Bird lands.");
    }

    @Override
    public void fly() {
        System.out.println("Bird flies.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String breed() {
        return "laying eggs";
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

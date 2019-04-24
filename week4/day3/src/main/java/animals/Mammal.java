package main.java.animals;

import Flyable.Flyable;

import java.awt.*;

public class Mammal extends Animal implements Flyable {

    public Mammal(String name){
        this.name = name;
    }

    @Override
    public void land() {
        System.out.println("Mammals cant fly, so...");
    }

    @Override
    public void fly() {
        System.out.println("Mammals cant fly.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String breed() {
        return " giving birth.";
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

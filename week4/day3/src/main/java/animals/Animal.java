package main.java.animals;

import java.awt.*;

abstract class Animal {
    String name;
    int age;
    int legs;
    boolean fur;
    Color color;

    abstract String getName();
    abstract String breed();
    abstract Color getColor();
    abstract int getAge();
    abstract int getLegs();
}

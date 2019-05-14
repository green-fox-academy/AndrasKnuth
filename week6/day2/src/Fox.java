import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {
  String name;
  Color color;
  int age;

  public Fox(String name, Color color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public static void main(String[] args) {
    List<Fox> foxes = Arrays.asList(
        new Fox("ferrilata", Color.green, 2),
        new Fox("tibetian", Color.blue, 3),
        new Fox("vuk", Color.green, 5),
        new Fox("pupak", Color.black, 2),
        new Fox("bela", Color.green, 3));

    System.out.println(foxes.stream()
        .filter(n -> n.color == Color.green)
        .map(n -> n.name)
        .collect(Collectors.toList()));

    System.out.println(foxes.stream()
    .filter(n -> n.color == Color.green && n.age < 5 )
    .map(n -> n.name)
    .collect(Collectors.toList()));

    System.out.println(foxes.stream()
    .filter(n -> n.color == Color.green)
    .count());
  }
}

/*
Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

Write a Stream Expression to find the foxes with green color!
Write a Stream Expression to find the foxes with green color, and age less then 5 years!
Write a Stream Expression to find the frequency of foxes by color!
 */
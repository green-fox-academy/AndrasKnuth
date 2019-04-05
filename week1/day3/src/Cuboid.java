public class Cuboid {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 150;
        System.out.println("Volume: " + a*b*c);
        System.out.println("Surface Area: " + 2*(a*b+b*c+c*a));
    }
}


// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
package GardenApp;

public class Tree {
    int water;
    String color;
    boolean needsWater;

    public Tree(){}

    public Tree(int water, String color){
        this.color = color;
        this.water = water;
        if (water < 10){
            needsWater = true;
        } else {
            needsWater = false;
        }
    }


    public int getWater(){
        return this.water;
    }
}

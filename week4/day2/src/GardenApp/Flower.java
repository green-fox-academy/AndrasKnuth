package GardenApp;

public class Flower {
    int water;
    String color;
    boolean needsWater;

    public Flower(){}

    public Flower(int water, String color) {
        if(water < 5){
            needsWater = true;
        } else {
            needsWater = false;
        }
    }

    public int getWater(){
        return this.water;
    }
}

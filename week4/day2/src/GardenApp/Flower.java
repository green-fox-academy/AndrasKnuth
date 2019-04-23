package GardenApp;

public class Flower extends Plants{

    public Flower(String color){
        super(color);
    }

    public boolean setFlowerNeedsWater() {
        if(waterAmount < 5){
            return needsWater = true;
        } else {
            return needsWater = false;
        }
    }

    public double wateringFlower(double amountOfWaterForOneFlower) {
        return waterAmount += amountOfWaterForOneFlower * 0.75;
    }
}

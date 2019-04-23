package GardenApp;

public class Tree extends Plants {

    public Tree(String color) {
        super(color);
    }

    public boolean setTreeNeedsWater() {
        if (waterAmount < 10) {
            return needsWater = true;
        } else {
            return needsWater = false;
        }
    }

    public double wateringTree(double amountOfWaterForOneFlower) {
        return waterAmount += amountOfWaterForOneFlower * 0.4;
    }
}

package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    int flowersNeedingWater;
    int treesNeedingWater;

    List<Flower> flowerList;
    List<Tree> treeList;

    public Garden(){
        this.treeList = new ArrayList<>();
        this.flowerList = new ArrayList<>();
    }

    public void addFlower(Flower flower){
        flowerList.add(flower);
    }
    public void addTree(Tree tree){
        treeList.add(tree);
    }

    public int countFlowersNeedsWatering(){
        for (Flower inspectedFlower : flowerList){
            if (inspectedFlower.setFlowerNeedsWater()) {
                flowersNeedingWater++;
            }
        }
        return flowersNeedingWater;
    }


    public int countTreesNeedsWatering() {
        for (Tree inspectedTrees : treeList) {
            if (inspectedTrees.setTreeNeedsWater()) {
                treesNeedingWater++;
            }
        }
        return treesNeedingWater;
    }



    public void wateringOfFlowersInGarden(double wateringAmount, Garden garden) {
        garden.countTreesNeedsWatering();
        garden.countFlowersNeedsWatering();
        double amountOfWaterForOneFlower = wateringAmount / (flowersNeedingWater + treesNeedingWater);

        for (Flower wateredFlower : flowerList) {
            if (wateredFlower.needsWater) {
                wateredFlower.wateringFlower(amountOfWaterForOneFlower);
            }
        }
        flowersNeedingWater = 0;
        treesNeedingWater = 0;
    }

    public void wateringOfTreesInGarden(double wateringAmount, Garden garden) {
        garden.countTreesNeedsWatering();
        garden.countFlowersNeedsWatering();
        double amountOfWaterForOneTree = wateringAmount / (flowersNeedingWater + treesNeedingWater);

        for (Tree wateredTrees : treeList) {
            if (wateredTrees.needsWater) {
                wateredTrees.wateringTree(amountOfWaterForOneTree);
            }
        }
        flowersNeedingWater = 0;
        treesNeedingWater = 0;
    }

    public void wateringTheWholeGarden(int wateringAmount, Garden garden){
        System.out.println("We water the garden with " + wateringAmount + " liters of water!");
        wateringOfFlowersInGarden(wateringAmount, garden);
        wateringOfTreesInGarden(wateringAmount, garden);
        checkTheStatusOfGarden();
    }

    public void checkTheStatusOfGarden(){
        for (Flower inspectedFlower: flowerList){
            if (inspectedFlower.setFlowerNeedsWater()){
                System.out.println("The " + inspectedFlower.color + " flower needs water.");
            } else {
                System.out.println("The " + inspectedFlower.color + " flower doesnt need water dammit!");
            }
        }
        for (Tree inspectedTree : treeList){
            if (inspectedTree.setTreeNeedsWater()){
                System.out.println("The " + inspectedTree.color + " tree needs water");
            } else {
                System.out.println("The " + inspectedTree.color + " tree doesnt need water dammit!");
            }
        }
    }
}

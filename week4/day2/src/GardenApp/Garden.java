package GardenApp;

import java.util.List;

public class Garden {
    int water;
    List<Flower> flowerList;
    List<Tree> treeList;
    public Garden(){}

    public void watering ( int amount){
        + amount / (flowerList.size() + treeList.size());
    }

    public void addFlower(Flower flower){
        flowerList.add(new Flower());
    }
    public void addTree(Tree tree){
        treeList.add(new Tree());
    }

    public static void main(String[] args) {

    }
}

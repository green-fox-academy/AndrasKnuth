package GardenApp;

public class Creation {
    public static void main(String[] args) {
        Garden Eden = new Garden();
       Flower yellow = new Flower("yellow");
       Flower blue = new Flower("blue");
       Tree purple = new Tree("purple");
       Tree orange = new Tree("orange");

       Eden.addFlower(yellow);
       Eden.addFlower(blue);
       Eden.addTree(purple);
       Eden.addTree(orange);

       Eden.checkTheStatusOfGarden();
       Eden.wateringTheWholeGarden(40, Eden);
       Eden.wateringTheWholeGarden(70, Eden);






    }
}

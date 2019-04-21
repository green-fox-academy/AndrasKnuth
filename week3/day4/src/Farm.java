import java.util.ArrayList;
import java.util.List;

public class Farm {
    int slots;
    List<Animal> animals = new ArrayList<>();

    public Farm(int slots){
        this.slots = slots;
    }

    public void breed() {
        for (int i = animals.size(); i < slots; i++) {

            if (animals.size() < slots) {
                animals.add(new Animal(50, 50));
                System.out.println("New animal made, now you have " + animals.size());
            } else {
                System.out.println("The Farm is full");
            }
            System.out.println(animals.size());
        }
    }
    public void slaughter(){

    }

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal(50,50);
        Farm newFarm = new Farm(15);
        animals.add(0, animal);
        animals.add(1,animal);
        animals.add(2, animal);
        System.out.println("You had " + animals.size() + " animals,");
        newFarm.breed();



    }
}

    /*public void slaughter(Animal animal) {
        int minHunger = 1000;
        for (int i = 0; i < this.Animals.size(); i++) {
            if (this.Animals.get(i).getHunger() < minHunger) {
                minHunger = this.Animals.get(i).getHunger();
            }
            this.Animals.remove(this.Animals.indexOf(minHunger));
        }

    }*/

/*
Reuse your Animal class
 - Create a Farm class
 - it has list of Animals
 - it has slots which defines the number of free places for animals
 - breed() -> creates a new animal if there's place for it
 - slaughter() -> removes the least hungry animal
 */
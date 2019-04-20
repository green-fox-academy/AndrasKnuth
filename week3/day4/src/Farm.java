import java.util.ArrayList;
import java.util.List;

public class Farm {
    int slots;
    List<Animal> Animals;

    public Farm(int slots){
    this.Animals = new ArrayList<>();

    }

    public void breed() {
        if (Animals.size() < slots) {
            Animals.add(new Animal(50, 50));
            System.out.println("New animal made, now you have" + Animals.size());
        } else {
            System.out.println("The Farm is full");
        }
    }
    public static void main(String[] args) {
        Farm newFarm = new Farm(15);
        List<Animal> allatok = new ArrayList<>();
        Animal animal = new Animal(50,50);
        allatok.add(0, animal);
        allatok.add(1,animal);
        allatok.add(2, animal);
        System.out.println(allatok.size());
        newFarm.breed();
        System.out.println(allatok.size());

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
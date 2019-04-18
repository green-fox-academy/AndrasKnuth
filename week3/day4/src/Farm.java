import java.util.List;


public class Farm {
    int slots;
    List<Animal> Animals;


    public void breed() {
        if (this.Animals.size() < slots) {
            this.Animals.add(new Animal(50,50));
            System.out.println("New animal made, now you have" + this.Animals.size());
        } else {
            System.out.println("The Farm is full");
        }
    }

    public void slaughter(Animal animal) {
        int minHunger = 1000;
        for (int i = 0; i < this.Animals.size(); i++) {
            if (this.Animals.get(i).getHunger() < minHunger) {
                minHunger = this.Animals.get(i).getHunger();
            }
            this.Animals.remove(this.Animals.indexOf(minHunger));
        }

    }

    public static void main(String[] args) {
        Farm newFarm = new Farm();
        newFarm.breed();

    }
}
/*
Reuse your Animal class
 - Create a Farm class
 - it has list of Animals
 - it has slots which defines the number of free places for animals
 - breed() -> creates a new animal if there's place for it
 - slaughter() -> removes the least hungry animal
 */
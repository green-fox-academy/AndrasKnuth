public class Animal {
    int hunger;
    int thirst;

    public Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

        private void eat () {
            this.hunger--;
        }
        private void drink () {
            this.thirst--;
        }
        private void play () {
            this.thirst--;
            this.hunger--;
        }


}
/*Create an Animal class
Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
when creating a new animal object these values are created with the default 50 value
Every animal can eat() which decreases their hunger by one
Every animal can drink() which decreases their thirst by one
Every animal can play() which increases both by one*/
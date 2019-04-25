import java.lang.reflect.Array;

public class Animal {
    int hunger;
    int thirst;

    public Animal(int hunger, int thirst){
        this.hunger = hunger;
        this.thirst = thirst;
    }
    int eat (){
        return this.hunger-=1;
    }
    int drink (){
        return this.thirst-=1;
    }
    public void play (){
        this.hunger+=1 ;
        this.thirst+=1;

    }

    public int getHunger(){
        return this.hunger;
    }

    public int getThirst(){
        return this.thirst;
    }
}

/*Create an Animal class
Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
when creating a new animal object these values are created with the default 50 value
Every animal can eat() which decreases their hunger by one
Every animal can drink() which decreases their thirst by one
Every animal can play() which increases both by one*/
package main.java.music;

public class Violin extends StringedInstruments {
    private final String makeSound = "Screech";

    public Violin(){
        setNumberOfStrings(4);
        this.name = "Violin";
    }

    @Override
    public void sound() {
        System.out.println(makeSound);
    }
}

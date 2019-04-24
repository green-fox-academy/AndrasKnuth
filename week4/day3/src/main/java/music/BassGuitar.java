package main.java.music;

public class BassGuitar extends StringedInstruments{
    private final String makeSound = "Duum-duum-duum";

    public BassGuitar() {
        setNumberOfStrings(4);
        this.name = "BassGuitar";
    }

    public BassGuitar(int strings){
        this.setNumberOfStrings(strings);
        this.name = "BassGuitar";
    }

    @Override
    public void sound() {
        System.out.println(makeSound);
    }
}

package main.java.music;

public class ElectricGuitar extends StringedInstruments {
    private final String makeSound = "Twang";

    public ElectricGuitar() {
        this.setNumberOfStrings(6);
        this.name = "Electric Guitar";
    }

    public ElectricGuitar(int strings) {
        this.setNumberOfStrings(strings);
        this.name = "Electric Guitar";
    }

    @Override
    public void sound() {
        System.out.println(makeSound);
    }

}



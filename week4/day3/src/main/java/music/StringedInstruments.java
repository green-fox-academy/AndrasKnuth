package main.java.music;

abstract class StringedInstruments extends Instrument{
    private int NumberOfStrings;

    public int getNumberOfStrings() {
        return NumberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        NumberOfStrings = numberOfStrings;
    }

    public abstract void sound();

    @Override
    public void play() {
        System.out.print(this.name + ", a " + this.getNumberOfStrings() + " stringed instrument, that goes ");
        this.sound();
    }
}

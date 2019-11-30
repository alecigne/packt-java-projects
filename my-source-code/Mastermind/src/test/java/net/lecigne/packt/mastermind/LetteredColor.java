package net.lecigne.packt.mastermind;

public class LetteredColor extends Color {

    private static final String letters = "RGBYWb";
    private static int objectCounter = 0;
    private final String string;

    public LetteredColor() {
        super();
        string = letters.substring(objectCounter, objectCounter + 1);
        objectCounter++;
    }

    @Override
    public String toString() {
        return string;
    }

}

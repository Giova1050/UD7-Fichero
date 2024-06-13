package net.salesianos.Ejers4;

public class Mesa {
    private String color;
    private int numPatas;

    public Mesa(String color, int numPatas) {
        this.color = color;
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return "Mesa de color " + color + " con " + numPatas + " patas";
    }

    public String getColor() {
        return color;
    }

    public int getNumPatas() {
        return numPatas;
    }
}

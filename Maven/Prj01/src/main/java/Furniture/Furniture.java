package Furniture;

public abstract class Furniture {
    String name;
    int square;

    public Furniture(String name, int square) {
        this.name = name;
        this.square = square;
    }

    abstract public String getName();
    abstract public void setName(String name);
    abstract public int getSquare();
    abstract public void setSquare(int square);
    abstract public void describe();
}

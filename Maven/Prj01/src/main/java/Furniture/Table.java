package Furniture;

public class Table extends Furniture {

    public Table(String name, int square) {
        super(name, square);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSquare() {
        return square;
    }

    @Override
    public void setSquare(int square) {
        this.square = square;
    }

    @Override
    public void describe() {
        System.out.print("\n   " + name + " (площади" + square + " м^2)");
    }

}

package Furniture;

public class SoftChair extends Furniture {

    public SoftChair(String name, int square) {
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
        System.out.print("\n   " + name + " (площадь " + square + " м^2)");
    }


}

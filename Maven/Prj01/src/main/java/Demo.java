import Furniture.*;
import Light.*;

public class Demo {

    public static void main(String[] args) {

        Building building = new Building("Здание 1");
        building.addRoom("Комната 1", 100, 3);
        building.addRoom("Комната 2", 5, 2);
        building.getRoom("Комната 1").add(new Lightbulb(150));
        building.getRoom("Комната 1").add(new Lightbulb(250));
        building.getRoom("Комната 1").add(new Table("Стол письменный", 3));
        building.getRoom("Комната 1").add(new SoftChair("Кресло мягкое и пушистое", 2));
        building.describe();

    }
}

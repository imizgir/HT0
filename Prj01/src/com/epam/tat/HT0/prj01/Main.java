package com.epam.tat.HT0.prj01;

import com.epam.tat.HT0.prj01.Furniture.*;
import com.epam.tat.HT0.prj01.Light.*;

/* Задание в Task.txt
 * Не обработаны ошибки :( */
public class Main {
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
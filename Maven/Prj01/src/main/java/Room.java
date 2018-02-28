import Furniture.Furniture;
import Light.Light;

import java.util.ArrayList;
import java.util.List;

public class Room {


    public static final int LIGHT_MIN_ALLOWED = 300;
    public static final int LIGHT_MAX_ALLOWED = 4000;
    public static final int MAX_AREA_USAGE_ALOWED_PERCENT = 70;
    private static final int LIGHT_WINDOW = 700;

    private String name;
    private int area;
    public int windowsCount;
    private int roomLight;
    int sumFurnitureSquare;
    List<Furniture> furnitureList = new ArrayList<>();
    List<Light> lightList = new ArrayList<>();

    public Room(String name, int area, int windowsCount) {
        this.name = name;
        this.area = area;
        this.windowsCount = windowsCount;
        this.roomLight = windowsCount * LIGHT_WINDOW /*+ getSumLight()*/;
        this.furnitureList = new ArrayList<>();
        this.lightList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getWindowsCount() {
        return windowsCount;
    }

    public void setWindowsCount(int windowsCount) {
        this.windowsCount = windowsCount;
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void addLight(Light light) {
        lightList.add(light);
    }

    public void add(Light light) {
        lightList.add(light);

    }

    public void add(Furniture furniture) {
        furnitureList.add(furniture);

    }

    // пытался вычислить освященность комнаты (освещенность от лампочек + освещенность от окон)
    /*
    int sumLightBulb = 0;

    public int getSumLight() {
        for (Light l : lightList) {
            sumLightBulb = sumLightBulb + l.getLight();
        }
        //System.out.println(sumLightBulb);
        return sumLightBulb;
    }

    int sumBulbWind = sumLightBulb + roomLight;

*/

    public void describe() {
        System.out.print("\n " + name);
        System.out.print("\n  Освещнность = " + roomLight + " (" + windowsCount + " окна по " + LIGHT_WINDOW + "лк, лампочки: ");
        for (Light l : lightList) {
            l.describe();
        }
        for (Furniture r : furnitureList) {
            sumFurnitureSquare = sumFurnitureSquare + r.getSquare();
        }
        int freeArea = area - sumFurnitureSquare;
        double freeAreaPercent = (double) freeArea / area * 100;
        System.out.print("\n  Площадь = " + area + " (занято " + sumFurnitureSquare + " м^2, гарантировано свободно " + freeArea + " м^2 или " + freeAreaPercent + "% площади)");
        System.out.print("\n  Мебель: ");
        for (Furniture r : furnitureList) {
            r.describe();
        }
    }
}

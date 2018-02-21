package com.epam.tat.HT0.prj01.Light;

public class Lightbulb implements Light {

    int lightBulb;

    public Lightbulb(int lightBulb) {
        this.lightBulb = lightBulb;
    }

    public int getLightBulb() {
        return lightBulb;
    }

    public void setLightBulb(int lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public int getLight() {
        return getLightBulb();
    }

    @Override
    public void describe() {
        System.out.print(lightBulb + "лк ");
    }
}

package com.epam.tat.HT0.prj01;

import java.util.ArrayList;

public class Building {

    private String nameBuilding;
    private ArrayList<Room> roomList = new ArrayList<>();


    public Building(String nameBuilding) {
        this.nameBuilding = nameBuilding;
    }

    public String getNameBuilding() {
        return nameBuilding;
    }

    public void setNameBuilding(String nameBuilding) {
        this.nameBuilding = nameBuilding;
    }

    public void addRoom(String roomName, int roomArea, int windowCounts){
        roomList.add(new Room(roomName, roomArea, windowCounts));
    }

    public Room getRoom(String roomName){
        for (Room room : roomList){
            return room;
        }
        return null;
    }

    public void describe() {
        System.out.print("\n" + nameBuilding);
        for (Room r : roomList) {
            r.describe();
        }
    }
}

package com.ustas1987.SpacePort;

public class Pilot {
    String nameOfPilot;

    public Pilot(String name) {
        this.nameOfPilot = name;
    }

    void startThePilot()
    {
        System.out.println("Пилот : " + nameOfPilot + " к полету готов!");
    }
}

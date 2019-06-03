package com.ustas1987.SpacePort;

public class SpaceShip {
    String nameOfSpaceShip;
    Pilot currentPilot;
    FlightControlCenter currentControlCenter;

    public SpaceShip(String nameOfSpaceShip) {
        this.nameOfSpaceShip = nameOfSpaceShip;
    }

    public void setCurrentControlCenter(FlightControlCenter currentControlCenter) {
        this.currentControlCenter = currentControlCenter;
    }

    public void setPilot(Pilot pilot) {
        this.currentPilot = pilot;
    }

    void readyToStart()
    {
        System.out.println("Пилот : Корабль " + nameOfSpaceShip + " к запуску готов!");
    }

    void flightToTheMoon()
    {
        System.out.println(currentControlCenter.nameOfFlightControlCenter + " совершил запуск корабля " + nameOfSpaceShip);
        System.out.println(nameOfSpaceShip + " вышел в космос с пилотом " + currentPilot.nameOfPilot + " на борту.");
        System.out.println("УРА! ТОВАРИЩИ!!!");
    }
}

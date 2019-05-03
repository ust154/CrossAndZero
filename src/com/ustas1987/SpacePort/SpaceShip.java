package com.ustas1987.SpacePort;

public class SpaceShip {
    String nameOfSpaceShip;
    Pilot currentPilot;
    //String nameOfPilot;
    FlightControlCenter currentControlCenter;
    SpaceShip spaceShip;

    public SpaceShip(String nameOfSpaceShip) {
        this.nameOfSpaceShip = nameOfSpaceShip;
    }

    public void setCurrentControlCenter(FlightControlCenter currentControlCenter) {
        this.currentControlCenter = currentControlCenter;
    }

    public void setPilot(Pilot pilot) {
        this.currentPilot = pilot;
    }

    void readyToStart() {
        System.out.println("Пилот " + currentPilot.nameOfPilot + " сказал: " + " - Корабль " + nameOfSpaceShip + " к запуску готов!");
    }

    void flightToTheMoon() {
        System.out.println(currentControlCenter + " совершил запуск корабля " + nameOfSpaceShip);
        System.out.println(nameOfSpaceShip + " вышел в космос с пилотом " + currentPilot.nameOfPilot + " на борту");
    }
}

package com.ustas1987.SpacePort;

public class FlightControlCenter {
    Flyable currentFlyingObject;
    Pilot currentPilot;
    String nameOfFlightControlCenter;

    public void setCurrentPilot(Pilot currentPilot) {
        this.currentPilot = currentPilot;
    }

    public void setCurrentFlyable(Flyable currentSpaceShip) {
        this.currentFlyingObject = currentSpaceShip;
    }

    public FlightControlCenter(String name) {
        this.nameOfFlightControlCenter = name;
    }

    void check() {
        System.out.println("Космопорт " + nameOfFlightControlCenter + " : Пилот, доложить о готовности!");
        currentPilot.startThePilot();
    }

    void launch() {
        System.out.println("Космопорт " + nameOfFlightControlCenter + " : К запуску готовы! Дать обратный отсчет!");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Запуск!!!");
        currentFlyingObject.flightToTheMoon();
    }
}

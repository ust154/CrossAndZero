package com.ustas1987.SpacePort;

public class FlightControlCenter {
    SpaceShip currentSpaceShip;
    Pilot currentPilot;
    String nameOfFlightControlCenter;

    public void setCurrentPilot(Pilot currentPilot) {
        this.currentPilot = currentPilot;
    }

    public void setCurrentSpaceShip(SpaceShip currentSpaceShip) {
        this.currentSpaceShip = currentSpaceShip;
    }

    public FlightControlCenter(String name) {
        this.nameOfFlightControlCenter = name;
    }

    void check()
    {
        System.out.println("Космопорт " + nameOfFlightControlCenter + " : Пилот, доложить о готовности!");
        currentPilot.startThePilot();
        currentSpaceShip.readyToStart();
    }

    void launch()
    {
        System.out.println("Космопорт " + nameOfFlightControlCenter + " : К запуску готовы! Дать обратный отсчет!");
        for (int i = 10; i != 0; i--) {
            System.out.println(i);
        }
        System.out.println("Запуск!!!");
        currentSpaceShip.flightToTheMoon();
    }
}

package com.ustas1987.SpacePort;

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Незнайка");
        SpacePort port = new SpacePort("Байкрнур");
        SpaceShip spaceShip = new SpaceShip("'VOSTOK'");
        FlightControlCenter controlCenter = new FlightControlCenter("ЦУП № 1");

        spaceShip.setPilot(pilot);//посадил пилота в корабль
        //pilot.startThePilot();//метод работает!
        port.setSpaceShip(spaceShip);//добавил в космопорт корабль
        //spaceShip.readyToStart();//метод работает!
        port.setFlightControlCenter(controlCenter);//добавил ЦУП в космодром
        controlCenter.setCurrentSpaceShip(spaceShip);//добавил в ЦУП корабль
        controlCenter.launch();





        //currentControlCenter.currentPilot.startThePilot();

    }
}

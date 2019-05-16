package com.ustas1987.SpacePort;

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Незнайка");
        SpacePort port = new SpacePort("Байкрнур");
        SpaceShip spaceShip = new SpaceShip("'VOSTOK'");
        FlightControlCenter controlCenter = new FlightControlCenter("ЦУП № 1");

        port.setFlightControlCenter(controlCenter);//в космопорт добавил ЦУП
        port.setSpaceShip(spaceShip);// в космопорт добавил корабль
        controlCenter.setCurrentSpaceShip(spaceShip);//в ЦУП добавил  корабль
        spaceShip.setPilot(pilot);//в корабль посадил пилота
        controlCenter.setCurrentPilot(pilot);//добавил в космопорт пилота
        spaceShip.setCurrentControlCenter(controlCenter);//в корабль добавил ЦУП

        controlCenter.check();
        controlCenter.launch();
    }
}

package com.ustas1987.SpacePort;

public class SpacePort {
    String nameOfSpacePort;
    FlightControlCenter flightControlCenter;
    SpaceShip spaceShip;

    public SpacePort(String nameOfSpacePort) {
        this.nameOfSpacePort = nameOfSpacePort;
    }

    public void setSpaceShip(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
    }

    public void setFlightControlCenter(FlightControlCenter flightControlCenter) {
        this.flightControlCenter = flightControlCenter;
    }
}

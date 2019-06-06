package com.ustas1987.SpacePort;

public class SpacePort {
    String nameOfSpacePort;
    FlightControlCenter flightControlCenter;
    Rocket rocket;

    public SpacePort(String nameOfSpacePort) {
        this.nameOfSpacePort = nameOfSpacePort;
    }

    public void setFlightControlCenter(FlightControlCenter flightControlCenter) {
        this.flightControlCenter = flightControlCenter;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }
}

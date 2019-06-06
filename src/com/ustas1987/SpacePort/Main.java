package com.ustas1987.SpacePort;


public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Незнайка");
        SpacePort port = new SpacePort("Байкрнур");
        SpaceShip spaceShip = new SpaceShip("'VOSTOK'");
        FlightControlCenter controlCenter = new FlightControlCenter("ЦУП № 1");
        Rocket rocket = new Rocket("'Сатурн'");

        port.setFlightControlCenter(controlCenter);//в космопорт добавил ЦУП
        controlCenter.setCurrentFlyable(spaceShip);//в ЦУП добавил  корабль
        spaceShip.setPilot(pilot);//в корабль посадил пилота
        controlCenter.setCurrentPilot(pilot);//добавил в космопорт пилота
        spaceShip.setCurrentControlCenter(controlCenter);//в корабль добавил ЦУП

        controlCenter.check();//проверка готовности пилота и корабля к запуску
        spaceShip.readyToStart();//проверка готовности корабля к запуску
        controlCenter.launch();//запуск корабля с пилотом на борту

        port.setRocket(rocket);//в порт добавил рокету
        port.flightControlCenter.setCurrentFlyable(rocket);//добавил в коспорт рокету
        controlCenter.currentFlyingObject.readyToStart();//проверка готовности рокеты к запуску
        port.flightControlCenter.launch();//запуск рокеты

        port.flightControlCenter.setCurrentFlyable(new Flyable() {
            @Override
            public void readyToStart() {
                System.out.println("НЛО котов к запуску");
            }

            @Override
            public void flightToTheMoon() {
                System.out.println("НЛО запущен!!!");
            }
        });
        controlCenter.currentFlyingObject.readyToStart();
        port.flightControlCenter.launch();
    }
}

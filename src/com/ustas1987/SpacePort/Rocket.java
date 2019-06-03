package com.ustas1987.SpacePort;

public class Rocket implements Flyable{
    String nameOfRocket;

    public Rocket(String nameOfRocket)
    {
        this.nameOfRocket = nameOfRocket;
    }

    @Override
    public void readyToStart()
    {
        System.out.println("Рокета " + nameOfRocket + " к запуску готова!");
    }

    @Override
    public void flightToTheMoon()
    {
        System.out.println("Ракета " + nameOfRocket + " успешно запущена со спутником на борту!");
    }
}

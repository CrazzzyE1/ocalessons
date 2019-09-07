package com.ocalessons.lesson11;

public class Car {
    public String color;
    public String engine;
    public int numberOfDoors;

    public Car(String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    public void printInfo(){
        System.out.println(color);
        System.out.println(engine);
        System.out.println(numberOfDoors);
        System.out.println();
    }


}

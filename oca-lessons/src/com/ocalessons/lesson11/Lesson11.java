package com.ocalessons.lesson11;

public class Lesson11 {

    public void changeNumbersOfDoors(Car car, int numberOfDoors){
        car.numberOfDoors = numberOfDoors;
    }

    public void swipeColor(Car c1, Car c2) {
        String str1 = c1.color;
        c1.color= c2.color;
        c2.color = str1;
    }

    public void startLesson11() {
        System.out.println("Start lesson 11");

        Car car1 = new Car("Black", "V8", 4);
        Car car2 = new Car("Red", "V6", 5);
        car1.printInfo();
        car2.printInfo();
        changeNumbersOfDoors(car1, 10);
        changeNumbersOfDoors(car2, 20);
        car1.printInfo();
        car2.printInfo();
        swipeColor(car1, car2);
        car1.printInfo();
        car2.printInfo();





    }
}

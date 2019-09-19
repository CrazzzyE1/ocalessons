package com.ocalessons.lesson12;

public class Lesson12 {

    public void startLesson12(){
        System.out.println("Start lesson 12");
            Car car1 = new Car("Red", "V8", 5);
            Car car2 = new Car("Red", "V8", 8);
            equalMethod(car1, car2);
            equalMethod2(car1, car2);
    }
    public static void equalMethod(Car c1, Car c2) {
        if(c1.color == c2.color && c1.engine == c2.engine && c1.numberOfDoors == c2.numberOfDoors) {
            System.out.println("Машины одинаковые");
        } else {
            System.out.println("Машины разные");
        }
    }

    public static void equalMethod2(Car c1, Car c2) {
        if(c1.numberOfDoors == c2.numberOfDoors){
            if(c1.engine == c2.engine) {
                if(c1.color == c2.color) {
                    System.out.println("EQUALS CARS");
                } else {
                    System.out.println("Color ERROR");
                }

            } else {
                System.out.println("Engine ERROR");
            }
        } else {
            System.out.println("Numbers of doors ERROR");
        }
    }

}

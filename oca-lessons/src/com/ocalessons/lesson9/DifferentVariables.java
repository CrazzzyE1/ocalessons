package com.ocalessons.lesson9;

public class DifferentVariables {
    public void startLesson9() {
        System.out.println("Start lesson 9");
        System.out.println();
        Woman w1 = new Woman("Anna", 18);
        Woman w2 = new Woman("Mila", 25);
        w1.buyCat("Elly", "black");
        w1.buyCar("red", "V6");
        w2.buyDog("Bigl", "White");
        w2.buyCar("gray", "V8");

        System.out.println("Name: " + w1.name + " - age: " + w1.age);
        System.out.println("Her cat: " + w1.cat.name + " - color: " + w1.cat.color);
        System.out.println("Her car's color: " + w1.car.color + " - " + " engine " + w1.car.engine);
        System.out.println();
        System.out.println("Name: " + w2.name + " - age: " + w2.age);
        System.out.println("Her dog: " + w2.dog.name + " - color: " + w2.dog.color);
        System.out.println("Her car's color: " + w2.car.color + " - " + " engine " + w2.car.engine);
        System.out.println();
        System.out.println();
        w1.cat = null;
        w2.dog = null;
        w1.car = null;
        w2.car = null;

        System.out.println("Name: " + w1.name + " - age: " + w1.age);
        if(w1.cat == null & w1.car == null) {
            System.out.println("IS NULL");
        } else {
            System.out.println("Her cat: " + w1.cat.name + " - color: " + w1.cat.color);
            System.out.println("Her car's color: " + w1.car.color + " - " + " engine " + w1.car.engine);
        }

        System.out.println();
        System.out.println("Name: " + w2.name + " - age: " + w2.age);
        if(w2.dog == null & w2.car == null) {
            System.out.println("IS NULL");
        } else {
            System.out.println("Her dog: " + w2.dog.name + " - color: " + w2.dog.color);
            System.out.println("Her car's color: " + w2.car.color + " - " + " engine " + w2.car.engine);
        }






    }
}

package com.ocalessons.lesson9;

public class Woman {
    public String name;
    public int age;
    public Cat cat;
    public Dog dog;
    public Car car;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void buyCat(String name, String color){
        cat = new Cat(name, color);
    }

    public void buyDog(String name, String color){
        dog = new Dog(name, color);
    }

    public void buyCar(String color, String engine){
        car = new Car(color, engine);
    }

}

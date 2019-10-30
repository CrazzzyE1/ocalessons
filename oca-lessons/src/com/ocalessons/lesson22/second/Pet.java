package com.ocalessons.lesson22.second;

public class Pet extends Animal {
    String name;
    int tall = 1;
    public int paw = 4;

    public Pet() {
        System.out.println("I am pet");
        super.eyes = 2;
    }

    public void run() {
        System.out.println("pet runs");
    }

    public void jump() {
        System.out.println("pet jumps");
    }
}

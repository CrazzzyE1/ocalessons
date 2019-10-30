package com.ocalessons.lesson22;

public class Lesson22 {
    public void start() {
        System.out.println("Start Lesson 22");

        Student student1 = new Student();
        student1.showInfo();
        student1.setName(new StringBuilder("Ivan"));
        student1.setCourse(4);
        student1.setGrade(10);
        student1.showInfo();
    }
}

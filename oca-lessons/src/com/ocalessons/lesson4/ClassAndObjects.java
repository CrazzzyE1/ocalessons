package com.ocalessons.lesson4;

import java.text.DecimalFormat;

public class ClassAndObjects {
        public static void print() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.idNumber = 1;
        student1.name = "Ivan";
        student1.Surname = "Ivanov";
        student1.avgMath = 4.0;
        student1.avgEconomy = 3.5;
        student1.avgEnglish = 3.75;
        student1.year = 1995;

        student2.idNumber = 2;
        student2.name = "Petr";
        student2.Surname = "Petrov";
        student2.avgMath = 4.0;
        student2.avgEconomy = 2.75;
        student2.avgEnglish = 4.75;
        student2.year = 1996;

        student3.idNumber = 3;
        student3.name = "Sidor";
        student3.Surname = "Sidorov";
        student3.avgMath = 3.65;
        student3.avgEconomy = 5.0;
        student3.avgEnglish = 4.75;
        student3.year = 1997;

        String s = student3.avgBall();
                System.out.println(s);
    }



}

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

        double avg1 = (student1.avgEnglish + student1.avgEconomy + student1.avgMath) / 3;
        double avg2 = (student2.avgEnglish + student2.avgEconomy + student2.avgMath) / 3;
        double avg3 = (student3.avgEnglish + student3.avgEconomy + student3.avgMath) / 3;

        // Паттерн форматирования строки до двух символов после запятой.
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String format1 = decimalFormat.format(avg1);
        String format2 = decimalFormat.format(avg2);
        String format3 = decimalFormat.format(avg3);


        System.out.println("AvgBall of " + student1.Surname + " " + student1.name +" is " + format1);
        System.out.println("AvgBall of " + student2.Surname + " " + student2.name +" is " + format2);
        System.out.println("AvgBall of " + student3.Surname + " " + student3.name +" is " + format3);
    }



}

package com.ocalessons.lesson4;

import com.ocalessons.lesson5.Employee;

public class ClassAndObjects {
        public static void print() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.idNumber = 1;
        student1.name = "Ivan";
        student1.surname = "Ivanov";
        student1.avgMath = 4.0;
        student1.avgEconomy = 3.5;
        student1.avgEnglish = 3.75;
        student1.year = 1995;

        student2.idNumber = 2;
        student2.name = "Petr";
        student2.surname = "Petrov";
        student2.avgMath = 4.0;
        student2.avgEconomy = 2.75;
        student2.avgEnglish = 4.75;
        student2.year = 1996;

        student3.idNumber = 3;
        student3.name = "Sidor";
        student3.surname = "Sidorov";
        student3.avgMath = 3.65;
        student3.avgEconomy = 5.0;
        student3.avgEnglish = 4.75;
        student3.year = 1997;

        String s = student1.avgBall();
                System.out.println(s);
    }

    public void print2 () {
            Employee em1 = new Employee(1, "Petrov", 18, 20_000.00, "PO");
            Employee em2 = new Employee(2, "Sidorov", 20, 25_000.00, "Soft");
            em1.info();
            em2.info();
            em1.upSalary();
            em2.upSalary();
            em1.info();
            em2.info();
            em1.downSalary();
            em2.downSalary();
            em1.info();
            em2.info();
            em1.downSalary();
            em2.downSalary();
            em1.info();
            em2.info();
    }



}

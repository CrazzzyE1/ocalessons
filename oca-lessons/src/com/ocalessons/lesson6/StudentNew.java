package com.ocalessons.lesson6;

public class StudentNew {
    int idNumber;
    String name;
    String surname;
    int year;
    double avgMath;
    double avgEconomy;
    double avgEnglish;

    public StudentNew(int idNumber, String name, String surname, int year, double avgMath, double avgEconomy, double avgEnglish) {
        this.idNumber = idNumber;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.avgMath = avgMath;
        this.avgEconomy = avgEconomy;
        this.avgEnglish = avgEnglish;
    }

    public StudentNew(int idNumber, String name, String surname, int year){
        this(idNumber, name, surname, year, 0.0, 0.0, 0.0);
    }

    public StudentNew() {

    }
}

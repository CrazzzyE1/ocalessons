package com.ocalessons.lesson4;

import java.text.DecimalFormat;

public class Student {
    int idNumber;
    String name;
    String surname;
    int year;
    double avgMath;
    double avgEconomy;
    double avgEnglish;

    public String avgBall() {
        double avg = (avgEnglish + avgEconomy + avgMath) / 3;

        // Паттерн форматирования строки до двух символов после запятой.
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String format = decimalFormat.format(avg);

        format = "AvgBall of " + surname + " " + name +" is " + format;
        return format;
    }
}

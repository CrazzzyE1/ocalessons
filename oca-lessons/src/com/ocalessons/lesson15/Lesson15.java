package com.ocalessons.lesson15;

public class Lesson15 {
    public void lesson15() {
        System.out.println("Start lesson 15");
    }

    public void clocks() {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        outer:
        while (hours < 6) {
            inner:
            do {
                if (hours > 1 && minutes % 10 == 0 && minutes > 0){
                    break outer;
                }
                while (seconds < 60) {
                    if (seconds * hours > minutes) {
//                        System.out.println("-------------");
                        seconds = 0;
                        minutes++;
                        continue inner;
                    }
                    System.out.println(hours + ":" + minutes + ":" + seconds);
                    seconds++;
                }
                seconds = 0;
                minutes++;
            } while (minutes < 60);
            minutes = 0;
            hours++;
        }
    }
}

package com.ocalessons.lesson14;

public class Lesson14 {
    public void lesson14() {
        System.out.println("Start lesson 14");

    }

    public void clock() {
        OUTER: for (int i = 0; i <= 6; i++) {
            INNER: for (int j = 0; j < 60; j++) {
                if(j > 0 && j % 10 == 0 && i > 1) {
                    break OUTER;
                }
                for (int k = 0; k < 60; k++) {

                    if(k * i > j) {
                        continue INNER;
                    }
                    System.out.println(i + ":" + j + ":" + k);
                }
            }
        }
    }

}

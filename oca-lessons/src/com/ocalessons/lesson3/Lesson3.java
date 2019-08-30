package com.ocalessons.lesson3;

public class Lesson3 {
    public static void print() {
        System.out.println("lesson 3");
        System.out.println();
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;

        System.out.println(result);

        int a = 5;
        int aa = a-- - --a + ++a + a++ + a;

        System.out.println(aa);

        int b = 8;
        int bb = ++b - b++ + ++b - --b;
        System.out.println(bb);

    }
}

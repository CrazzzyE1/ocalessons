package com.ocalessons.lesson16;

public class HomeTaskString {
    public void lessonHomeTask(String str) {
        System.out.println();
        System.out.println("Lesson 16 Home Task");
        int a;
        int b;
        int c = 0;

        while (c < str.length() - 1) {
            a = str.indexOf('@', c);//3
            b = str.indexOf('.', c);//8
            c = str.indexOf(';', c + 1);//11
            System.out.println(str.substring(a + 1, b));
        }
    }
}

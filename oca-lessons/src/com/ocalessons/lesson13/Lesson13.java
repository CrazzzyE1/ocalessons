package com.ocalessons.lesson13;

public class Lesson13 {
    public void lesson13() {
        System.out.println("Start Lesson 13");
        int aa;
        for (int i = 0; i < 9; i++) {
            switchMounth(i);
        }


    }

    public void switchMounth(int a) {
        switch (a) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            default:
                System.out.println("Fucking month");

        }
    }
}

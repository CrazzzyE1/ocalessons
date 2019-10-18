package com.ocalessons.lesson18;

import java.util.Arrays;

public class ArraysLesson {
    public void lesson18() {
        System.out.println("Start lesson 18");
        int[] arr1 = {4, 3, 2, 8, 4, 7, 8};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        Arrays.sort(arr1);
        System.out.println();
        String s = Arrays.toString(arr1);
        System.out.println(s);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]  + " ");
        }

    }
}

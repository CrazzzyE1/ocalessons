package com.ocalessons.lesson18;

import java.util.Arrays;

public class HomeTask {
    public void homeTask () {
        int[] arr1 = {4, -3, 2, 8, -4, 7, 8};
        int [][] arr2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = i*j;
            }

        }
        String s = Arrays.toString(arr1);
        System.out.println(s);
        sortArrays(arr1);
        showArray(arr2);
    }
    // first task
    public void sortArrays(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        String s = Arrays.toString(arr);
        System.out.println(s);
    }

    //second task
    public void showArray(int [][] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{"+arr[i][0]);
            for (int j = 1; j < arr.length; j++) {
                System.out.print(", " + arr[i][j]);
            }
            if(i == arr.length - 1){
                System.out.print("}");
            } else {
                System.out.print("},");
            }

        }
        System.out.print("}");
    }
}

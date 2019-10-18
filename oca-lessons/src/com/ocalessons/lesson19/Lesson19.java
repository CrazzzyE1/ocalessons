package com.ocalessons.lesson19;

import java.util.ArrayList;

public class Lesson19 {
    public void lesson19() {
        System.out.println("Start lesson 19!");


    }

    public String[] stringArrays(String[]... strings) {
        int length = 0;
        for (String[] z : strings) {
            length += z.length;
        }
        int count = 0;
        String s[] = new String[length];
        for (String[] s2 : strings) {
            for (String s1 : s2) {
                s[count] = s1;
                count++;
            }
        }
        return s;

    }

    public void print(String[] d) {
        for (String dd : d) {
            System.out.print(dd + " ");
        }
        System.out.println();
    }

    public void equals(String[] args1, String[] ss) {
        for(String ss1:args1) {
            for (int i = 0; i < ss.length; i++) {
                if(ss1.equals(ss[i])){
                    ss[i] = null;
                }
            }
        }
    }
}

package com.ocalessons.lesson20;

import java.util.ArrayList;

public class Lesson20 {
    public void lesson20() {
        System.out.println("Start Lesson 20");
    }

    public ArrayList<String> myFunction(String... s) {
        ArrayList<String> str = new ArrayList<>();
        for (String ss : s) {
            str.add(ss);
        }
        return str;
    }
}

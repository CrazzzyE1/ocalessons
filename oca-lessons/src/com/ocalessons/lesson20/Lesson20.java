package com.ocalessons.lesson20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lesson20 {
    public void lesson20() {
        System.out.println("Start Lesson 20");
    }

    public ArrayList<String> myFunction(String... s) {
        ArrayList<String> str = new ArrayList<>();
        for (String ss : s) {
            if(!str.contains(ss)){
                str.add(ss);
            }
        }
        Collections.sort(str);
        return str;
    }
}

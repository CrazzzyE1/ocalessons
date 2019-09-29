package com.ocalessons.lesson17;

public class StringBuilderLesson {
    public void lesson17() {
        System.out.println("Start lesson 17");

    }

    public boolean ravenstvo(StringBuilder strb1, StringBuilder strb2) {
        if(strb1.length() != strb2.length()){
            return false;
        }
        for (int i = 0; i < strb1.length(); i++) {
            if (strb1.charAt(i) != strb2.charAt(i)) {
                return false;
            }
        }
        return true;

    }
}

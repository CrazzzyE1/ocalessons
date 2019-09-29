package com.ocalessons.lesson17;

public class SbuilderMethods {
    public void sbMethods() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(7);
        sb.append(10.2);
        StringBuilderLesson sbl = new StringBuilderLesson();
        sb.append(sbl);
        System.out.println(sb);
        System.out.println(sb.charAt(5));
        System.out.println(sb.indexOf("l"));
        System.out.println(sb.indexOf("l", 3));
        System.out.println(sb.replace(10, sb.length(), " Fuck you guys"));
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.delete(5, 10));
        System.out.println(sb.insert(5, ','));
        System.out.println(sb.insert(sb.length(), "!!"));
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.deleteCharAt(sb.length() - 1));
        System.out.println(sb.replace(sb.indexOf("F"), sb.length() - 1, "girls"));


    }
}

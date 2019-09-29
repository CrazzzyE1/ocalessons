package com.ocalessons.lesson16;

public class StringMethods {
    public void lesson16() {
        System.out.println("Start lesson 16");
    }

    public void stringMethod() {
        String sp1 = "Hello";
        String sp2 = " ";
        String sp3 = "world";
        String sp4 = "world";

        String s1 = new String("This is");
        String s2 = new String("good");
        String s3 = new String(" ");
        String s4 = new String("world");

        int sp1Length = sp1.length();
        int sp2Length = sp2.length();
        int sp3Length = sp3.length();
        int sp4Length = sp4.length();
        int s1Length = s1.length();
        int s2Length = s2.length();
        int s3Length = s3.length();
        int s4Length = s4.length();

        System.out.println("" + sp1Length + sp2Length + sp3Length + sp4Length + s1Length + s2Length + s3Length + s4Length);
        System.out.println(sp1 + sp2 + sp3);
        System.out.println(s1 + s3 + s2 + s3 + s4);

        // .concat()
        System.out.print(".Concat: ");
        System.out.println(sp1.concat(sp2.concat(sp3)));

        //indexOf()
        System.out.println("indexOf:");
        System.out.println(s1.indexOf('i')); // char search
        System.out.println(s1.indexOf(" is")); // String search
        System.out.println(s1.indexOf('s', 4)); // Char search from start_index
        System.out.println(s1.indexOf("is", 1)); // String search from start_index

        // . charAt
        System.out.println("charAt:");
        System.out.println(s1.charAt(5));

        // trim
        String s5 = "  five o'clock";
        System.out.println("trim:");
        System.out.println(s5);
        String s6 = s5.trim();
        System.out.println(s6);
        System.out.println(s5.equals(s6));
        System.out.println(s5 == s6);


    }
}

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

        // endsWith
        System.out.println("endsWith:");
        s6 = s1 + s3 + s2 + s3 + s4;
        System.out.println(s6.endsWith("orld")); // поверяет оканчивается ли строка на параметр в скобке, return boolean

        // startWith
        System.out.println("startWith");
        System.out.println(s6.startsWith("Th"));
        System.out.println(s6.endsWith("his"));
        System.out.println(s6.startsWith("his", 1)); // true _ because starts from 1 position


        // toLowerCase
        System.out.println("toLowerCase & toUpperCase");
        System.out.println(s6.toLowerCase());
        System.out.println(s6.toUpperCase());

        // contains
        System.out.println(".contains: ");
        System.out.println(s6.contains("his is")); // true
        System.out.println(s6.contains("his IS good")); // false

        // substring
        System.out.println(".substring");
        String s7 = s6.substring(3);
        String s8 = s6.substring(3, 10);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s7.contains(s8)); // contains one more =)

        //replace
        System.out.println(".replace: ");
        System.out.println(s6);
        System.out.println(s6.replace('i', 'O'));
        System.out.println(s6.replace("is", "DDD"));

        //isBlank & isEmpty
        System.out.println("isBlank & isEmpty Java 11");
//        System.out.println(s6.isBlank()); // return true if  if the string is empty or contains only white space codepoints - otherwise false Java 11
        System.out.println(s6.isEmpty());
        s6 = "";
        System.out.println(s6.isEmpty());

        //.stripLeading stripTrailing strip
        System.out.println(".stripLeading stripTrailing strip");
        System.out.println("repeat(int) - Repeats the String as many times as provided by the int parameter\n" +
                "        lines() - Uses a Spliterator to lazily provide lines from the source string\n" +
                "        isBlank() - Indicates if the String is empty or contains only white space characters\n" +
                "        stripLeading() - Removes the white space from the beginning\n" +
                "        stripTrailing() - Removes the white space from the end\n" +
                "        strip() - Removes the white space from both, beginning and the end of string");

        // equals
        System.out.println();
        System.out.println();
        System.out.println("Equals");
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));

        // other Methods
        s6 = s1 + s3 + s2 + s3 + s4;
        System.out.println(s6);
        System.out.println(s6.length());
        System.out.println(s6.codePointAt(0)); // UTF-8 code for element with index 0
        System.out.println(s6.codePointBefore(1)); // UTF-8 code for element with index 0
        System.out.println(s6.codePointCount(4, 10)); //
        System.out.println(s6.compareTo("o"));
        System.out.println(s6.getBytes());
        System.out.println(s6.hashCode());



    }
}

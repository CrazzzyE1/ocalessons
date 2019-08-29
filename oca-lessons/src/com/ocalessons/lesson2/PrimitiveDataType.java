package com.ocalessons.lesson2;

public class PrimitiveDataType {
    public static void print () {
        byte byte1 = 0B1100; //bin start 0b
        byte byte2 = 014; //oct start 0
        byte byte3 = 12; //decimal default
        byte byte4 = 0xC; //hex start 0x

        int underscore = 1_000_000_000;
        System.out.println(underscore);


        short short1 = -0b10100010100;
        short short2 = -02424;
        short short3 = -1300;
        short short4 = -0x514;

        int int1 = 0b0;
        int int2 = 00;
        int int3 = 0;
        int int4 = 0x0;

        long long1 = 0b111010110111100110100010101L;
        long long2 = 0726746425L;
        long long3 = 123456789L;
        long long4 = 0x75BCD15L;

        float float1 = 2.58f;
        float float2 = 3.75F;
        double double1 = 1.75d;
        double double2 = 1105.75;
        boolean bool1 = true;
        boolean bool2 = false;

        char cr1 = 'A';
        char cr2 = 65;
        char ch3 ='\u0041';


        System.out.println(byte1);
        System.out.println(byte2);
        System.out.println(byte3);
        System.out.println(byte4);
        System.out.println();
        System .out.println(short1);
        System.out.println(short2);
        System.out.println(short3);
        System.out.println(short4);
        System.out.println();
        System .out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
        System.out.println(int4);
        System.out.println();
        System.out.println(long1);
        System.out.println(long2);
        System.out.println(long3);
        System.out.println(long4);
        System.out.println();
        System.out.println(float1);
        System.out.println(float2);
        System.out.println(double1);
        System.out.println(double2);
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println();
        System.out.println(cr1);
        System.out.println(cr2);
        System.out.println(ch3);

    }

}

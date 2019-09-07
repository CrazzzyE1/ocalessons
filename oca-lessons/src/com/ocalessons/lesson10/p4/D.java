package com.ocalessons.lesson10.p4;

import com.ocalessons.lesson10.A;
import com.ocalessons.lesson10.p2.B;
import com.ocalessons.lesson10.p2.p3.C;
import com.ocalessons.lesson10.p4.p5.*;

import static com.ocalessons.lesson10.p2.B.*;


public class D {

    public void testACE() {
        System.out.println("Start test");
        A aa = new A();
        aa.gg = 5;
        aa.bb = 99;
        System.out.println("gg = " + aa.gg);
        System.out.println("bb = " + aa.bb);
        System.out.println();
        C cc = new C(5,8);
        System.out.println("d = " + cc.d);
        System.out.println("e = " + cc.e);
        System.out.println();
        E ee = new E(77, 88);
        System.out.println("h = " + ee.h);
        System.out.println("j = " + ee.j);
        System.out.println();
        B bb = new B(3,4);
        System.out.println("a = " + bb.a);
        System.out.println("c = " + bb.c);
        System.out.println("count = " + bb.count);



    }
}

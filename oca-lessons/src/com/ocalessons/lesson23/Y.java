package com.ocalessons.lesson23;

public class Y extends X {
    public void abc() {
        System.out.println("Y");
    }
    public void def() {
        Y y = new Y(); y.abc();
    }
    public void ghi() {
        X x = new Y();
        x.abc();
    }
}

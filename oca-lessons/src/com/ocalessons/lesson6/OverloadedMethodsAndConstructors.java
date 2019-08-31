package com.ocalessons.lesson6;

public class OverloadedMethodsAndConstructors {


        public void summ() {
            System.out.println("Summ is Null");
        }
        public void summ(int x) {
            System.out.println("Summ is " + x);
        }
        public void summ(int x, int y) {
            System.out.println("Summ is " + (x + y));
        }
    public void summ(int x, int y, int z) {
        System.out.println("Summ is " + (x + y + z));
    }
    public void summ(int x, int y, int z, int p) {
        System.out.println("Summ is " + (x + y + z + p));
    }

    StudentNew stn1 = new StudentNew(1, "Ivanov", "Ivan", 3,4.5, 3.5,2.5);
    StudentNew stn2 = new StudentNew(2, "Petrov", "Petr", 2);
    StudentNew stn3 = new StudentNew();

    public void print(){

        System.out.println(stn1.surname + " " + stn1.year);
        System.out.println(stn2.year + " " + stn2.avgEconomy);
        System.out.println(stn3.name + " " + stn3.avgEnglish);
        System.out.println();

    }
}

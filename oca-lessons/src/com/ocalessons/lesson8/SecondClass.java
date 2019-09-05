package com.ocalessons.lesson8;

public class SecondClass {

         final double PI = 3.14;

         double areaOfCircle(double radius) {
            return radius*PI*radius;
        }

         double circumference(double radius) {
            return 2*PI*radius;
        }

        void sMethod(double radius) {
            System.out.println("Radius is: " + radius);
            double tmp = areaOfCircle(radius);
            System.out.println("Area of a Circle is: " + tmp);
            tmp = circumference(radius);
            System.out.println("Radius is: " + tmp);

        }


}

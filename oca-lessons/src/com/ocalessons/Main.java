package com.ocalessons;

import com.ocalessons.lesson1.BasicPrintFunction;
import com.ocalessons.lesson2.PrimitiveDataType;
import com.ocalessons.lesson3.MathAndLogitalOperation;
import com.ocalessons.lesson4.ClassAndObjects;
import com.ocalessons.lesson4.Student;
import com.ocalessons.lesson5.ConstructorsAndMethods;

public class Main {

    public static void main(String[] args) {
//        BasicPrintFunction basicPrintFunction = new BasicPrintFunction();
//        PrimitiveDataType primitiveDataType = new PrimitiveDataType();
//        MathAndLogitalOperation lesson3 = new MathAndLogitalOperation();
        ClassAndObjects classAndObjects = new ClassAndObjects();
        ConstructorsAndMethods constructorsAndMethods = new ConstructorsAndMethods();

//        basicPrintFunction.print();
//        primitiveDataType.print();
//        MathAndLogitalOperation.print();
        classAndObjects.print();
        constructorsAndMethods.start();
        classAndObjects.print2();



    }
}

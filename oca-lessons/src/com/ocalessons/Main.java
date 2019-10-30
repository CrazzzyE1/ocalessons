package com.ocalessons;

import com.ocalessons.lesson22.first.Lesson22;
import com.ocalessons.lesson22.first.Student;
import com.ocalessons.lesson22.second.Cat;
import com.ocalessons.lesson22.second.Dog;


public class Main {

    public static void main(String[] args) {
//        BasicPrintFunction basicPrintFunction = new BasicPrintFunction();
//        PrimitiveDataType primitiveDataType = new PrimitiveDataType();
//        MathAndLogitalOperation lesson3 = new MathAndLogitalOperation();
//        ClassAndObjects classAndObjects = new ClassAndObjects();
//        ConstructorsAndMethods constructorsAndMethods = new ConstructorsAndMethods();
//        OverloadedMethodsAndConstructors omac = new OverloadedMethodsAndConstructors();

//        basicPrintFunction.print();
//        primitiveDataType.print();
//        MathAndLogitalOperation.print();
//        classAndObjects.print();
//        constructorsAndMethods.start();
//        classAndObjects.print2();
//        omac.summ();
//        omac.summ(5);
//        omac.summ(6, 7);
//        omac.summ(8,5,4,6);
//        omac.summ(8,6,4,9);
//        System.out.println();
//        omac.print();
//        Employee emp1 = new Employee(1, "Petrov", 1, 500.0, "SOFT");
//        Employee emp2 = new Employee(2, "Sidorov", 500.0);
//        Default constructor don't work in other Class
//        Employee emp3 = new Employee(3,500.0);
        //      Private CONSTRUCTOR DON'T WORK;


//        emp1.printId();
//        emp1.printSurname();
//        emp1.printSalary();
//        System.out.println(emp1.surname);
//        System.out.println(emp1.id);
//        System.out.println(emp1.salary);
//        Don't work because they default and private
// lesson 8
//        FinalStaticLesson fsl = new FinalStaticLesson();
//        fsl.startLesson8();
// lesson 9
//        DifferentVariables dv = new DifferentVariables();
//        dv.startLesson9()
// lesson 10
//        A is = new A();
//        is.startLesson10();
//        D dd = new D();
//        dd.testACE();

        // lesson 11
//        Lesson11 l11 = new Lesson11();
//        l11.startLesson11();

        // lesson 12
//        Lesson12 l12 = new Lesson12();
//        l12.startLesson12();

        // lesson 13
//        Lesson13 l13 = new Lesson13();
//        l13.lesson13();

        // lesson 14
//        Lesson14 l14 = new Lesson14();
//        l14.lesson14();
//        l14.clock();

        // lesson 15
//        Lesson15 l15 = new Lesson15();
//        l15.lesson15();
//        l15.clocks();

        // lesson 16
//        StringMethods l16 = new StringMethods();
//        l16.lesson16();
//        l16.stringMethod();
//        HomeTaskString ht = new HomeTaskString();
//        ht.lessonHomeTask("abc@mail.ru; gdc@gmail.com; ya@yandex.ru;");

        // lesson 17
//        StringBuilderLesson sbl = new StringBuilderLesson();
//        sbl.lesson17();
//        StringBuilder str1 = new StringBuilder("Hello");
//        StringBuilder str2 = new StringBuilder("Hello");
//        System.out.println(sbl.ravenstvo(str1, str2));
//        SbuilderMethods sbm = new SbuilderMethods();
//        sbm.sbMethods();

        // lesson 18
//        ArraysLesson al = new ArraysLesson();
//        al.lesson18();
//        HomeTask ht = new HomeTask();
//        ht.homeTask();

        // lesson 19
//        Lesson19 l19 = new Lesson19();
//        l19.lesson19();
//
//        String[] args1 = {"Hello" , "Oh"};
//        String[] s1 = {"Hello", "World"};
//        String[] s2 = {"Oh", "My", "God"};
//        String ss[] = l19.stringArrays(s1, s2);
//
//        l19.print(ss);
//        l19.equals(args1, ss);
//        l19.print(args1);
//        l19.print(ss);
//


        // lesson 20
//
//        Lesson20 l20 = new Lesson20();
//        l20.lesson20();
//        System.out.println(l20.myFunction("d", "v", "g", "v", "p", "a", "c"));

//        //lesson 21
//        Lesson21 l21 = new Lesson21();
//        l21.start();

        //lesson 22
        Lesson22 l22 = new Lesson22();
        l22.start();
//        Student student2 = new Student();
//        student2.setName(new StringBuilder("Vasia"));
//        student2.setCourse(3);
//        student2.setGrade(8);
//        student2.showInfo();
        Dog dog = new Dog("Bob");
        System.out.println(dog.paw);
        Cat cat = new Cat("Barcelona");
        cat.sleep();
    }
}

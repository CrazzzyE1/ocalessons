package com.ocalessons.lesson7;

public class CreateClass {
    Employee emp2 = new Employee(2, "Sidorov", 500.0);
//    Employee emp3 = new Employee(3,500.0);
//      Private CONSTRUCTOR DON'T WORK;
    public void myFunction(){
        emp2.printSalary();
        System.out.println(emp2.surname);
        System.out.println(emp2.id);
//        System.out.println(emp2.salary);
//        Don't work because they default and private


    }


}

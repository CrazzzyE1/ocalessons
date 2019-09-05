package com.ocalessons.lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;


    // Constructors

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

     Employee(int id, String surname, double salary) {
        this(id, surname, 0, salary, null);
    }

    private Employee(int id, double salary) {
        this(id, null, 0, salary, null);
    }

    // Methods

    public void printSurname() {
        System.out.println("Surname is: " + surname);
    }

    public void printId() {
        System.out.println("ID is: " + id);
    }

    public void printSalary() {
        System.out.println("Salary is: " + salary);
    }


}

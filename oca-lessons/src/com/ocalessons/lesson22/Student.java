package com.ocalessons.lesson22;

public class Student {

    private StringBuilder name = new StringBuilder("Default");
    private int course = -1;
    private int grade = -1;

    // Getters and Setters
    public StringBuilder getName() {
        StringBuilder s = new StringBuilder(name);
        return s;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Name's length must be more 2");
        }

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11) {
            this.grade = grade;
        }
    }

    //Methods
    public void showInfo() {
        System.out.println("Name is: " + getName());
        System.out.println("Course is: " + getCourse());
        System.out.println("Grade is: " + getGrade());
    }


}

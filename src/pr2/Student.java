package pr2;

import java.io.*;
import java.util.Scanner;

public class Student {
    String name;
    int id, year;
    private double grade;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.year = 1;
        this.grade = 0.0;
    }

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.year = 1;
        this.grade = grade;
    }

    public String getName() {      // ← добавить public
        return name;
    }

    public int getId() {           // ← добавить public
        return id;
    }

    public int getYearOfStudy() {  // ← добавить public
        return year;
    }

    public double getGrade() {     // ← добавить public
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setName(String name) {  // ← добавить public
        this.name = name;
    }

    public void setId(int id) {        // ← добавить public
        this.id = id;
    }

    void incremyear() {
        year++;
    }

    void display() {
        System.out.println("Student name: " + name + " Student id: " + id + " Increment year of study: " + year + " Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Asylbek", 18);
        System.out.println(student1.getName());
        System.out.println(student1.getId());
        System.out.println(student1.getYearOfStudy());
        student1.incremyear();
    }
}
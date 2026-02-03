package pr2;
import java.io.*;
import java.util.Scanner;


public class Student {
    String name;
    int id,year;
    Student(String name,int id){
     this. name = name;
     this. id = id;
     this. year = 1;
    }
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
    int getYearOfStudy(){
        return year;
    }

    void incremyear(){
           year++;
        }

    void display(){
        System.out.println("Student name: " + name  + " Student id: " + id + " Increment year of study: " + year);
    }
     public static void main(String[] args){
        Student student1 = new Student("Asylbek",18) ;
        System.out.println(student1.getName());
        System.out.println(student1.getId());
         System.out.println(student1.getYearOfStudy());

         student1.incremyear();

     }
     }


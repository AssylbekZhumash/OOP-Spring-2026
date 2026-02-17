package lab1.problem4;

import pr2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course course = new Course(
                "CS101 Object-oriented Programming and Design",
                "Introduction to OOP",
                3,
                "none"
        );

        GradeBook gradeBook = new GradeBook(course);

        String[] names = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        int[] ids = {1, 4, 3, 87, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 10; i++) {
            gradeBook.addStudent(new Student(names[i], ids[i]));
        }

        gradeBook.displayMessage();
        System.out.println();
        System.out.println("Please, input grades for students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + names[i] + ": ");
            double grade = scanner.nextDouble();
            gradeBook.getStudents().get(i).setGrade(grade);
        }

        System.out.println();
        gradeBook.displayGradeReport();

        scanner.close();
    }
}
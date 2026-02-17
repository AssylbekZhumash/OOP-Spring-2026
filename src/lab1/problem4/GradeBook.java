package lab1.problem4;

import pr2.Student;              // ← импорт из pr2
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeBook {
    private Course course;
    private List<Student> students;

    public GradeBook() {
        this.course = new Course();
        this.students = new ArrayList<>();
    }

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void displayGradeReport() {
        System.out.println("Class average is " + String.format("%.2f", determineClassAverage()) +
                ". Lowest grade is " + getWorstGrade() +
                " (Student " + getWorstStudentName() + ", id: " + getWorstStudentId() + ").");
        System.out.println("Highest grade is " + getBestGrade() +
                " (Student " + getBestStudentName() + ", id: " + getBestStudentId() + ").");

        System.out.println("\nGrades distribution:");
        outputBarChart();
    }

    public double determineClassAverage() {
        if (students.isEmpty()) return 0;
        double sum = 0;
        for (Student s : students) sum += s.getGrade();
        return sum / students.size();
    }

    public double getBestGrade() {
        double best = 0;
        for (Student s : students) {
            if (s.getGrade() > best) best = s.getGrade();
        }
        return best;
    }

    public String getBestStudentName() {
        Student best = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > best.getGrade()) best = s;
        }
        return best.getName();
    }

    public int getBestStudentId() {
        Student best = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > best.getGrade()) best = s;
        }
        return best.getId();
    }

    public double getWorstGrade() {
        double worst = 100;
        for (Student s : students) {
            if (s.getGrade() < worst) worst = s.getGrade();
        }
        return worst;
    }

    public String getWorstStudentName() {
        Student worst = students.get(0);
        for (Student s : students) {
            if (s.getGrade() < worst.getGrade()) worst = s;
        }
        return worst.getName();
    }

    public int getWorstStudentId() {
        Student worst = students.get(0);
        for (Student s : students) {
            if (s.getGrade() < worst.getGrade()) worst = s;
        }
        return worst.getId();
    }

    public void outputBarChart() {
        int[] ranges = new int[11];

        for (Student s : students) {
            double grade = s.getGrade();
            int rangeIndex = (grade == 100) ? 10 : (int) (grade / 10);
            if (rangeIndex >= 0 && rangeIndex <= 10) {
                ranges[rangeIndex]++;
            }
        }

        for (int i = 0; i <= 9; i++) {
            int lower = i * 10;
            int upper = i * 10 + 9;
            System.out.print(lower + "-" + upper + ": ");
            for (int j = 0; j < ranges[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("100: ");
        for (int j = 0; j < ranges[10]; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "GradeBook{course=" + course.getName() + "}";
    }
}
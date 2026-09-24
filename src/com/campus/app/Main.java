package com.campus.app;
import com.campus.model.Student;
import com.campus.service.StudentService;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   //inputs from user
   System.out.println("Enter the student id:");
   int id = scanner.nextInt();
   System.out.println("Enter the student name:");
    String name = scanner.next();
    System.out.println("Enter the student age:");
    int age = scanner.nextInt();
    System.out.println("Enter the student department:");
    String department = scanner.next();
    System.out.println("Enter the number of subjects:");
    int numSubjects = scanner.nextInt();
    int[] marks = new int[numSubjects];
    for (int i = 0; i < numSubjects; i++) {
        System.out.println("Enter the mark of subject " + (i + 1) + ":");
        marks[i] = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

    }
    Student student = new Student(id, name, age, department, marks);
    student.displayStudentInfo( true);
    Student.displayStudentCount();
    StudentService service = new StudentService();
    
  }
}
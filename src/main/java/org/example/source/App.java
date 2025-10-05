package org.example.source;

import java.lang.reflect.Type;

// Here we will design the application for the student management system
// This is the main class for the application
// It will contain the main method to run the application
public class App {
  public static void main(String[] args) {
    StudentRepository repo = new StudentRepository();

    repo.addStudent(new Student(1, "Mrunal", 22));
    repo.addStudent(new Student(2, "Krunal", 23));

    System.out.println(repo.getAllStudents());
    System.out.println(repo.getStudent(1));
    repo.updateStudent(1,new Student(3,"Ram", 22));
    repo.deleteStudent(1);

    System.out.println(repo.getAllStudents());
  }
}

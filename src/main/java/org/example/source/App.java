package org.example.source;

import static java.lang.System.exit;

import java.util.Scanner;

public class App implements AppInterface {

  private final StudentRepository repository = new StudentRepository();

  private final Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {

    App app = new App();
    System.out.println("Student Management System");
    System.out.println("Add, Get, Update, Delete Student");
    System.out.println("------------------------------");
    System.out.println("Create new student : 1");
    System.out.println("Update student : 2");
    System.out.println("Delete student : 3");
    System.out.println("Read student : 4");


    while (true) {
      System.out.print("Enter Number: ");
      if (!app.sc.hasNextInt()) {
        System.out.println("Invalid input. Please enter a number.");
        app.sc.next(); // Consume invalid input
        continue;
      }
      int input = app.sc.nextInt();
      app.sc.nextLine(); // Consume newline
      switch (input) {
        case 1:
          app.addStudent();
          break;
        case 2:
          app.updateStudent();
          break;
        case 3:
          app.deleteStudent();
          break;
        case 4:
          app.readStudent();
          break;
        default:
          exit(0);
      }
    }
  }

  @Override
  public void addStudent() {
    System.out.println("Enter student details");
    System.out.println("ID, Name, Age");
    int id = sc.nextInt();
    String name = sc.next();
    int age = sc.nextInt();
    repository.addStudent(new Student(id, name, age));
    System.out.println("Students added successfully");
    readStudent();
  }

  @Override
  public void deleteStudent() {
    System.out.println("Enter Student ID for deletion");
    int id = sc.nextInt();
    repository.deleteStudent(id);
    readStudent();
  }

  @Override
  public void readStudent() {
    System.out.println("Current Students");
    for(int i = 0; i < repository.getAllStudents().size(); i++){
      System.out.println(repository.getAllStudents().get(i).toString());
    }
  }

  @Override
  public void updateStudent() {
    System.out.println("Enter ID of student to update:");
    int id = sc.nextInt();
    System.out.println("Enter new Name and Age:");
    String name = sc.next();
    int age = sc.nextInt();
    repository.updateStudent(id, new Student(id, name, age));
    System.out.println("Student updated.");
    readStudent();
  }
}

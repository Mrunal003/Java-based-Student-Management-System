package org.example.source;

public class Student extends Person{

  private int id;

  public Student(int id, String name, int age) {
    super(name,age);
    this.id = id;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "ID: " + id + " | Name: " + getName() + " | Age: " + getAge() + " ";
  }

}

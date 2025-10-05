package org.example.source;

public class Student {
  int id;
  String name;
  int age;

  public Student(int id, String name, int age){
    this.id = id;
    this.name =name;
    this.age = age;
  }

  public int getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  @Override
  public String toString(){
    return "ID: " + id + " | Name: " + name + " | Age: " + age+ " ";
  }

}

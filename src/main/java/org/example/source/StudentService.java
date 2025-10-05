package org.example.source;

import java.util.List;

public interface StudentService {

  void addStudent(Student student);

  Student getStudent(int id);

  List<Student> getAllStudents();

  void updateStudent(int id, Student updatedStudent);

  void deleteStudent(int id);
}

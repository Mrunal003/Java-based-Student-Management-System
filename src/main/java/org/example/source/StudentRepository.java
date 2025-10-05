package org.example.source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepository implements StudentService {

  private Map<Integer, Student> studentMap = new HashMap<>();

  @Override
  public void addStudent(Student student) {
    studentMap.put(student.getId(), student);
  }

  @Override
  public List<Student> getAllStudents() {
    return new ArrayList<>(studentMap.values());
  }

  @Override
  public Student getStudent(int id) {
    return studentMap.get(id);
  }

  @Override
  public void updateStudent(int id, Student updatedStudent) {
    studentMap.put(id, updatedStudent);
  }

  @Override
  public void deleteStudent(int id) {
    studentMap.remove(id);
  }
}

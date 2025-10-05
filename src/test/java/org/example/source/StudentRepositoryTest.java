package org.example.source;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentRepositoryTest {
  @Test
  void testAddStudent(){
    StudentRepository repository = new StudentRepository();
    repository.addStudent(new Student(1, "Mrunal", 22));

    Student result = repository.getStudent(1);
    assertNotNull(result);
    assertEquals("Mrunal", result.getName());
    assertEquals(22, result.getAge());
  }
}

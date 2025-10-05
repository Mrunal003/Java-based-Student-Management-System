package org.example.source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class StudentRepositoryTest {

  @Mock
  private StudentRepository mockRepository;

  @BeforeEach
  void setUp(){
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testAddStudentWithMock(){
    Student student = new Student(1, "Mrunal", 22);

    mockRepository.addStudent(student);

    verify(mockRepository, times(1)).addStudent(student);
  }

  StudentRepository repository = new StudentRepository();
  private  void InitializeRepository(){
    repository.addStudent(new Student(1, "Mrunal", 22));
    repository.addStudent(new Student(2, "John", 25));
  }

  @Test
  void testAddStudent() {
    InitializeRepository();
    Student result = repository.getStudent(1);
    assertNotNull(result);
    assertEquals("Mrunal", result.getName());
    assertEquals(22, result.getAge());
  }

  @Test
  void testdeleteStudent(){
    repository.addStudent(new Student(1, "Mrunal", 22));
    repository.deleteStudent(1);
    assertEquals(0, repository.getAllStudents().size());
  }

  @Test
  void testUpdateStudent(){
    repository.updateStudent(1, new Student(1,"Ram", 24));
    assertEquals("Ram", repository.getStudent(1).name);
  }

  @Test
  void testShowStudent(){
    InitializeRepository();
    assertEquals(2, repository.getAllStudents().size());
  }
}

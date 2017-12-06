package domain.mediator;

import domain.model.Student;

import java.util.List;

public interface IModelManager {

    void addStudent(Student student);
    List<Student> getStudents();
}

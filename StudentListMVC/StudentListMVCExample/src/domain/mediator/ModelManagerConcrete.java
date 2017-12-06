package domain.mediator;

import domain.model.Student;

import java.util.List;

public final class ModelManagerConcrete implements IModelManager {

    private final List<Student> studentList;


    public ModelManagerConcrete(List<Student> studentList) {
        this.studentList = studentList;
    }


    @Override
    public void addStudent(Student student) {
        studentList.add( student );
        // Save to files
    }

    @Override
    public List<Student> getStudents() {
        return studentList;
    }
}

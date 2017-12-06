package view;

import controller.IController;
import domain.model.Student;

import java.util.List;

public interface IView {

    void displayStudentList(List<Student> studentList);
    String getAddStudentID();
    String getAddStudentName();
    void setController(IController controller);
    void clearInputFields();
}

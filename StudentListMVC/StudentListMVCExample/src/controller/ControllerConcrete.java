package controller;

import domain.mediator.IModelManager;
import domain.model.Student;
import view.IView;

import java.util.List;

public final class ControllerConcrete implements IController {

    private final IModelManager modelManager;
    private final IView view;

    public ControllerConcrete(IModelManager modelManager, IView view) {
        this.modelManager = modelManager;
        this.view = view;
        view.setController( this );
    }

    @Override
    public void addStudentRequest() {
        String ID = view.getAddStudentID();
        String name = view.getAddStudentName();
        Student student = new Student( ID, name );
        modelManager.addStudent( student );
        view.clearInputFields();
    }

    @Override
    public void updateStudentsRequest() {
        List<Student> students = modelManager.getStudents();
        System.out.println( students );
        view.displayStudentList( students );
    }
}

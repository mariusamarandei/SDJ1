import controller.ControllerConcrete;
import controller.IController;
import domain.mediator.IModelManager;
import domain.mediator.ModelManagerConcrete;
import domain.model.Student;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import view.IView;
import view.ViewJavaFX;
import view.ViewTable;

import java.util.ArrayList;
import java.util.List;

public final class MVCMain {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        IModelManager modelManager = new ModelManagerConcrete( studentList );

//        IView view = new ViewTable( "Students" );
        IView view = ViewJavaFX.loadView( "Students" );

        IController controller = new ControllerConcrete( modelManager, view );
    }

}

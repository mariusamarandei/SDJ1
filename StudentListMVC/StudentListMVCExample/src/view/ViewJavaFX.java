package view;

import controller.IController;
import domain.model.Student;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public final class ViewJavaFX implements IView {

    @FXML private TableView<Student> tableViewStudent;
    @FXML private TableColumn<Student, String> tableColumnID;
    @FXML private TableColumn<Student, String> tableColumnName;

    @FXML private TextField textFieldStudentID;
    @FXML private TextField textFieldStudentName;

    private final ObservableList<Student> studentObservableList = FXCollections.observableArrayList();
    private IController controller;

    @FXML
    private void initialize() {
        initializeTable();
    }

    public static ViewJavaFX loadView(String title) {
        new JFXPanel();
        FXMLLoader loader = new FXMLLoader( ViewJavaFX.class.getResource( "./student_page.fxml" ) );
        try {
            Parent root = loader.load();
            ViewJavaFX controller = loader.getController();
            Platform.runLater( () -> {
                Stage stage = new Stage();
                stage.setTitle( title );
                Scene scene = new Scene( root );
                stage.setScene( scene );
                stage.show();
            } );
            return controller;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println( "FXML loading failed, terminating application" );
            System.exit( 1 );
        }
        return null;
    }


    private void initializeTable() {
        tableViewStudent.setItems( studentObservableList );
        tableColumnID.setCellValueFactory( cellData -> new ReadOnlyStringWrapper( cellData.getValue().getID() ) );
        tableColumnName.setCellValueFactory( cellData -> new ReadOnlyStringWrapper( cellData.getValue().getName() ) );
    }

    @Override
    public void displayStudentList(List<Student> studentList) {
        this.studentObservableList.clear();
        this.studentObservableList.addAll( studentList );
    }

    @Override
    public String getAddStudentID() {
        return textFieldStudentID.getText();
    }

    @Override
    public String getAddStudentName() {
        return textFieldStudentName.getText();
    }

    @Override
    public void setController(IController controller) {
        if ( this.controller != null ) {
            throw new IllegalStateException( "Controller already set!" );
        }
        this.controller = controller;
    }

    @Override
    public void clearInputFields() {
        textFieldStudentID.clear();
        textFieldStudentName.clear();
    }

    @FXML
    private void buttonUpdateClicked(ActionEvent actionEvent) {
        controller.updateStudentsRequest();
    }


    @FXML
    private void buttonAddStudentClicked(ActionEvent actionEvent) {
        controller.addStudentRequest();
    }

    public static class JavaFXApplication extends Application {

        @Override
        public void start(Stage stage) throws Exception {
           
        }
    }
}

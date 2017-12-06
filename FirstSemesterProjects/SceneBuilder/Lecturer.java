package SceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lecturer extends Application {

	@Override
	public void start(Stage stage) throws Exception
	{
		// instantiate and invoke the FXML Loader
	   FXMLLoader loader = new FXMLLoader();
	   
	   // set controller
	   loader.setController(new LecturerController());
	   
	   // set the location of the FXML doc
	   loader.setLocation(getClass().getResource("Lecturer.fxml"));
	   Parent root = loader.load();
	   
	   // Build the scene graph
	   Scene scene = new Scene(root);
	   
	   // show the window using the scene graph
	   stage.setTitle("Lecturer");
	   stage.setScene(scene);
	   stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

package SceneBuilder;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ViaEvents extends Application {

	@Override
	public void start(Stage stage) throws Exception
	{
	   //instantiate and invoke the fxml loader
		FXMLLoader loader = new FXMLLoader();
		
		// set controller
		loader.setController(new ViaController());
		
		//set the location of the FXML doc
		loader.setLocation(getClass().getResource("ViaEvents.fxml"));
		Parent root = loader.load();
		
		// Build the scene graph
		Scene scene = new Scene(root);
		
		// show the window using the scene graph
		stage.setTitle("VIA Centre Events");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

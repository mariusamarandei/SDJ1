package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyFirstJavaFx extends Application {

	@Override
	public void start(Stage primaryStage) {
		// create a scene and place a button in the scene
	   Button btnHello = new Button("Hello");
	   btnHello.setOnAction(new EventHandler<ActionEvent>()
	         {
	      public void handle (ActionEvent event)
	      {
	         Alert alert = new Alert(AlertType.INFORMATION);
	         alert.setTitle("My First JavaFX Info Box");
	         alert.setHeaderText("Awesome Java Application");
	         alert.setContentText("Hello everyone! Don't give up. Life is good!");
	         alert.showAndWait();
	      }
	      
	         });
	   
	         
	   Scene scene = new Scene(btnHello, 400, 300);
	   primaryStage.setTitle("My First JavaFX App"); // just the title
	   // place the Scene on the Stage
	   primaryStage.setScene(scene);
	   // let the show begin
	   primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

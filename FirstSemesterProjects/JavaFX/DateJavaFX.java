package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DateJavaFX extends Application {

	@Override
	public void start(Stage primaryStage) {
	   Button btnShow = new Button("Show");
	   Label day = new Label("Day: ");
	   Label month = new Label("Month: ");
	   Label year = new Label("Year: ");
	   Text tDay = new Text();
	   Text tMonth = new Text();
	   Text tYear = new Text();
	  
	   Pane button = new Pane(btnShow);
	   Pane panelLabel = new Pane(day, month, year);
	   Pane panelText = new Pane(tDay, tMonth, tYear);
	   
	   GridPane grid = new GridPane();
      grid.setHgap(10);
      grid.setVgap(12);
      
      
      grid.add(day, 0, 0, 5 ,6);
      grid.add(month, 1, 0, 7 ,8);
      grid.add(year, 0, 1);
      grid.add(tDay, 1, 1);
      grid.add(tMonth, 0, 2, 2, 1);
      grid.add(tYear, 2,2);
      
      AnchorPane anchor = new AnchorPane(panelLabel, panelText, button, grid);
      Scene scene = new Scene(anchor, 500, 200);
	   primaryStage.setTitle("Date GUI");
	   primaryStage.setScene(scene);
	   primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

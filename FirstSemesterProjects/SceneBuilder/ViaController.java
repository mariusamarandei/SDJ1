package SceneBuilder;

import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViaController
{
   @FXML
   private Label lblName;

   @FXML
   private Label lblDate;

   @FXML
   private Label lblTime;

   @FXML
   private Label lblPlace;

   @FXML
   private TextField txtName;

   @FXML
   private DatePicker txtDate;

   @FXML
   private TextField txtTime;

   @FXML
   private TextField txtPlace;

   @FXML
   private Button btnCreate;

   public void initialize()
   {
      // performs any necessary inits
   }

   // Event listeners to the buttons
   public void createEvent()
   {
      String eName = txtName.getText();
      eName = String.format("Name : %s", eName);

      String eDate = txtDate.getEditor().getText();
      eDate = String.format("Date:  %s", eDate);

      String eTime = txtTime.getText();
      eTime = String.format("Time: %s", eTime);

      String ePlace = txtPlace.getText();
      ePlace = String.format("Place: %s", ePlace);

      String tempStr = String.format("%s \n %s \n %s \n %s \n ", eName, eDate,
            eTime, ePlace);

      JOptionPane.showMessageDialog(null, tempStr);
   }
}

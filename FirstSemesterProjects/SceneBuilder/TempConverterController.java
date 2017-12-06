package SceneBuilder;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TempConverterController
{
   @FXML
   private Label lblTemp;

   @FXML
   private TextField txtFieldTemp;

   @FXML
   private Button btnToCelcius;

   @FXML
   private Button btnToFahrenheit;

   // relate to Temperature class
   private Temperature temperature = new Temperature();

   public void initialize()
   {
      // performs any necessary inits
   }

   // Event listeners to the buttons
   public void convertToCelcius()
   {
      String tmpStr = txtFieldTemp.getText();
     // double celVal = 5.0/12.0 * (Double.parseDouble(tmpStr) - 32);
      double celVal = temperature.fahrenheitToCelcius(Double.parseDouble(tmpStr));
      tmpStr = String.format("%s Fahrenheit = %.2f Celcius", tmpStr, celVal);
     
      // Display the result in an option pane
      JOptionPane.showMessageDialog(null, tmpStr);
      
   }

   public void convertToFahrenheit()
   {
      String tmpStr = txtFieldTemp.getText();
      double fahVal = Double.parseDouble(tmpStr) * 9.0 / 5.0 + 32;
      tmpStr = String.format("%s Celsius = %.2f Fahrenheit", tmpStr, fahVal);
      // Display the result in an option pane
      JOptionPane.showMessageDialog(null, tmpStr);
   }
}

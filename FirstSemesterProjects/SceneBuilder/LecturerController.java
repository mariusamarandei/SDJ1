package SceneBuilder;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * This program is the controller of the Lecturer class
 * 
 * 
 * 
 * @version 2.0
 * 
 * @author Marius
 * 
 * @param Name
 * @param Email
 * @param Salary
 * @param Subject
 * 
 *       
 *
 */

public class LecturerController
{

   @FXML
   private Label lblName;

   @FXML
   private TextField txtName;

   @FXML
   private Button btnAdd;

   @FXML
   private TextField txtSalary;

   @FXML
   private TextField txtEmail;

   @FXML
   private Label lblEmail;

   @FXML
   private TextField txtSubject;

   @FXML
   private Label lblSalary;

   @FXML
   public void addLecturer()
   {
      String eName = txtName.getText();

      String eEmail = txtEmail.getText();

      String eSalary = txtSalary.getText();

      String eSubject = txtSubject.getText();

      String tempStr = "Name: " + eName + "\n Email: " + eEmail + "\n Salary: "
            + eSalary + "\nSubject: " + eSubject;

      JOptionPane.showMessageDialog(null, tempStr);
   }

}

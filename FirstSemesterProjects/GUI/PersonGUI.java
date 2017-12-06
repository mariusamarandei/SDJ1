package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import javax.swing.*;

public class PersonGUI extends JFrame
{
   private JTextField textFieldName;
   private JTextField textFieldAge;
   private JLabel labelName;
   private JLabel labelAge;
   private JLabel nameAndAge;
   private Person person;
   private JButton showButton;
   private JLabel status;
   private JButton addYear;

   public PersonGUI()
   {
      super("Person GUI");
      createComponents();
      initializeComponents();
      registerEventHandlers();
      addComponentsToFrame();
   }

   private void createComponents()
   {
      person = null;
      textFieldName = new JTextField(6);
      textFieldAge = new JTextField(6);
      labelName = new JLabel("Name: ");
      labelAge = new JLabel("Age: ");
      showButton = new JButton("Show");
      nameAndAge = new JLabel("Age and Name : ");
      status = new JLabel("Person status: ");
      addYear = new JButton("Add one year");

   }

   private void initializeComponents()
   {
      setSize(500, 260); // set frame size
      setLocationRelativeTo(null); // center of the screen
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textFieldName.setText("");
      textFieldAge.setText("");
      setVisible(true);
   }

   private void addComponentsToFrame()
   {
      JPanel panelName = new JPanel(new BorderLayout());
      panelName.add(textFieldName, BorderLayout.EAST);
      panelName.add(labelName, BorderLayout.WEST);
      JPanel panelAge = new JPanel(new BorderLayout());
      panelAge.add(textFieldAge, BorderLayout.EAST);
      panelAge.add(labelAge, BorderLayout.WEST);
      JPanel panelPerson = new JPanel(new FlowLayout());
      panelPerson.add(panelName, BorderLayout.SOUTH);
      panelPerson.add(panelAge, BorderLayout.NORTH);
      JPanel newPanel = new JPanel(new BorderLayout());
      newPanel.add(nameAndAge);
      JPanel button = new JPanel();
      button.add(addYear);
      button.add(showButton);
      JPanel panelStatus = new JPanel(new BorderLayout());
      panelStatus.add(status, BorderLayout.CENTER);
      JPanel contentPane = new JPanel(new GridLayout(3, 1, 5, 5));
      contentPane.add(panelPerson, BorderLayout.CENTER);
      contentPane.add(button, BorderLayout.EAST);
      contentPane.add(newPanel, BorderLayout.PAGE_START);
      contentPane.add(panelStatus, BorderLayout.PAGE_START);

      setContentPane(contentPane);

   }

   private void registerEventHandlers()
   {
      Buttonhandler handler = new Buttonhandler();
      showButton.addActionListener(handler);
      addYear.addActionListener(handler);

   }

   private class Buttonhandler implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         String msg = textFieldName.getText();
         String msg1 = textFieldAge.getText();
         int age = Integer.parseInt(msg1);
         if (event.getSource() == showButton)
         {
            if (age > 0 && age < 150)

            {
               Person person = new Person(msg, age);
               nameAndAge.setText("Name and Age: " + person.toString());
               status.setText("Status: " + person.getStatus());
            }

            else
            {
               nameAndAge.setText("Illegal Age");

            }
            if (event.getSource() == addYear)
            {

               age = age + 1;
               Person person = new Person(msg, age);
               nameAndAge.setText("Name and Age: " + person.toString());
               String msg2 = String.valueOf(age);
               textFieldAge.setText(msg2);
            }
         }
      }
   }

   public static void main(String[] args)
   {
      PersonGUI frame = new PersonGUI();
      frame.setVisible(true);
   }
}
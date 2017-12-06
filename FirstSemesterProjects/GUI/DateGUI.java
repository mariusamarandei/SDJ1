package GUI;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class DateGUI extends JFrame
{
   private JFrame win;
   private JLabel labelDay;
   private JLabel labelDate;
   private JLabel labelMonth;
   private JLabel labelYear;
   private JTextField textDay;
   private JTextField textMonth;
   private JTextField textYear;
   private JButton buttonShow;
   private JButton buttonStep;
   
   
   public static void main(String[] args)
   {
     DateGUI window = new DateGUI();
     window.setVisible(true);
     
   }
   
   public DateGUI()
   {
      super("Date GUI");
      createComponents();
      initializeComponents();
      addComponentsToFrame();     
      registerEventHandlers();
   }
   
   private void registerEventHandlers()
   {
      ButtonHandler handler = new ButtonHandler();
      buttonShow.addActionListener(handler);
      buttonStep.addActionListener(handler);
   }

   private class ButtonHandler implements ActionListener
   {

      public void actionPerformed(ActionEvent event)
      {
         String msg = textDay.getText();
         int day = Integer.parseInt(msg);
       
         
         String msg2 = textMonth.getText();
         int month = Integer.parseInt(msg2);
         
         String msg3 = textYear.getText();
         int year = Integer.parseInt(msg3);
         
         if ( event.getSource()==buttonShow)
         {
            MyDate date = new MyDate(day, month, year);
            labelDate.setText("Date: " + date.toString());
                  
         }
         
         if (event.getSource()==buttonStep)
         {
            MyDate date = new MyDate(day, month, year);
            date.stepForwardOneDay();
            String d = String.valueOf(date.getDay());
            String m = String.valueOf(date.getMonth());
            String y = String.valueOf(date.getYear());
            
            labelDate.setText("Date: " + date.toString());
            
            textDay.setText(d);
            textMonth.setText(m);
            textYear.setText(y);
         }
         
      }
      
   }

  
   public void createComponents()
   {
      labelDate = new JLabel("Date:");
      labelDay = new JLabel("Day: ");
      labelMonth = new JLabel("Month: ");
      labelYear = new JLabel("Year: ");
      textDay = new JTextField(15);
      textMonth = new JTextField(15);
      textYear = new JTextField(15);
      buttonShow = new JButton("Show");
      buttonStep = new JButton("Step Forward");
      
   }
   public void initializeComponents()
   {
      setSize(400,200);
      setLocationRelativeTo(null);
      textDay.setText("");
      textMonth.setText("");
      textYear.setText("");
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   private void addComponentsToFrame()
   {
      
      
      JPanel date = new JPanel(new BorderLayout());
      date.add(labelDate, BorderLayout.NORTH);
      
     
      JPanel label = new JPanel(new BorderLayout()); 
      label.add(labelDay, BorderLayout.NORTH);
      label.add(labelMonth, BorderLayout.CENTER);
      label.add(labelYear, BorderLayout.SOUTH);
      
      JPanel text = new JPanel(new BorderLayout()); 
      text.add(textDay, BorderLayout.NORTH);
      text.add(textMonth, BorderLayout.CENTER);
      text.add(textYear, BorderLayout.SOUTH);
      
      JPanel button = new JPanel(new BorderLayout());
      button.add(buttonShow, BorderLayout.NORTH);
      button.add(buttonStep, BorderLayout.SOUTH);
      
      JPanel content = new JPanel();
     
      content.add(label);
      content.add(text);
      content.add(button);
      
      
      JPanel main = new JPanel(new BorderLayout());
      main.add(date, BorderLayout.NORTH);
      main.add(content);
      setContentPane(main);
      
      labelDate.setForeground(Color.RED);
      
   }
}
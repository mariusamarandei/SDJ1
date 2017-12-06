package GUI;

import javax.swing.JFrame;

public class ASimpleWindow
{
   private JFrame win;
   
   public ASimpleWindow()
   {
      win = new JFrame("A Simple window");
      
      win.setSize(400, 300);
      win.setVisible(true);
      
      // Specify what happens when the windows are closed
      // Exit the application
      
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}

package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Menu extends JFrame
{

   private JMenuBar menuBar = new JMenuBar();
   private JMenu menu = new JMenu("Colors");
   private JMenuItem menuItem = new JMenuItem("Red");
   private JMenuItem menuItem2 = new JMenuItem("Blue");

   public static void main(String[] args)
   {
      Menu window = new Menu();
      window.setBounds(30, 30, 300, 300);
      window.setVisible(true);

   }

   private void finish()
   {
      menuItem.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            getContentPane().setBackground(Color.RED);
         }
      });
      
      menuItem2.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            getContentPane().setBackground(Color.BLUE);
         }
      });
      
   }

   public Menu()
   {
      super("Colors Menu");

      setJMenuBar(menuBar);
      setVisible(true);
      menuBar.add(menu);
      menu.add(menuItem);
      menu.add(menuItem2);
      initializeComponents();
      finish();
   }

   public void initializeComponents()
   {
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

}

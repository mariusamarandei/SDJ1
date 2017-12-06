import javax.swing.*;
import java.awt.*;

public class BorderLayoutMain extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame( "Super title" );
        Container contentPane = frame.getContentPane();
        contentPane.add( new JButton( "Button 1(PAGE_START)" ), BorderLayout.PAGE_START );
        contentPane.add( new JButton( "Button 2(CENTER)" ), BorderLayout.CENTER );
        contentPane.add( new JButton( "Button 3(LINE_START)" ), BorderLayout.LINE_START );
        contentPane.add( new JButton( "Button 4(PAGE_END)" ), BorderLayout.PAGE_END );
        contentPane.add( new JButton( "Button 5(LINE_END)" ), BorderLayout.LINE_END );
        frame.setSize( 300, 300 );
        frame.setVisible( true );
    }
}

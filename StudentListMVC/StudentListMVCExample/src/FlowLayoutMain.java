import javax.swing.*;
import java.awt.*;

public final class FlowLayoutMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame( "Super title" );
        JPanel buttonPanel = new JPanel();
        buttonPanel.add( new JButton( "Button 1" ) );
        buttonPanel.add( new JButton( "Button 2" ) );
        buttonPanel.add( new JButton( "Button 3" ) );
        buttonPanel.add( new JButton( "Button 4" ) );
        buttonPanel.add( new JButton( "Button 5" ) );
        frame.getContentPane().add( buttonPanel, BorderLayout.CENTER );
        frame.setSize( 300, 300 );
        frame.setVisible( true );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
}

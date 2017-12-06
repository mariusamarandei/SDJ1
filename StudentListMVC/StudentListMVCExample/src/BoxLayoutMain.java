import javax.swing.*;
import java.awt.*;

public final class BoxLayoutMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame( "Super title" );
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout( new BoxLayout( buttonPanel, BoxLayout.Y_AXIS ) );
        addButton( buttonPanel, new JButton( "Button 1" ) );
        addButton( buttonPanel, new JButton( "Button 2" ) );
        addButton( buttonPanel, new JButton( "Button 3" ) );
        addButton( buttonPanel, new JButton( "Button 4" ) );
        addButton( buttonPanel, new JButton( "Button 5" ) );
        frame.getContentPane().add( buttonPanel );
        frame.setSize( 300, 300 );
        frame.setVisible( true );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    private static void addButton(Container container, JButton button) {
        button.setAlignmentX( Component.CENTER_ALIGNMENT );
        container.add( button );
    }
}

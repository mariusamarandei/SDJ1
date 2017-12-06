import javax.swing.*;
import java.awt.*;

public final class GridLayoutMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame( "Super title" );
        JPanel formPanel = new JPanel( new GridLayout( 0, 2 ) );
        formPanel.add( wrapInPanel( new JLabel( "Name" ) ) );
        formPanel.add( wrapInPanel( new JTextField( 10 ) ) );
        formPanel.add( wrapInPanel( new JLabel( "Email" ) ) );
        formPanel.add( wrapInPanel( new JTextField( 10 ) ) );
        formPanel.add( new JButton( "Button 5" ) );
        frame.getContentPane().add( formPanel, BorderLayout.CENTER );
        frame.setSize( 300, 300 );
        frame.setVisible( true );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    private static JPanel wrapInPanel(Component component) {
        JPanel jPanel = new JPanel();
        jPanel.add( component );
        return jPanel;
    }

}

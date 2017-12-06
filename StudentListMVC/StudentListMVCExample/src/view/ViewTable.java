package view;

import controller.IController;
import domain.model.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public final class ViewTable implements IView {

    private static final String[] columnNames = {"ID", "Name"};

    private IController controller;

    private final JFrame frame;

    private JButton buttonUpdate;
    private JTable tableStudent;
    private JTextField textFieldStudentID;
    private JTextField textFieldStudentName;
    private JButton buttonAddStudent;

    public ViewTable(String title) {
        frame = new JFrame( title );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        createComponents();
        registerHandlers();

        layoutComponents();

        frame.setSize( 500, 500 );
        frame.setVisible( true );
    }


    @Override
    public void displayStudentList(List<Student> studentList) {
        DefaultTableModel tableModel = (DefaultTableModel) tableStudent.getModel();
        tableModel.setRowCount( 0 );
        tableModel.setColumnIdentifiers( columnNames );

        for ( Student student : studentList ) {
            Object [] studentData = {student.getID(), student.getName()};
            tableModel.addRow( studentData );
        }
    }

    @Override
    public String getAddStudentID() {
        return textFieldStudentID.getText();
    }

    @Override
    public String getAddStudentName() {
        return textFieldStudentName.getText();
    }

    @Override
    public void setController(IController controller) {
        if ( this.controller != null ) {
            throw new IllegalStateException( "Controller already set!" );
        }
        this.controller = controller;
    }

    @Override
    public void clearInputFields() {
        textFieldStudentID.setText( "" );
        textFieldStudentName.setText( "" );
    }

    private void createComponents() {
        buttonUpdate = new JButton("Update table");
        tableStudent = new JTable();
        textFieldStudentID = new JTextField( 10 );
        textFieldStudentName = new JTextField( 10 );
        buttonAddStudent = new JButton( "Add" );
    }

    private void registerHandlers() {
        buttonAddStudent.addActionListener( actionEvent -> controller.addStudentRequest() );
        buttonUpdate.addActionListener( actionEvent -> controller.updateStudentsRequest() );
    }

    private void layoutComponents() {
        JPanel studentIDPanel = new JPanel();
        studentIDPanel.add( new JLabel( "ID:" ) );
        studentIDPanel.add( textFieldStudentID );

        JPanel studentNamePanel = new JPanel();
        studentNamePanel.add( new JLabel( "Name:" ) );
        studentNamePanel.add( textFieldStudentName );

        JPanel studentFormPanel = new JPanel();
        studentFormPanel.setLayout( new BoxLayout( studentFormPanel, BoxLayout.Y_AXIS ) );
        studentFormPanel.add( studentIDPanel );
        studentFormPanel.add( studentNamePanel );
        studentFormPanel.add( buttonAddStudent );

        Container contentPane = frame.getContentPane();
        contentPane.add( buttonUpdate, BorderLayout.NORTH );
        contentPane.add( tableStudent, BorderLayout.CENTER );
        contentPane.add( studentFormPanel, BorderLayout.SOUTH );
    }
}

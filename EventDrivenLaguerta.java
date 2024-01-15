/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eventdrivenlaguerta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author chloe dane
 */
public class EventDrivenLaguerta {

    private JTextField firstNameField, lastNameField, middleNameField, mobileNumberField, emailAddressField;
    private static JFrame frame;
    private static JPanel panel;
    private static JPanel panel2;
    private JFrame outputFrame;
    
    public EventDrivenLaguerta(){
        
        frame = new JFrame("INPUT");
        frame.setSize(360,360);
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        //Set panel
        panel= new JPanel(new FlowLayout());
        panel.setPreferredSize(new Dimension(350,250));
        
        panel.add(new JLabel("First Name: "));
        firstNameField = new JTextField(27);
        panel.add(firstNameField);
        
        panel.add(new JLabel("Middle Name: "));
        middleNameField = new JTextField(27);
        panel.add(middleNameField);
        
        panel.add(new JLabel("Last Name: "));
        lastNameField = new JTextField(27);
        panel.add(lastNameField);
        
        panel.add(new JLabel("Mobile Number: "));
        mobileNumberField = new JTextField(27);
        panel.add(mobileNumberField);
        
        panel.add(new JLabel("Email Address: "));
        emailAddressField = new JTextField(27);
        panel.add(emailAddressField);
        
        panel2= new JPanel(new GridLayout(1,2,10,10));
        panel2.setPreferredSize(new Dimension(300,30));
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new btnSubmit());
        JButton clearButton = new JButton("Clear All");
        clearButton.addActionListener(new btnClearAll());
        panel2.add(submitButton);
        panel2.add(clearButton);
        
        frame.getContentPane().add(panel);
        frame.getContentPane().add(panel2);
        frame.setVisible(true);
        
        submitButton.addActionListener((ActionListener) this);
        clearButton.addActionListener((ActionListener) this);
        
    }
    
    class btnClearAll implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            firstNameField.setText("");
            lastNameField.setText("");
            middleNameField.setText("");
            mobileNumberField.setText("");
            emailAddressField.setText("");
        }
    }
    
    //submit
    
    class btnSubmit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Get user input
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String middleName = middleNameField.getText();
            String mobileNumber = mobileNumberField.getText();
            String emailAddress = emailAddressField.getText();
            // Close Input frame
            frame.setVisible(false);

            // Create OUTPUT frame
            outputFrame = new JFrame("OUTPUT");
            outputFrame.setLayout(null);

            JLabel outputLabel = new JLabel("User Details:");
            outputLabel.setBounds(10, 10, 100, 25);
            outputFrame.add(outputLabel);

            JTextArea outputTextArea = new JTextArea();
            outputTextArea.append("First Name: " + firstName + "\n");
            outputTextArea.append("Middle Name: " + middleName + "\n");
            outputTextArea.append("Last Name: " + lastName + "\n");
            outputTextArea.append("Mobile Number: " + mobileNumber + "\n");
            outputTextArea.append("Email Address: " + emailAddress + "\n");
            outputTextArea.setEditable(false);
            outputTextArea.setBounds(10, 40, 280, 100);
            outputFrame.add(outputTextArea);

            JButton okayButton = new JButton("Okay");
            okayButton.setBounds(110, 150, 80, 25);
            okayButton.addActionListener(new btnOkay());
            outputFrame.add(okayButton);

            // Disable the submit button
            ((JButton) e.getSource()).setEnabled(false);

            // Open OUTPUT frame
            outputFrame.setSize(305, 230);
            outputFrame.setLocationRelativeTo(null);
            outputFrame.setResizable(false);
            outputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            outputFrame.setVisible(true);
        }
    }

    class btnOkay implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Automatically close the OUTPUT frame
            outputFrame.dispose();

            // Clear the content of the INPUT frame
            firstNameField.setText("");
            middleNameField.setText("");
            lastNameField.setText("");
            mobileNumberField.setText("");
            emailAddressField.setText("");
            
            // Enable the submit button
            ((JButton) e.getSource()).setEnabled(true);
            
            // Open Input Frame
            frame.setVisible(true);
        }
    }
  
    
    public static void main(String[] args) {
        
        EventDrivenLaguerta ed = new EventDrivenLaguerta();
    }
}
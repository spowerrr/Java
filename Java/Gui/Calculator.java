package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField number1Field, number2Field, resultField;
    private JButton addButton, subtractButton;

    public Calculator() {
        // Set up the JFrame
        // JFrame frame = new JFrame("Button Example");
        setTitle("Addition and Subtraction");

        setSize(500, 300);
        setLayout(null);// When you set the layout manager to null, you are essentially telling
        // Swing not to use any layout manager,
        // and you take full control of the positioning and sizing of components within
        // the container.

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create and add components
        JLabel labal1 = new JLabel("Number 1:");
        labal1.setBounds(20, 20, 100, 30);
        number1Field = new JTextField();
        number1Field.setBounds(90, 20, 100, 30);
        add(labal1);
        add(number1Field);

        JLabel labal2 = new JLabel("Number 2:");
        labal2.setBounds(190, 20, 100, 30);
        number2Field = new JTextField();
        number2Field.setBounds(260, 20, 100, 30);
        add(labal2);
        add(number2Field);

        JLabel resultJLabel = new JLabel("Result:");
        resultJLabel.setBounds(90, 80, 100, 30);
        resultField = new JTextField();
        resultField.setBounds(160, 80, 100, 30);
        resultField.setEditable(false);// can't edit or insert any number as input
        add(resultJLabel);
        add(resultField);

        addButton = new JButton("Add");
        addButton.setBounds(90, 140, 100, 30);
        addButton.addActionListener(this);// "Add" button is clicked, the actionPerformed
        // method is called, and it prints "Button clicked!" to the console.
        // This is a simple way to handle button click events in Swing applications.

        subtractButton = new JButton("Subtract");
        subtractButton.setBounds(260, 140, 100, 30);
        subtractButton.addActionListener(this);

        add(addButton);
        add(subtractButton);

        // Set frame visibility
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int number1 = Integer.parseInt(number1Field.getText());
            int number2 = Integer.parseInt(number2Field.getText());
            int result = 0;

            if (e.getSource() == addButton) {
                result = number1 + number2;
            } else if (e.getSource() == subtractButton) {
                result = number1 - number2;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid integers in both fields.");
        }
    }

    public static void main(String[] args) {
        new Calculator();

    }
}

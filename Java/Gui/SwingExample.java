package Gui;

import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Swing Example");

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Add the button to the content pane of the frame
        frame.add(button);

        // Set the size, default close operation, and visibility
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

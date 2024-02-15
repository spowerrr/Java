import javax.swing.*;

public class NewDia {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("GUI Example");

        // Create a JTextArea object
        JTextArea textArea = new JTextArea();

        // Add the JTextArea object to the frame
        frame.add(textArea);

        // Set the size of the frame
        frame.setSize(300, 300);

        // Set the visibility of the frame
        frame.setVisible(true);

        // Calculate the area and volume of the rectangles and boxes
        double area1 = 10.5 * 4;
        double area2 = 5 * 10;
        double volume1 = 5 * 5 * 5;
        double volume2 = 10 * 10 * 10;

        // Display the outputs in the JTextArea object
        textArea.append("Area of rectangle 1: " + area1 + "\n");
        textArea.append("Area of rectangle 2: " + area2 + "\n");
        textArea.append("Volume of box 1: " + volume1 + "\n");
        textArea.append("Volume of box 2: " + volume2 + "\n");
    }
}
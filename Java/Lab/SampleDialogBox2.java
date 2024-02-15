import javax.swing.*;

class SampleDialogBox2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,
                "Enter your name", "Inputname", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Your name is " + name,
        // "Display name", JOptionPane.INFORMATION_MESSAGE);
    }
}
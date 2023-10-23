import javax.swing.*;

public class SimpleSwingApp {

    public static void main(String[] args) {

        // Create a new JFrame

        JFrame frame = new JFrame("Simple Swing App");

        // Set the default close operation

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label

        JLabel label = new JLabel("Hello, Swing!");

        // Add the label to the frame

        frame.getContentPane().add(label);

        // Set the size of the frame

        frame.setSize(300, 200);

        // Center the frame on the screen

        frame.setLocationRelativeTo(null);

        // Make the frame visible

        frame.setVisible(true);

    }

}
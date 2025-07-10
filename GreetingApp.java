package codefinitypractice;

// Import Swing classes for GUI components
import javax.swing.*;
// Import AWT classes for layout and event handling
import java.awt.*;
import java.awt.event.*;

public class GreetingApp {

    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("Greeting App"); // Title of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures the app closes when 'X' is clicked
        frame.setSize(300, 150); // Width: 300px, Height: 150px

        // Create a text field for name input
        JTextField nameField = new JTextField(15); // Allows user to type their name (15-character width)

        // Create a button the user can click to trigger the greeting
        JButton greetButton = new JButton("Greet");

        // Create a label to display the result ("Hello, [name]!")
        JLabel resultLabel = new JLabel(); // Initially empty

        // Create a panel to hold all the GUI components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Arrange items left-to-right in order

        // Add components to the panel
        panel.add(new JLabel("Enter your name:")); // Label prompting user input
        panel.add(nameField); // Text field for input
        panel.add(greetButton); // Button to click
        panel.add(resultLabel); // Output label (displays greeting)

        // Add behavior to the greet button using an ActionListener (runs when button is
        // clicked)
        greetButton.addActionListener(e -> {
            String name = nameField.getText().trim(); // Get text from input field, remove extra spaces
            if (!name.isEmpty()) {
                // If the name is not empty, display a greeting
                resultLabel.setText("Hello, " + name + "!");
            } else {
                // If the field is empty, prompt user to type a name
                resultLabel.setText("Please enter a name.");
            }
        });

        // Add the panel to the frame (main window)
        frame.add(panel);

        // Make the window visible to the user
        frame.setVisible(true);
    }
}
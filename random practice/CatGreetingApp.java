import java.awt.*;
import javax.swing.*;

public class CatGreetingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cat Greeting App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JTextField nameField = new JTextField(15);
        JButton CatGreetButton = new JButton("Greet");

        JLabel resultLabel = new JLabel();
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(new JLabel("Enter your name:"));
        panel.add(nameField);
        panel.add(CatGreetButton);
        panel.add(resultLabel);

        CatGreetButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (!name.isEmpty()) {
                System.out.println("Meow Meow!");
                System.out.println("Which means 'Hello, " + name + "! I am Whiskers.'");
                resultLabel.setText("Meow Meow! Which means 'Hello, " + name + "! I am Whiskers.'");
            } else {
                resultLabel.setText("Please enter a name.");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}

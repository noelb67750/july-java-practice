import java.util.ArrayList;
import java.util.List;

public class OffTheDome {
    // Class-level list to store unique user IDs
    private List<Integer> userIDs = new ArrayList<>();

    public static void main(String[] args) {
        // Create an instance of OffTheDome to access non-static methods
        OffTheDome dome = new OffTheDome();

        // Generate 10 unique user IDs
        dome.createUserIDs(10);

        // Display all generated user IDs
        dome.displayUserIDs();
    }

    // Method to generate a given number of unique user IDs
    public void createUserIDs(int count) {
        int id;

        for (int i = 0; i < count; i++) {
            // Generate a random ID between 1 and 1000
            id = (int) (Math.random() * 1000) + 1;

            // If ID is not already in the list, add it
            if (!userIDs.contains(id)) {
                userIDs.add(id);
                System.out.println("User ID created: " + id);
            } else {
                System.out.println("ID " + id + " already exists, generating a new one...");
                i--; // Retry this iteration
            }
        }
    }

    // Method to display all stored user IDs
    public void displayUserIDs() {
        System.out.println("All User IDs: " + userIDs);
    }
}
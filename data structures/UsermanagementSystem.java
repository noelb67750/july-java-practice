import java.util.ArrayList;
import java.util.List;

// Class representing a single user with a username and an ID
class User {
    private String username;
    private int id;

    // Constructor to create a new User object with a given username and ID
    public User(String username, int id) {
        this.username = username;
        this.id = id;
    }

    // Getter method to retrieve the username of the user
    public String getUsername() {
        return username;
    }

    // Getter method to retrieve the ID of the user
    public int getId() {
        return id;
    }
}

// Class to manage a list of users, their IDs, and provide operations to find and add users
class UserManager {
    // List to store User objects
    private List<User> users = new ArrayList<>();

    // Separate list to store just the IDs of users (optional, useful for quick lookup or uniqueness checks)
    private List<Integer> ids = new ArrayList<>();

    // Method to add a user to the list and also store their ID
    public void addUser(User user) {
        users.add(user);           // Add the user object to the list
        ids.add(user.getId());     // Add the user ID to the list of IDs
    }

    // Returns the list of all User objects
    public List<User> getUsers() {
        return users;
    }

    // Returns the list of all user IDs
    public List<Integer> getIds() {
        return ids;
    }

    // Method to search for a user by their ID
    public User findUserById(int id) {
        for (User user : users) {
            // Check if the current user's ID matches the one we’re looking for
            if (user.getId() == id) {
                return user;  // Return the matching user
            }
        }
        return null;  // Return null if no user is found with that ID
    }

    // Method to search for a user by their username
    public User findUserByUsername(String username) {
        for (User user : users) {
            // Check if the current user's username matches the one we’re looking for
            if (user.getUsername().equals(username)) {
                return user;  // Return the matching user
            }
        }
        return null;  // Return null if no user is found with that username
    }
}

// This class contains the main method which runs the application
public class UsermanagementSystem {
    public static void main(String[] args) {
        // Create a UserManager instance to manage users
        UserManager manager = new UserManager();

        // Add some users to the manager
        manager.addUser(new User("alice", 1));  // Add user "alice" with ID 1
        manager.addUser(new User("bob", 2));    // Add user "bob" with ID 2

        // Try to find a user by their ID
        User found = manager.findUserById(2);
        if (found != null) {
            System.out.println("Found user: " + found.getUsername() + " with ID: " + found.getId());
        } else {
            System.out.println("User not found.");
        }

        // Try to find a user by their username
        User foundByUsername = manager.findUserByUsername("alice");
        if (foundByUsername != null) {
            System.out.println("Found user by name: " + foundByUsername.getUsername());
        } else {
            System.out.println("User not found by username.");
        }
    }
}
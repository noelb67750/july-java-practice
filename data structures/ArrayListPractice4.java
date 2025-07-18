import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice4 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eva");

        // Retrieving element by index
        String element = names.get(2);  // Retrieving the 3rd element (index starts from 0)
        System.out.println("The element at index 2 is: " + element);
    }
}
// This code demonstrates how to retrieve an element from an ArrayList by its index.

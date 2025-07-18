import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        
        // Create an ArrayList to store Lifter objects
        List<Lifter> lifters = new ArrayList<>();
        
        // Add Lifter objects to the ArrayList
        lifters.add(new Lifter("Alice", 150));
        lifters.add(new Lifter("Bob", 200));
        lifters.add(new Lifter("Charlie", 180));
        
        // Print the ArrayList of lifters
        System.out.println("Lifters: " + lifters);
    }

static class Lifter {
    String name;
    int benchpress;

    public Lifter(String name, int benchpress) {
        this.name = name;
        this.benchpress = benchpress;
    }
    @Override 
    public String toString() {
        return "Lifter{name='" + name + "', benchpress=" + benchpress + '}';
    }
}
}
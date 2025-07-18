import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice6 {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Charlie", "David", "Eva", "Frank", "Grace", "Hank", "Ivy", "Jack", "Katherine", "Leo", "Mia", "Nathan", "Olivia", "Paul", "Quinn", "Rachel", "Sam", "Tom", "Ursula", "Victor", "Wendy", "Xander", "Yvonne", "Zack", "Bob", "Emily", "Bob", "Jake", "Isabel", "Liam", "Nora", "Bob", "Sophia", "Bob", "Daniel", "Gabrielle", "Mike"};
        // Expelled student: Bob
        List<String> students = new ArrayList<>(Arrays.asList(names));
        System.out.println("Is Bob present in the list? " + students.contains("Bob"));
        List<String> expelledStudents = new ArrayList<>();
        expelledStudents.add("Bob");
        students.removeAll(expelledStudents);
        System.out.println("Is Bob still present in the list after the removal operation? " + students.contains("Bob"));
    }
}


import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice7 {
    public static void main(String[] args) {
        List<Integer> example = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            example.add(i);
        }
        System.out.println("List before modification: " + example);
        example.set(2, 28);
        System.out.println("List after modification: " + example);
    }
}
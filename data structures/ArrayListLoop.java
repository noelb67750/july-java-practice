import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

       
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }

       
        System.out.println("Initial ArrayList: " + numbers);

        numbers.add(5, 9);
        System.out.println("Numbers after first modifying: " + numbers);

    
        numbers.add(0, 5);
        System.out.println("Numbers after second modifying: " + numbers);
    }
}
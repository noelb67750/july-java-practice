import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice1 {

    public static void main(String[] args) {
        Dog fred = new Dog("Fred", 5);
        Dog max = new Dog("Max", 3);
        Dog bella = new Dog("Bella", 4);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(fred);
        dogs.add(max);
        dogs.add(bella);

        // Fixed: added semicolon
        System.out.println(dogs);
    }

    // 🔧 Make Dog class static so main() can use it
    static class Dog {
        String name;
        int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog{name='" + name + "', age=" + age + '}';
        }
    }
}
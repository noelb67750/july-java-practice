// Importing required classes for using ArrayList and Arrays utility
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice3 {
    public static void main(String[] args) {
        // Creating Dog objects with name and age
        Dog bob = new Dog("Bob", 2);
        Dog ben = new Dog("Ben", 1);
        Dog brian = new Dog("Brian", 5);

        // Creating an array of Dog objects
        Dog[] dogs = {bob, ben, brian};

        // Converting array to an ArrayList using Arrays.asList
        List<Dog> dogList = new ArrayList<>(Arrays.asList(dogs));

        // Printing the list of dogs, which calls the Dog class's toString() method
        System.out.println(dogList);
    }
}

// A simple class to represent a Dog with a name and age
class Dog {
    String name;
    int age;

    // Constructor to initialize the Dog object
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString() so Dog objects display nicely when printed
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
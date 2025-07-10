package codefinitypractice;
import java.util.Scanner;

public class GreetingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        greet(name);
        scanner.close();
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
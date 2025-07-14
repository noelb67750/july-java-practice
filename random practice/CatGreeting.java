import java.util.Scanner;

public class CatGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String catName = "Whiskers";

        greet(name, catName);
        
        scanner.close();
    }

    public static void greet(String name, String catName) {
        System.out.println("Meow Meow!");
        System.out.println("Which means 'Hello, " + name + "! I am " + catName + ".'");
    }
}
public class superKeyword {
}
class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    
    System.out.println("Animal created");
}
}
class Dog extends Animal {
    Dog() {
        super(); // Calls the constructor of the superclass Animal
        System.out.println("Dog constructor called");
    }
}
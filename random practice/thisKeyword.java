/*
 * modifier ClassName(ParameterType parameter1, ParameterType parameter2) {
 * this.parameter1 = parameter1;
 * this.parameter2 = parameter2;
 */

class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        Person bob = new Person("Bob", 20, "Male");
        System.out.println("Bob's name: " + bob.name + ", Bob's age: "
                + bob.age + ", Bob's gender: " + bob.gender);
    }
}
class Cat {
    String name;
    double age;
    String color;

    void infoCat() {
        System.out.println("Name: " + name + ", Age: " + age + ", Color: " + color);
    }
}

public class CatInfo {
    public static void main(String[] args) {
        Cat michael = new Cat();
        michael.name = "Mikey";
        michael.age = 0.5;
        michael.color = "Black";
        michael.infoCat();
        Cat garfield = new Cat();
        garfield.name = "Garfield";
        garfield.age = 4.7;
        garfield.color = "Red";
        garfield.infoCat();
    }
}
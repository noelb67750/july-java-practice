package codefinitypractice;

public class GETTERANDSETTER {
    public static void main(String[] args) {
        Person bob = new Person();
        bob.setName("Bob");
        System.out.println(bob.getName());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

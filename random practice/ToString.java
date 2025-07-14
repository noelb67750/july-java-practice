class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Class Person;" + System.lineSeparator()
                + "name = " + name + ";" + System.lineSeparator()
                + "age = " + age + ";" + System.lineSeparator()
                + "gender = " + gender + ".";
    }
}
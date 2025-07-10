class Weightlifter {
    String name;
    int Bench;
    String gender;

    public Weightlifter(String name, int Bench, String gender) {
        this.name = name;
        this.Bench = Bench;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Class WeightLifter;" + System.lineSeparator()
                + "name = " + name + ";" + System.lineSeparator()
                + "Bench = " + Bench + ";" + System.lineSeparator()
                + "gender = " + gender + ".";
    }
}
class Weighlifter {
    String name;
    int BenchPress;
    int BodyWeight;
    String Gender;

    public Weighlifter(String name, int BenchPress, int BodyWeight, String Gender) {
        this.name = name;
        this.BenchPress = BenchPress;
        this.BodyWeight = BodyWeight;
        this.Gender = Gender;
    }
}

public class thisPractice {
    public static void main(String[] args) {
        Weighlifter noel = new Weighlifter("noel", 240, 170, "Male");

        System.out.println(noel.name);
        System.out.println(noel.BenchPress);
        System.out.println(noel.BodyWeight);
        System.out.println(noel.Gender);
    }

}

package codefinitypractice;
public class randomProject {
    public static void main(String[] args) {
        randomProject rp = new randomProject();
        int age = 19;
        int TotalAge = 0;

        for (int i = 0; i <= age; i++) {
            TotalAge = i;
        }

        System.out.println(TotalAge); // Only prints final value after loop
    }

    public void println(String x) {
        System.out.println(x);
    }
}
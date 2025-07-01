package ToasterOven;

public class Toaster {
    int ElectricityPercentage;
    String PowerOutput;
    String heatStatus;
    String PartsCondition;

    public static void main(String[] args) {
        Toaster oven = new Toaster();
        oven.PowerSource(100);
        System.out.println(); // spacer

        oven.HeatingElements(2, 2);
        System.out.println(); // spacer

        oven.Parts(1, 1);
        System.out.println(); // spacer

        oven.checkIfToasterIsReady();
    }

    public static void TurnON() {
        System.out.println("Toaster is now ON");
    }

    public void PowerSource(int power) {
        ElectricityPercentage = power;

        if (ElectricityPercentage >= 30) {
            PowerOutput = "good";
        } else {
            PowerOutput = "bad";
        }

        System.out.println("=== POWER SOURCE CHECK ===");
        System.out.println("Power Output: " + PowerOutput);
    }

    public void HeatingElements(int coils, int infrared) {
        System.out.println("=== HEATING ELEMENTS CHECK ===");

        if (coils >= 2 && infrared >= 2) {
            heatStatus = "Good";
            System.out.println("Heating is Efficient");
        } else {
            heatStatus = "Bad";
            System.out.println("Heating is Inefficient");
        }

        System.out.println("Heat Status: " + heatStatus);
    }

    public void Parts(int foils, int tray) {
        System.out.println("=== PARTS CONDITION CHECK ===");

        if (foils > 0 && tray > 0) {
            PartsCondition = "Brand New";
            System.out.println("Parts are in good condition");
        } else {
            PartsCondition = "Old";
            System.out.println("Parts are in bad condition");
        }

        System.out.println("All of Your Parts are: " + PartsCondition);
    }

    public void checkIfToasterIsReady() {
        System.out.println("=== FINAL SYSTEM CHECK ===");
        if (PowerOutput.equals("good") &&
            heatStatus.equals("Good") &&
            PartsCondition.equals("Brand New")) {
            TurnON(); // turns on the toaster
            System.out.println("Toaster is READY to use.");
        } else {
            System.out.println(" Toaster is NOT ready. Please check all components.");
        }
    }
}

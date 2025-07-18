// Class name should follow PascalCase convention (CompareTo instead of compareTo)
public class CompareTo {

    // Method to compare two Integer values using compareTo()
    public static String upgrade_comparing(Integer left_value, Integer right_value) {
        // compareTo returns:
        // -1 if left < right
        //  0 if left == right
        //  1 if left > right
        int comparingResult = left_value.compareTo(right_value);

        // Variable to hold the final comparison message
        String result = "";

        // Use switch to determine which value is greater or if they're equal
        switch (comparingResult) {
            case -1:
                result = "The right value is greater";
                break;
            case 0:
                result = "The values are equal";
                break;
            case 1:
                result = "The left value is greater";
                break;
            default:
                result = "Error"; // Fallback, shouldn't occur with compareTo
        }

        // Return the message
        return result;
    }

    // Main method: entry point of the program
    public static void main(String[] args) {
        // Declare and initialize Integer values
        Integer left_value = 15;
        Integer right_value = 13;

        // Call upgrade_comparing and print the result
        System.out.println(upgrade_comparing(left_value, right_value));
    }
}
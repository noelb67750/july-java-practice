public class OfftheDomePractice3 {
    public static class Comparison {
        public static String compareInts(Integer left_value, Integer right_value) {
            // Using compareTo to compare two Integer values
            int comparisonResult = left_value.compareTo(right_value);
            String result;
            
            // Determine the result based on the comparison
            switch (comparisonResult) {
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
                    result = "Error"; // This should not happen with Integer.compareTo
            }
            return result;
        }
    }
    
    public static void main(String[] args) {
        Integer left_value = 19;
        Integer right_value = 19;
        String comparisonResult = Comparison.compareInts(left_value, right_value);
        System.out.println(comparisonResult);
    }
}
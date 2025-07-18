import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class OffTheDomeArray {
    public static void main(String[] args) {
        String[] Followers = {
            "Bob", "Alice", "Charlie", "David", "Eva", "Frank", "Grace", "Hank",
            "Ivy", "Jack", "Katherine", "Leo", "Mia", "Nathan", "Olivia", "Paul",
            "Quinn", "Rachel", "Sam", "Tom", "Ursula", "Victor", "Wendy",
            "Xander", "Yvonne", "Zack"
        };
        List<String> followersList = new ArrayList<>(Arrays.asList(Followers));
        System.out.println(      );
        System.out.println("Followers List: " + followersList);

        List<String> NamesUnderFourLetters = new ArrayList<>();
        for (String name : followersList) {
            if (name.length() < 4) {
                NamesUnderFourLetters.add(name);
            }
        }
        followersList.removeAll(NamesUnderFourLetters);
        System.out.println(        );
        System.out.println("Followers List after removing names under four letters: " + followersList);

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HobbyistChallenge {

    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List<String> findHobbyists(String hobby) {
        List<String> hobbyists = new ArrayList<>();
        return hobbyists;
    }

    public static void main(String[] args) {
        HobbyistChallenge hobbies = new HobbyistChallenge();
        hobbies.add("John", "Piano", "Puzzles", "Yoga");
        hobbies.add("Adam", "Drama", "Fashion", "Pets");
        hobbies.add("Mary", "Magic", "Pets", "Reading");

        System.out.println(Arrays.toString(hobbies.findHobbyists("Pets").toArray()));
    }
}






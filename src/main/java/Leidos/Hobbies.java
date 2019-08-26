package Leidos;

import java.util.*;

public class Hobbies {

    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();
    private ArrayList<String> names = new ArrayList<String>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List<String> findHobbyists(String hobby) {


        for (Map.Entry<String, String[]> entry : hobbies.entrySet()) {
            String key = entry.getKey();
            String[] value = entry.getValue();
            for (String s : value) {
                if (s.equals(hobby)) {
                    this.names.add(key);
                }
            }
        }
        return this.names;
    }

    public static void main(String[] args) {
        Hobbies hobbies = new Hobbies();
        hobbies.add("John", "Piano", "Puzzles", "Yoga");
        hobbies.add("Adam", "Drama", "Fashion", "Pets");
        hobbies.add("Mary", "Magic", "Pets", "Reading");

        System.out.println(Arrays.toString(hobbies.findHobbyists("Yoga").toArray()));
    }
}

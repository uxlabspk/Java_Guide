package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a new hashmap of type string as key and also string as value.
        Map<String, String> hm = new HashMap<>(2);

        // Inserting the values associated with keys.
        hm.put("Name", "Naveed");
        hm.put("Age", "21");
        hm.put("Profession", "Software Engineer");

        // Printing the key, Values.
        System.out.println("NAME : " + hm.get("Name"));
        System.out.println("AGE : " + hm.get("Age"));
        System.out.println("PROFESSION : " + hm.get("Profession"));

        // Returning whether the hashmap contains the 'Age' key.
        System.out.println(hm.containsKey("Age"));

        // Returning whether the hashmap contains the 'Naveed' value.
        System.out.println(hm.containsValue("Naveed"));

        // Clear the entire hashmap.
        hm.clear();
    }
}
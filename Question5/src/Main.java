import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // Storing key-value pairs in the HashMap
        map.put("Ram", 36);
        map.put("Shyam", 60);

        // Searching and printing values based on keys
        String[] names = {"Ram", "Shyam", "Mahesh"};

        for(String key: names) {
            if (map.containsKey(key)) {
                System.out.println("Name: " + key + ", age: " + map.get(key));
            } else {
                System.out.println(key + " not found!");
            }
        }
    }
}
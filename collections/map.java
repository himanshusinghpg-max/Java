import java.util.HashMap;
import java.util.Map;

public class map {

    static void insert(Map<Integer, String> m, int key, String value) {
        m.put(key, value);
    }

    static void delete(Map<Integer, String> m, int key) {
        m.remove(key);
    }

    static void update(Map<Integer, String> m, int key, String value) {
        if (m.containsKey(key)) {
            m.put(key, value);
        }
    }

    static void search(Map<Integer, String> m, int key) {
        if (m.containsKey(key))
            System.out.println("Found: " + m.get(key));
        else
            System.out.println("Key not found");
    }

    static void traverse(Map<Integer, String> m) {
        for (Map.Entry<Integer, String> e : m.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();

        insert(m, 1, "A");
        insert(m, 2, "B");
        insert(m, 3, "C");

        traverse(m);

        search(m, 2);

        update(m, 3, "Z");
        delete(m, 1);

        traverse(m);
    }
}
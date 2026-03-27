import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Map;

public class sortedmap {

    static void insert(SortedMap<Integer, String> m, int key, String value) {
        m.put(key, value);
    }

    static void delete(SortedMap<Integer, String> m, int key) {
        m.remove(key);
    }

    static void update(SortedMap<Integer, String> m, int key, String value) {
        if (m.containsKey(key)) {
            m.put(key, value);
        }
    }

    static void search(SortedMap<Integer, String> m, int key) {
        if (m.containsKey(key))
            System.out.println("Found: " + m.get(key));
        else
            System.out.println("Key not found");
    }

    static void traverse(SortedMap<Integer, String> m) {
        for (Map.Entry<Integer, String> e : m.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public static void main(String[] args) {
        SortedMap<Integer, String> m = new TreeMap<>();

        insert(m, 3, "C");
        insert(m, 1, "A");
        insert(m, 2, "B");

        traverse(m); // sorted by key

        search(m, 2);

        update(m, 3, "Z");
        delete(m, 1);

        traverse(m);
    }
}
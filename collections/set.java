import java.util.HashSet;
import java.util.Set;

public class set {

    static void insert(Set<Integer> s, int val) {
        s.add(val);
    }

    static void delete(Set<Integer> s, int val) {
        s.remove(val);
    }

    static void update(Set<Integer> s, int oldVal, int newVal) {
        if (s.remove(oldVal)) {
            s.add(newVal);
        }
    }

    static void search(Set<Integer> s, int val) {
        if (s.contains(val))
            System.out.println(val + " Found");
        else
            System.out.println(val + " Not Found");
    }

    static void traverse(Set<Integer> s) {
        for (int i : s) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        insert(s, 10);
        insert(s, 20);
        insert(s, 30);

        traverse(s);
        search(s, 20);

        update(s, 30, 40);
        delete(s, 10);

        traverse(s);
    }
}
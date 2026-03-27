import java.util.TreeSet;
import java.util.SortedSet;

public class sortedset {

    static void insert(SortedSet<Integer> s, int val) {
        s.add(val);
    }

    static void delete(SortedSet<Integer> s, int val) {
        s.remove(val);
    }

    static void update(SortedSet<Integer> s, int oldVal, int newVal) {
        if (s.remove(oldVal)) {
            s.add(newVal);
        }
    }

    static void search(SortedSet<Integer> s, int val) {
        if (s.contains(val))
            System.out.println(val + " Found");
        else
            System.out.println(val + " Not Found");
    }

    static void traverse(SortedSet<Integer> s) {
        for (int i : s) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedSet<Integer> s = new TreeSet<>();

        insert(s, 50);
        insert(s, 10);
        insert(s, 30);

        traverse(s); // sorted output

        search(s, 10);

        update(s, 30, 40);
        delete(s, 50);

        traverse(s);
    }
}
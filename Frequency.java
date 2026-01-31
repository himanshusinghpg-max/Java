import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, count = 0;

        // Array size
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        // Array input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to find frequency
        System.out.print("Enter element to find frequency: ");
        int key = sc.nextInt();

        // Counting frequency
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        // Output
        System.out.println("Frequency of " + key + " = " + count);
    }
}

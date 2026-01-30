import java.util.Scanner;  // ✅ Correct import

public class main {        // ✅ Class name must match filename (Main.java)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example interaction
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        sc.close();  // ✅ Always close Scanner
    }
}
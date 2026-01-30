class CommandLineArray {
    public static void main(String[] args) {
        String[] arr = args;
        if (arr.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Array elements are:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}

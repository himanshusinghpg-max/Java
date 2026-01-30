class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        boolean duplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 15; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
        }

        if (duplicate)
            System.out.println("Array contains duplicate elements");
        else
            System.out.println("Array does not contain duplicate elements");
    }
}

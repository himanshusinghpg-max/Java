public class sum {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int c, int d) {
        return c + d;
    }

    class b extends sum {
        super.sum(2, 3);
    }

    public static void main(String[] args) {
    
    }
}

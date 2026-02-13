class a {

    int sum(int a, int b) {
        return a + b;
    }
}

class b extends a {

    @Override
    int sum(int a, int b) {
        return a + b + 10;  
    }

    void show() {
        System.out.println(super.sum(2, 3));
        System.out.println(this.sum(3, 4));  
    }
}

public class overridingsum {

    public static void main(String[] args) {
        b obj = new b();
        obj.show();
    }
}

public class Inheritance {
    int price;
    Inheritance(int x){
        price = x;
    }
    public static void main(String[] args) {
        BMW b = new BMW();
        System.out.println(b.price);
    }
}
class BMW extends Inheritance {
    BMW() {
        super(1000);
    }
}
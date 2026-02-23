abstract class sample { 
    int a = 10;

    void function() {
        System.out.println(a);
    }

}

class child extends sample{
    void function(){
        super.function();
        System.out.println(super.a);
        }
}

public class abstraction {
    public static void main(String[] args) {
        child s = new child();  
        s.function();
    }
}
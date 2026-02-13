
class Person {

    final int age = 20;

    final void showDetails() {
        System.out.println("Age is: " + age);
    }
}
final class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal { 
    void bark() {
        System.out.println("Dog barks");
    }
}
public class FinalDemo {
    public static void main(String[] args) {

        Person p = new Person();
        p.showDetails();

        Animal a = new Animal();
        a.sound();
    }
}


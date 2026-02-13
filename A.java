class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        super();
        super(); 
    }
}

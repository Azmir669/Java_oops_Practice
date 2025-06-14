class A {
    static void greet() {
        System.out.println("Hello");
    }
}

class B extends A {
    static void greet() {
        System.out.println("Hello child");
    }

    void test() {
        System.out.println("hello name");
        super.greet();
    }
}

public class SuperInstance {
    public static void main(String[] args) {
        A b = new B();
        b.greet();

    }
}

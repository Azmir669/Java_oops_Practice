interface A {
    void sayHello();
}

public class Anynomous {
    public static void main(String[] args) {
        A a = new A() {
            public void sayHello() {
                System.out.println("Hello");

            }
        };
        a.sayHello();
    }
}

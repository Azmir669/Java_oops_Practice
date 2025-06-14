class Outer {
    private String message = "hello iam outer String";

    class Inner {
        void display() {
            System.out.println(message);
        }
    }

}

public class NonStaticInner {
    public static void main(String[] args) {
        Outer a = new Outer();
        Outer.Inner inn = a.new Inner();
        inn.display();

    }
}

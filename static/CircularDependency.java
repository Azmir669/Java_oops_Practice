
class A {

    static {
        System.out.print(B.b);
    }
    static int a = 9;
}

class B {

    static {
        System.out.print(A.a);
    }
    static int b = 90;
}

public class CircularDependency {

    public static void main(String[] args) {
        System.out.print(A.a);
    }
}

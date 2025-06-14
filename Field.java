class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;
}

public class Field {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child(); // Upcasting

        System.out.println(p.x); // 10
        System.out.println(c.x); // 20
        System.out.println(pc.x); // ❗10 (not 20!)
    }
}


class Parent {

    public static void show() {
        System.out.print("parent is called");
    }
}

class Child extends Parent {

    public static void show() {
        System.out.print("child is called");
    }
}

public class StaticInheritance {

    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Child();
        Child c = new Child();// Reference type is Parent, object type is Child

        p1.show(); // (1)
        p2.show(); // (2)
        c.show();
    }
}

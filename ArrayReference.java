class Shape {
    void draw() {
        System.out.println("drawing");

    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("iam circle");
    }

    void bark() {
        System.out.println("barking");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("iam sqauer");

    }
}

public class ArrayReference {
    public static void main(String[] args) {
        Shape s = new Circle();
        if (s instanceof Circle) {
            Circle c = (Circle) s;
            c.bark();

        }
    }

}

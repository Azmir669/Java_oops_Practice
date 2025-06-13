class Shape {
    void draw() {
        System.out.println("drawing");

    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("iam circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("iam sqauer");

    }
}

public class ArrayReference {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Square() };
        for (Shape s : shapes) {
            s.draw();

        }
    }

}

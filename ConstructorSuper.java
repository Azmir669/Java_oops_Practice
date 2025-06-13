// Parent class
class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

// Child class
class Dog extends Animal {
    Dog() {
        super(); // optional here, calls Animal()
        System.out.println("Dog constructor called");
    }
}

public class ConstructorSuper {

    public static void main(String[] args) {
        Dog d = new Dog();
    }
}

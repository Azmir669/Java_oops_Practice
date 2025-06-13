// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// First child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Second child class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

// Main class
public class Heirarichal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // inherited from Animal
        d.bark(); // specific to Dog

        Cat c = new Cat();
        c.eat(); // inherited from Animal
        c.meow(); // specific to Cat
    }
}

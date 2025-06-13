class Animal {
    public void bark() {
        System.out.println("The animal is barking");
    }
}

class cat extends Animal {
    public void meow() {
        System.out.println("The cat is meowing");
    }
}

public class Single {
    public static void main(String[] args) {
        cat c = new cat();
        c.bark();
        c.meow();

    }
}

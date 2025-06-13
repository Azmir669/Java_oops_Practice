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

class Catchild extends cat {
    public void meow() {
        System.out.println("The cat child is meowing");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Catchild c = new Catchild();
        c.meow();
        c.bark();
    }

}

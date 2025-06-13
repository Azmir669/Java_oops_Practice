class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

}

class cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows");

    }
}

class dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class lion extends Animal {
    public void makeSound() {
        System.out.println("The lion roars");
    }

}

public class UpCasting {
    public static void play(Animal d) {
        d.makeSound();
    }

    public static void main(String[] args) {
        Animal a = new cat();
        Animal b = new dog();
        Animal c = new lion();
        play(a);
        play(b);

    }
}

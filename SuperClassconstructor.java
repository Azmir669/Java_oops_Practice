
class Animal {

    private String name;

    Animal(String name) {
        this.name = name;
    }

    Animal() {
    }

}

class Dog extends Animal {

    private String breed;

    Dog(String breed) {

        this.breed = breed;
        System.out.print("breed" + this.breed);

    }
}

public class SuperClassconstructor {

    public static void main(String[] args) {
        Dog d = new Dog("aziz");

    }
}

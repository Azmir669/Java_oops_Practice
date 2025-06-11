
class Animal {

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Generic animal sound");
    }

    public String toString() {
        return "Animal{" + name;

    }
}

class Dog extends Animal {

    private String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void makeSound() {
        super.makeSound();
        System.out.print("bowww");
    }

    public void display() {
        System.out.print(super.getName());
        System.out.print(this.breed);
    }

    public String toString() {

        return "Dog{" + "name=" + getName() + ", breed=" + breed + ", ";
    }

}

public class SuperVsThis {

    public static void main(String[] args) {
        Dog d = new Dog("Chinnu", "chinnulu");
        d.display();
    }
}

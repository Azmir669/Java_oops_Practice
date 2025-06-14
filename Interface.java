interface Interfaceb {
    void start();
}

class child implements Interfaceb {
    public void start() {
        System.out.println("child start");
    }
}

class Bike implements Interfaceb {
    public void start() {
        System.out.println("Bike starts with button");
    }
}

public class Interface {
    public static void main(String[] args) {
        Interfaceb v1 = new child(); // Upcasting to interface
        Interfaceb v2 = new Bike(); // Upcasting to interface

        v1.start(); // Car starts with key
        v2.start();
    }

}

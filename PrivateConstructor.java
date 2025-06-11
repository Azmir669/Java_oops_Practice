
class Printer {

    private static Printer instance;

    private Printer() {
        System.out.print("printer is ready");
    }

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void print(String document) {
        System.out.print("printed:    " + document);
    }
}

public class PrivateConstructor {

    public static void main(String[] args) {
        Printer printer = Printer.getInstance();
        printer.print("Hello, World! \n");
        Printer printer2 = Printer.getInstance();
        printer2.print("java\n");
    }

}

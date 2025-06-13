
class Singleton {

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    private Singleton() {
        System.out.print("constructor called");
    }

    public static Singleton getInstance() {
        return instance;
    }

}

public class StaticThree {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.print(s);

    }
}

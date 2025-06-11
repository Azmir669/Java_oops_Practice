
class Demo {

    int value = 10;

    public static void printValue() {
        System.out.println(this.value);
    }

}

public class StaticContex {

    public static void main(String[] args) {

        Demo.printValue();
    }
}

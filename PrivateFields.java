
class Passport {

    private final String passportNumber;
    private final String name;

    Passport(String passportNumber, String name) {
        this.passportNumber = passportNumber;
        this.name = name;
    }

    public String toString() {
        return "Passport: " + passportNumber + ", Name: " + name;

    }
}

public class PrivateFields {

    public static void main(String[] args) {
        Passport p = new Passport("1234567890", "John Doe");
        System.out.println(p);

    }
}

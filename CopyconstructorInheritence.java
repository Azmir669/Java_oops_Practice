
class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    Person(Person other) {
        this.name = other.name;
    }
}

class Employee extends Person {

    int id;

    Employee(String name, int id) {
        super(name);
        this.id = id;
    }

    Employee(Employee other) {
        super(other);
        this.id = other.id;
    }

    public String toString() {
        return name + " " + id;
    }
}

public class CopyconstructorInheritence {

    public static void main(String[] args) {
        Employee e1 = new Employee("azmir", 89);
        Employee e2 = new Employee(e1);
        System.out.print(e1);
        System.out.print(e2);

    }
}

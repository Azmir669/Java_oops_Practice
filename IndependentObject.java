
class Student {

    private String name;
    private int age;
    private boolean isPresent;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.isPresent = false;
    }

    public void markPresent() {
        this.isPresent = true;
    }

    public void markAbsent() {
        this.isPresent = false;
    }

    public String toString() {
        return name + " " + age + " " + isPresent;
    }
}

public class IndependentObject {

    public static void main(String[] args) {
        Student s1 = new Student("azmir", 23);
        Student s2 = new Student("malik", 22);
        s1.markAbsent();
        s2.markPresent();
        System.out.print(s1 + "\n");
        System.out.print(s2 + "\n");
    }
}

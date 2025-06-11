
class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    Student(Student other) {
        this.name = other.name;
        this.age = other.age;

    }

    public String toString() {
        return "Student:" + name + "     age:" + age;
    }
}

public class Copyconstructor {

    public static void main(String[] args) {
        Student s1 = new Student("azmir", 22);
        Student s2 = new Student(s1);
        System.out.print(s1);
        System.out.println(s2);

    }
}


class Student {

    static int studentCnt = 0;
    private String name;

    Student(String name) {
        studentCnt++;
        this.name = name;
    }

    public static void showCount() {
        System.out.println("total:" + studentCnt);
    }

    public void dsiplay() {
        System.out.println("student name is " + name);
    }
}

public class ClassLevelStatic {

    public static void main(String[] args) {
        Student s1 = new Student("azmir");
        Student s2 = new Student("laddu");
        s1.dsiplay();
        s2.dsiplay();
        Student.showCount();
    }
}

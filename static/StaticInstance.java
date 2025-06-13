
class Demo {

    static int cnt = 0;

    public void show() {
        cnt += 1;
        System.out.println(cnt);
    }
}

public class StaticInstance {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.show();
    }

}

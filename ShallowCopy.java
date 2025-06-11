
class Shallow {

    String name;
    int[] pages;

    Shallow(String name, int[] pages) {
        this.name = name;
        this.pages = pages;
    }

    Shallow(Shallow other) {
        this.name = other.name;
        this.pages = new int[other.pages.length];
        for (int i = 0; i < other.pages.length; i++) {
            this.pages[i] = other.pages[i];
        }
    }
}

public class ShallowCopy {

    public static void main(String[] args) {
        Shallow s1 = new Shallow("azmir", new int[]{500, 600});
        Shallow s2 = new Shallow(s1);
        s2.pages[0] = 999;
        System.out.print(s1.pages[0]);

    }
}

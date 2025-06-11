
class NumHolder {

    private int num;

    NumHolder(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void improve(Multiplier mult, int factor) {
        mult.multiply(this, factor);
    }

    public void setNum(int n) {
        this.num = n;
    }
}

class Multiplier {

    public void multiply(NumHolder num, int factor) {
        int original = num.getNum();
        int n = original * factor;
        num.setNum(n);
        System.out.print(num.getNum());
    }
}

public class NumMult {

    public static void main(String[] args) {
        NumHolder num = new NumHolder(5);
        Multiplier mult = new Multiplier();
        num.improve(mult, 3);
    }
}

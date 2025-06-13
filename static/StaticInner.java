
class Computer {

    static String brand = "HP";

    Computer() {
    }

    static class CPU {

        public void specs() {
            System.out.print("brand" + brand);
        }
    }
}

public class StaticInner {

    public static void main(String[] args) {
        Computer.CPU cpu = new Computer.CPU();
        cpu.specs();

    }
}

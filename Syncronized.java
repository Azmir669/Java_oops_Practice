class Counter {
    int cnt = 0;

    synchronized public void increment() {
        cnt += 1;
    }
}

public class Syncronized {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }

        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final count" + c.cnt);

    }
}

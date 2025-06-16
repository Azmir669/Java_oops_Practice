class Mythread extends Thread {
    private String name;

    Mythread(String name) {
        this.name = name;

    }

    public void run() {
        System.out.println("Thread is running" + name);
    }
}

public class BasicThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Mythread("0"));
        Thread thread1 = new Thread(new Mythread("1"));
        Thread thread2 = new Thread(new Mythread("2"));
        Thread thread3 = new Thread(new Mythread("3"));
        Thread thread4 = new Thread(new Mythread("4"));
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}

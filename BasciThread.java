class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello, World!");
    }

}

public class BasciThread {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

    }
}

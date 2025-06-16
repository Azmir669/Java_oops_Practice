public class Sleep {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            try {
                System.out.print("started");
                Thread.sleep(10000);
                System.out.print("ended");
            } catch (Exception e) {
                System.out.print("error");
            }

        });
        thread.start();

    }
}

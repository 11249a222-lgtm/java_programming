class PaymentProcess implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing...");

            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class PaymentGateway {

    public static void main(String[] args) {

        // Create Runnable object
        PaymentProcess payment = new PaymentProcess();

        // Create Thread object
        Thread t = new Thread(payment);

        // Start the thread
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Payment completed.");
    }
}

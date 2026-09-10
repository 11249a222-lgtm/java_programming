class OrderPlacement extends Thread {

    public void run() {
        System.out.println("Order placement started...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Order placed successfully.");
    }
}

class OrderDelivery extends Thread {

    public void run() {
        System.out.println("Order delivery started...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Order delivered successfully.");
    }
}

public class FoodDelivery {

    public static void main(String[] args) {

        OrderPlacement order = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();

        // Start both threads
        order.start();
        delivery.start();

        try {
            // Wait for both threads to finish
            order.join();
            delivery.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Food delivery process completed.");
    }
}

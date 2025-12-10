class SharedResource {
    private int value;
    private boolean available = false;
    
    public synchronized void produce(int newValue) throws InterruptedException {
        while (available) {
            wait(); // Wait for consumer to consume
        }
        value = newValue;
        available = true;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }
    
    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait(); // Wait for producer to produce
        }
        System.out.println("Consumed: " + value);
        available = false;
        notify(); // Notify producer
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    resource.produce(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    resource.consume();
                    Thread.sleep(1500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        producer.start();
        consumer.start();
    }
}
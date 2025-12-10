public class ThreadStateExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                synchronized (ThreadStateExample.class) {
                    ThreadStateExample.class.wait(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        System.out.println("State after creation: " + thread.getState()); // NEW
        
        thread.start();
        System.out.println("State after start: " + thread.getState()); // RUNNABLE
        
        Thread.sleep(100);
        System.out.println("State during sleep: " + thread.getState()); // TIMED_WAITING
        
        Thread.sleep(3000);
        System.out.println("State after completion: " + thread.getState()); // TERMINATED
    }
}
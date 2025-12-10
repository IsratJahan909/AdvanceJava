public class ThreadMethodsExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread completed.");
        });
        
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread Priority: " + thread.getPriority());
        System.out.println("Thread State: " + thread.getState());
        
        thread.start();
        
        try {
            thread.join(); // Wait for thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main thread completed.");
    }
}
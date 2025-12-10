class MyThreadWithSleep extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread is going to sleep for 2 seconds.");
            Thread.sleep(2000); // Sleep for 2 seconds
            System.out.println("Thread woke up after 2 seconds.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    

    public static void main(String[] args) {
        MyThreadWithSleep thread = new MyThreadWithSleep();
        thread.start();
        try {
            thread.join(); // Main thread will wait for this thread to finish
            System.out.println("Main thread finishes after MyThreadWithSleep.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

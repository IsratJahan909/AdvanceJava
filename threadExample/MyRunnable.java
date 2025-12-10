class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running using Runnable interface.");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable); // Pass the Runnable to the Thread
        thread.start(); // Starts the thread, invoking the run() method of Runnable
    }
}

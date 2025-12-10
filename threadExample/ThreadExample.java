class MyThread extends Thread {
    @Override
    public void run() {
        PrintData();
        sendMail();
    }

    public void PrintData() {
        System.out.println("Starting thread: " + getName());
    }

    public void sendMail() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {

        // System.out.println();
        // System.out.println(Thread.currentThread().getName() + ": " );
        // System.out.println("Print Started");
        // Test test = new Test();
        // test.setName("Class-1");
        // test.start();
        // System.out.println("Print Stopped");

        // System.out.println();
        // System.out.println(Thread.currentThread().getName() + ": " );
        // System.out.println("Print Started");

        // MyThread thread1 = new MyThread();
        // thread1.setName("Thread-1");
        // thread1.start();
        // try {
        // Thread.sleep(1000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // System.out.println("Print Stopped");

        System.out.println(Thread.currentThread().getName() + ": Started");
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.start(); // Start thread1
        thread2.start(); // Start thread2

        System.out.println(Thread.currentThread().getName() + ": Stopped");

    }

    class Test {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void start() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(this.name + ": " + i);
                try {
                    Thread.sleep(500); // Pause for 500ms
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1 (Low)");
        MyThread t2 = new MyThread("Thread-2 (Normal)");
        MyThread t3 = new MyThread("Thread-3 (High)");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        
        t1.start();
        t2.start();
        t3.start();
    }
}


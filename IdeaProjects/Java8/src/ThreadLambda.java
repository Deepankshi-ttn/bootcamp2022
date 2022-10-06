public class ThreadLambda {
    public static void main(String[] args) {
        // Thread Creation without lambda function
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread_1 Created...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        // Thread Creation with lambda function
        Runnable r2 = () -> {
            System.out.println("Thread_2 Created...");
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }

}


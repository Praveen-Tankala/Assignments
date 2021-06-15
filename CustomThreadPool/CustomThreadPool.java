import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPool {
    private BlockingQueue<Runnable> queue;
    private Thread[] Threads;

    public CustomThreadPool(int totalnumofThreads) {
        queue = new LinkedBlockingQueue<>();
        Threads = new Thread[totalnumofThreads];
        int i = 0;
        for (Thread t : Threads) {
            t = new RunnerThread("Thread pool " + ++i);
            t.start();
        }
    }

    public void addTask(Runnable r) {
        try {
            queue.put(r);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    class RunnerThread extends Thread {
        public RunnerThread(String name) {
            super(name);
        }

        public void run() {
            while (true) {
                try {
                    queue.take().run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        CustomThreadPool ctp = new CustomThreadPool(3);
        
        for(int i=0; i<5; i++) {
            int Thread_No=i;
            ctp.addTask(() -> System.out.println(Thread.currentThread().getName()+" Running a Thread :"+Thread_No));
        }
        for(int j=0; j<5; j++) {
            int Thread_No=j;
            ctp.addTask(() -> System.out.println(Thread.currentThread().getName()+" Running another Thread :"+Thread_No));
        }
        

    }

}
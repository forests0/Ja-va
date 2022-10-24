package stream.ch07_deadlock.sub02_shared_resource;


public class ThreadR12 extends Thread{
    @Override
    public void run() {
        synchronized (Resources.r1) {
            System.out.println(Thread.currentThread().getName()+" take r1 and r2 wait");
            synchronized (Resources.r2) {
                System.out.println(Thread.currentThread().getName()+" take r2");
                System.out.println(Thread.currentThread().getName()+" put r1, r2");
            }
        }

    }
}

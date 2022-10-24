package stream.ch07_deadlock.sub02_shared_resource;


public class ThreadR21 extends Thread{
    @Override
    public void run() {
        //대기시간을 준다면 교착상태 해결
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        synchronized (Resources.r2) {
            System.out.println(Thread.currentThread().getName()+" take r2 and r1 wait");
            synchronized (Resources.r1) {
                System.out.println(Thread.currentThread().getName()+" take r1");
                System.out.println(Thread.currentThread().getName()+" put r1, r2");
            }
        }

    }
}

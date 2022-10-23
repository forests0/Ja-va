package stream.ch07_deadlock.sub01_thread;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadAsc asc = new ThreadAsc();
        ThreadDesc desc = new ThreadDesc();

        asc.start();
        desc.start();
    }
}

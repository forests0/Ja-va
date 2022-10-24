package stream.ch07_deadlock.sub03_deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Fork {
    Lock lock = new ReentrantLock();
    public void useFork() {
        lock.lock();
    }

    public void unUseFork() {
        lock.unlock();
    }
}

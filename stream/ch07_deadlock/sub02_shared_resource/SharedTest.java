package stream.ch07_deadlock.sub02_shared_resource;


public class SharedTest {
    public static void main(String[] args) {
        ThreadR12 threadA = new ThreadR12();
        ThreadR21 threadB = new ThreadR21();

        threadA.start();
        threadB.start();
    }
}

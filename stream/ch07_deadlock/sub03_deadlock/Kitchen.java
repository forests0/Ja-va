package stream.ch07_deadlock.sub03_deadlock;
public class Kitchen {
    public static void main(String[] args) {
        Philosopher aristotle = new Philosopher("aristotle", 0);
        Philosopher socrates = new Philosopher("socrates", 1);
        Philosopher plato = new Philosopher("plato", 2);
        Philosopher pythagoras = new Philosopher("pythagoras", 3);

        aristotle.start();
        socrates.start();
        plato.start();
        pythagoras.start();
    }
}

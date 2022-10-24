package stream.ch07_deadlock.sub03_deadlock;

public class Philosopher extends Thread{
    private String name;
    private int number;

    public Philosopher(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void takeFork(int num) {
        Fork fork = Table.forks.get(num);
        fork.useFork();
        System.out.println(name+" take a "+num+" fork");
    }

    public void putFork(int num) {
        Fork fork = Table.forks.get(num);
        fork.unUseFork();
        System.out.println(name + "put down fork number" + num);
    }

    @Override
    public void run() {
        int randTime = (int) ((Math.random() * 1000) + 500);
        //while(true) {
            try {
                //0.5초 이내 랜덤 생각
                System.out.println(name + ": " + randTime + "ms wait");
                Thread.sleep(randTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //왼쪽 포크 집기
            takeFork(number);
            //오른쪽 포크 집기
            takeFork((number + 1) % 4);
            //먹기
            System.out.println("yam yam");
            //포크 내려놓기
            putFork(number);
            putFork((number + 1) % 4);
        //}
    }
}

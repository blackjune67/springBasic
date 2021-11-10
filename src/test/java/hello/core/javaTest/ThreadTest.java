package hello.core.javaTest;

public class ThreadTest implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadTest());
        thread.start();
        System.out.println(thread.getThreadGroup());

        ThreadGroup threadGroup = new ThreadGroup("myThread");

        threadGroup.setMaxPriority(7);

        Thread thread1 = new Thread(threadGroup, new ThreadTest());
        thread1.start();
        System.out.println(thread1.getThreadGroup());
    }
}

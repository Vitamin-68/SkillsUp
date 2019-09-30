package Lesson19_last;

public class MyThreadExtThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Hello from second thread.");
    }

    public MyThreadExtThread() {
    }
}

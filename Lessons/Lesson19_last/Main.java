package Lesson19_last;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThreadExtThread myThreadExtThread = new MyThreadExtThread();
        MyThreadImplRunn myThreadImplRunn = new MyThreadImplRunn();
        Thread thirdThread = new Thread( myThreadImplRunn);
        myThreadExtThread.start();
        myThreadExtThread.sleep( 1000 );
        thirdThread.start();
        Thread.sleep( 1000 );
        System.out.println("Hello word");

    }
}

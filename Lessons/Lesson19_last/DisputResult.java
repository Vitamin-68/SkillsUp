package Lesson19_last;

public class DisputResult {
    public static String result;

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Egg egg = new Egg();
        Thread thread = new Thread( chicken );
        thread.start();
        egg.start();

    }
    private static void cheakResult (Thread chicken) {

    }
}

package Lesson8;

public class MyLittleException extends Exception {
    private Seasons seasons;

    public MyLittleException() {
    }

    public MyLittleException(Seasons seasons) {
        this.seasons = seasons;
    }

    public MyLittleException(String message, Seasons seasons) {
        super(message);
        this.seasons = seasons;
    }
}

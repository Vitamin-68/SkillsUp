package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.concurrent.TimeoutException;

public class Main {
    public static void main(String[] args) {
        Seasons winter = Enum.valueOf(Seasons.class, "WINTER");
        Seasons spring = Seasons.valueOf("SPRING");
        Seasons[] seasons = Seasons.values();

        System.out.println(winter);

        System.out.println(spring);
        for (Seasons season : seasons) {
//            System.out.println(seasons.toString());
            System.out.println(season.getNameShort());
        }
//        try {
//            throwNewException();
//        } catch (MyLittleException exception) {
//            System.out.println(exception.getMessage());
//            exception.printStackTrace();
//        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) { //???
            if (Seasons.WINTER.getNameShort().equals("w")) {
                throwNewException();
            } else {
                throwNewException();
            }

        } catch (MyLittleException | IOException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        } catch (Exception e) {
            if (e.getMessage() != null) { //Unchecked exception
                System.out.println("this");
            } else {
                System.out.println("null");
            }
//            e.printStackTrace();
        }

        //Unchecked exception
        Integer seasonNumber = Seasons.SUMMER.ordinal();
        //ordinal vozvrashaet poradkovui nomer po spisky kak dobavil enum
//        if (winter != null) {
//            System.out.println("this");
//        } else {
//            System.out.println("null");
//        }

    }

    public static void throwNewException() throws MyLittleException { //throws probrasuvaet oshibky naverh
        throw new MyLittleException("Winter is comming!", Seasons.WINTER);
    }
}

package Lesson6;

import Lesson6.Impl.SeasonsImpl;
import Lesson6.Impl.Test;
import Lesson6.Interfaces.Consumer;
import Lesson6.Interfaces.ITest;
import Lesson6.Interfaces.Seasons;

public class Main {
    public static void main(String[] args) {
        SeasonsImpl season = new SeasonsImpl();
        Seasons seasons1 = new SeasonsImpl();
        System.out.println(season.getNameOfSeason(1));
        System.out.println(seasons1.getNameOfSeason(1));
        ITest test = new Test();
        Consumer test2 = new Test();
    }
}

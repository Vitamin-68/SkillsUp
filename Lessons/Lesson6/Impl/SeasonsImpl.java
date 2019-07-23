package Lesson6.Impl;

import Lesson6.Interfaces.Consumer;
import Lesson6.Interfaces.Seasons;

public class SeasonsImpl implements Seasons, Consumer {

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getNameOfSeason(int number) {
        if (number == 1){
            return Seasons.WINTER;
        }else if (number == 2){
            return Seasons.SPRING;
        }else if (number==3){
            return Seasons.SUMMER;
        }else if (number==4) {
            return Seasons.AUTUMN;
        }
        return "You enter wrong number";
    }

    @Override
    public String getNumberOfSeason(int numberOfMounth) {
        return null;
    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public String getString() {
        return null;
    }
}

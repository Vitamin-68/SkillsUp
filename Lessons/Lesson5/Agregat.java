package Lesson5;

import java.util.Objects;

public class Agregat {
    private int yearOfCreate;

    public Agregat(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }

    public int getYearOfCreate() {
        return yearOfCreate;
    }

    public void setYearOfCreate(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agregat agregat = (Agregat) o;
        return yearOfCreate == agregat.yearOfCreate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfCreate);
    }

    @Override
    public String toString() {
        return "Agregat{" +
                "yearOfCreate=" + yearOfCreate +
                '}';
    }
}

package Lesson11;

import java.util.List;

public class Partia {
    private List<Deputy> deputies;

    public Partia(List<Deputy> deputies) {
        this.deputies = deputies;
    }

    public List<Deputy> getDeputies() {
        return deputies;
    }

    public void setDeputies(List<Deputy> deputies) {
        this.deputies = deputies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Partia partia = (Partia) o;

        return deputies != null ? deputies.equals(partia.deputies) : partia.deputies == null;

    }

    @Override
    public int hashCode() {
        return deputies != null ? deputies.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Partia{" +
                "deputies=" + deputies +
                '}';
    }
}


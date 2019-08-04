package TMP;

import java.util.Objects;

public class SimpleClass {
    private int id;
    private String name;

    public SimpleClass() {
    }

    public SimpleClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        System.out.println("ID = " + id);
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleClass that = (SimpleClass) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "SimpleClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

package Lesson5;

import java.util.Arrays;
import java.util.Objects;

public class Car extends Agregat {
    private String name;
    private double speed;
    private boolean electric;
    private Engine engine; //composition
    private Person[] person;  //agregation

    public Car(int yearOfCreate, String name, double speed, boolean electric,
               Engine engine, Person[] person) {
        super(yearOfCreate);
        this.name = name;
        this.speed = speed;
        this.electric = electric;
        this.engine = engine;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.speed, speed) == 0 &&
                electric == car.electric &&
                name.equals(car.name) &&
                engine.equals(car.engine) &&
                Arrays.equals(person, car.person);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, speed, electric, engine);
        result = 31 * result + Arrays.hashCode(person);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", electric=" + electric +
                ", engine=" + engine +
                ", person=" + Arrays.toString(person) +
                '}';
    }
}

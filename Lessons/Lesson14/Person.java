package Lesson14;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Person implements Serializable {

    private static final long serialVersionUID = 10L;
    private static final long serialNum = 5;
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private boolean married;
    private LocalDate birthDay;
    private LocalDate deadDeath;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, double height, boolean married, LocalDate birthDay) { //}, LocalDate deadDeath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.married = married;
        this.birthDay = birthDay;
        this.deadDeath = deadDeath;
    }

    public static long getSerialNum() {
        return serialNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public LocalDate getDeadDeath() {
        return deadDeath;
    }

    public void setDeadDeath(LocalDate deadDeath) {
        this.deadDeath = deadDeath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Double.compare( person.height, height ) == 0 &&
                married == person.married &&
                Objects.equals( firstName, person.firstName ) &&
                Objects.equals( lastName, person.lastName ) &&
                Objects.equals( birthDay, person.birthDay ) &&
                Objects.equals( deadDeath, person.deadDeath );
    }

    @Override
    public int hashCode() {
        return Objects.hash( firstName, lastName, age, height, married, birthDay, deadDeath );
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                ", birthDay=" + birthDay +
                '}';


    }
}

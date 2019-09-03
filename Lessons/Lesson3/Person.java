package Lesson3;

public class Person {
    String name;
    int age;
    int height;
    double weight;
    boolean isCommunist;



    public Person(String name, int age, int height, double weight, boolean isCommunist){
        this.name = "Vova";
        this.age = 18;
        this.height = 157;
        this.weight = 65;
        this.isCommunist = true;
    }



    public Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", isCommunist=" + isCommunist +
                '}';
    }
}

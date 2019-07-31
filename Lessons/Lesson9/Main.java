package Lesson9;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Animal animal = new Animal();
        person.setName("Timmi");
        animal.setType("cat");

        Person person2 = new Person();
        Animal animal2 = new Animal();
        person2.setName("Kim");
        animal2.setType("dog");

        CustomPair<Person, Animal> pair = new CustomPair<>();
        pair.setKey(person);
        pair.setValue(animal);

        System.out.println(pair.toString());

        CustomPair <Person, Animal> pair2 = new CustomPair<>();
        pair2.put(person2, animal2);
        System.out.println(pair2);

        CustomPair <Person, Animal> pair3 = new CustomPair<>();
        pair3.put(person, animal2);
        System.out.println(pair3);

        System.out.println(CustomPair.compare(person,person2));

        DynamicArray<String> array = new DynamicArray<>();
        array.add("first");
        DynamicArray<? super Person> numbers = new DynamicArray<>();

        numbers.add(animal);
        numbers.add(person);



    }
}

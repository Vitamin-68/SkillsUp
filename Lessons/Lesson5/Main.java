package Lesson5;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Ivan", 25);
        Person person2 = new Person("Ilon", 42);
        Person person3 = new Person("Tolya", 52);
        Person person4 = new Person("Grisha", 32);
        Person person5 = new Person("Kolya", 22);
        Car car = new Car(2018, "Tesla",
                240.3, true,
                new Engine(300),
                new Person[3]);
//        Util util = new Util();
        System.out.println(Util.isOurCarSoOld(2019, car));
        Util.personSitInCar(car, person);
        Util.personSitInCar(car, person2);
        Util.personSitInCar(car, person);
//        Util.personSitInCar(car, person3);
        Util.personSitInCar(car, person4);
        Util.personSitInCar(car, person5);
//        Util.removePersonFromCar(2, car);
//        Util.removePersonFromCar(2, car);
//        Util.removePersonFromCar(8, car);
//        Util.removePersonFromCar(-20, car);
        //dz написать метод который удаляет ячейку по персону

        Util.removePersonFromCar(person2, car);
        Util.removePersonFromCar(person3, car);
        Car car2 = Util.timeForTravel();
        Util.distanceOfCar(car2);

    }
}

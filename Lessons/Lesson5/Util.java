package Lesson5;

import java.sql.Array;
import java.util.Scanner;

public class Util {
    public static String isOurCarSoOld(int year, Car car) {
        if (year < car.getYearOfCreate()) {
            return "Our car will move";
        } else {
            return "Our car will not move";
        }
    }

    public static void personSitInCar(Car car, Person person) {
        if (hasCarPlaces(car)) {
            for (int index = 0; index < car.getPerson().length; index++) {
                if (car.getPerson()[index] == null && !isPersonInCar(person, car)) {
                    car.getPerson()[index] = person;
                    System.out.println("This " + person.getName() + " was sitted in car");
                    return;
                }
            }
        } else {
            System.out.println("This car haven't places");
        }
    }

    private static boolean hasCarPlaces(Car car) {
        for (int index = 0; index < car.getPerson().length; index++) {
            if (car.getPerson()[index] == null) {
                return true;
            }
        }
        return false;
    }

    public static void removePersonFromCar(int number, Car car) {
        if (number > 0 && number <= car.getPerson().length) {
            if (car.getPerson()[number - 1] != null) {
                System.out.println("Person with name " + car.getPerson()[number - 1].getName()
                        + " war removed from car");
                car.getPerson()[number - 1] = null;

            } else {
                System.out.println("This place is empty");
            }
        } else {
            System.out.println("You enter wrong number of place");
        }
    }

    //    ДЗ: дописать метод убирания пассажира из машины, который удаляется через сравниение пассажиров.
    public static void removePersonFromCar(Person person, Car car) {
        boolean personRemoved = false;
        System.out.println("We need remove this person " + person.toString() + " from car");
        for (int index = 0; index < car.getPerson().length && !personRemoved; index++) {
            System.out.println("index = " + index);
            if (person.equals(car.getPerson()[index])) {
                System.out.println("Person " + person.toString() + " war removed from car");
                car.getPerson()[index - 1] = null;
                personRemoved = true;
            }
        }
        if (!personRemoved) {
            System.out.println("Person " + person.toString() + " not found in car");
        }


    }

    //    ДЗ: дописать метод который проверяет что вы не моежете посадить
//    одного и того же пассажира в машину если он уже находится в машине,
    public static boolean isPersonInCar(Person person, Car car) {
        for (int index = 0; index < car.getPerson().length; index++) {
            if (person.equals(car.getPerson()[index])) {
                System.out.println("This person " + person.getName() + " already in the car");
                return true;
            }
        }
        return false;
    }

    //    ДЗ: дописать метод который выводит за сколько проедет дистанцию машина
//    которая введена с консоли
    public static Car timeForTravel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter name of car: ");
        String name = scanner.nextLine().trim();
        System.out.println("Enter year of create: ");
        int yearOfCreate = scanner.nextInt();
        System.out.println("Enter speed of car (km/h): ");
        double speed = scanner.nextDouble();
        System.out.println("Is car are electrical? (y/n): ");
        boolean electric = scanner.next().equalsIgnoreCase("y");
        Engine engine = new Engine(scanner.nextInt());
        System.out.println("Enter quantity of passengers: ");
        Person[] person = new Person[scanner.nextInt()];
        System.out.println("Enter distance: ");
        int distance = scanner.nextInt();
        Car car = new Car(yearOfCreate, name, speed, electric, engine, person);
        System.out.println("Create object car " + car);
        System.out.println("The car " + car.getName() + " will travel " + distance + " km in "
                + distance / speed + " hours");
        return car;
    }

    //    ДЗ: дописать метод который будет высчитывать сколько проедет машина на одной заправке, формула :
//    -(скорость автомобиля * количество лошадиных сил матора* 10 л )/ 2500
    public static void distanceOfCar(Car car) {
        System.out.println("\nThe car " + car.getName() + " will travel " + car.getSpeed()*car.getEngine().getHorsePower()*10/2500 + " km on one refueling");
    }
}

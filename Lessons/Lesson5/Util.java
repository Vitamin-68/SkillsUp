package Lesson5;

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
                if (car.getPerson()[index] == null) {
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

    public static void removePersonFromCar(Person person, Car car) {
        boolean personRemoved = false;
        System.out.println("We need remove this person " + person.toString() + " from car");
        for (int index = 0; index < car.getPerson().length; index++) {
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

}

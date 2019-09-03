package Lesson12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Funcinterface number = (k, m) -> k * m;
        System.out.printf( "number.multiply(20, 5) = " + number.multiply( 20, 5 ) + "\n");

        Stream ints = Stream.builder().add( 2 ).add( 5 ).add( 8 ).build();
        Iterator<Integer> iterator = ints.iterator();
        List<String> strings = new ArrayList<>(
                Arrays.asList( "First", "Second", "Third", "Fourth",
                        "First", "Second", "Third", "Fourth" )
        );
//        strings.stream().forEach( st-> {
//            System.out.printf( "st+1 = " + st + 1 );
//            System.out.printf( "st = " + st );
//        } );
        strings.stream().forEach( st -> System.out.printf( st ) );
        strings.stream().forEach( (System.out::println) );
        boolean result = strings.stream().allMatch( s -> s.length() > 5 );
        boolean result2 = strings.stream().anyMatch( s -> s.length() > 5 );

        strings.stream().collect( Collectors.toCollection( LinkedList::new ) );
        strings.stream().count();
        List<String> lessSix = strings.stream().distinct()
                .filter(s-> s.length() !=5 && s.startsWith( "s" ) ).collect( Collectors.toList());
        lessSix.forEach( System.out::println );

        Person person1 = new Person( "Vasja", 15 );
        Person person2 = new Person( "Andrii", 30 );
        Person person3 = new Person( "Sam", 25 );
        Person person4 = new Person( "Mari", 70 );
        Person person5 = new Person( "Anna", 6 );
        Person person6 = new Person( "Tetiana", 51 );

        List<Person> people = new ArrayList<>(
                Arrays.asList( person1, person2, person3, person4, person5, person6 )
        );
        people.forEach( System.out::println );
        System.out.printf( "______________________" );
        List<Person> personList = people
                .stream()
                .sorted(Comparator.comparing( Person::getAge ))
                .collect( Collectors.toList());

        personList.forEach(System.out::println);

        List<String> names = personList
                .stream()
                .map( Person::getName )
                .collect( Collectors.toList());
        System.out.printf( "_________________" );
        names.forEach( System.out::println );
    }

}

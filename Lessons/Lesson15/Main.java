package Lesson15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person( "Andry", "Fedosov", 25, 1.78, false,
                LocalDate.of( 1993, 07, 8 ) );
        Person person2 = new Person( "Sasha", "Arbusov", 27, 1.55, true,
                LocalDate.of( 1992, 11, 16 ) );
        Person person3 = new Person( "Tania", "Yabluneva", 21, 1.85, false,
                LocalDate.of( 1991, 02, 5 ) );
        Person person4 = new Person( "Nikolay", "Krivoy", 33, 1.98, true,
                LocalDate.of( 1994, 05, 30 ) );

        List<Person> people = new ArrayList<>(Arrays.asList (person4, person1, person2, person3));

        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.txt"));
        people.forEach(person -> {
            try {
                dataOutputStream.writeUTF(person.getFirstName());
                dataOutputStream.writeUTF(person.getLastName());
                dataOutputStream.writeInt(person.getAge());
                dataOutputStream.writeDouble(person.getHeight());
                dataOutputStream.writeBoolean(person.isMarried());
                dataOutputStream.writeUTF(String.valueOf(person.getBirthDay()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Utils.writeListOfPeople(people);
        try {
            Utils.readPeopleFromFile();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Utils.writeIntoFile(people);
        List<Person> secondList = Utils.getPersonListFromFile();
        secondList.forEach(System.out::println);

    }
}

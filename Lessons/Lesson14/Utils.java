package Lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    private static final String FIRST_NAME = "First Name: ";
    private static final String LAST_NAME = "Last Name: ";
    private static final String AGE = "Age: ";
    private static final String HEIGHT = "Height: ";
    private static final String MARRIED = "Married: ";
    private static final String BIRTH_DAY = "Birth day: ";
    private static final String WORD_SEPARATOR = ", ";
    private static final String LINE_SEPARATOR = "\n";
    private static final String LIST_PATH = "person.txt";

    static void writeIntoFile(List<Person> people) throws IOException {
        FileWriter writer = new FileWriter(new File(LIST_PATH));
        for (Person person : people) {
            writer.write(FIRST_NAME + person.getFirstName() + WORD_SEPARATOR +
                    LAST_NAME + person.getLastName() + WORD_SEPARATOR +
                    AGE + person.getAge() + WORD_SEPARATOR +
                    HEIGHT + person.getHeight() + WORD_SEPARATOR +
                    MARRIED + person.isMarried() + WORD_SEPARATOR +
                    BIRTH_DAY + person.getBirthDay() + WORD_SEPARATOR +
                    LINE_SEPARATOR);
        }
        writer.close();
    }

    static List<Person> getPersonListFromFile() throws IOException {
        List<Person> people = new ArrayList<>(  );

        BufferedReader reader = new BufferedReader( new FileReader( new File (LIST_PATH )) );
//        reader.lines().forEach((String item) -> {"First name"});
        return people;
    }

    static void writeListOfPeople(List<Person> people) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream( "peopleObject.txt" );
        ObjectOutputStream outputStream = new ObjectOutputStream( fileOutputStream );
        outputStream.writeObject( people );
        outputStream.close();
    }

    static void readPeopleFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("peopleObject.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        List<Person> people = (List<Person>) inputStream.readObject();

        people.forEach(System.out::println);
    }
}

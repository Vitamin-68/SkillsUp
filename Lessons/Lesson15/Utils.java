package Lesson15;

import java.io.*;
import java.time.LocalDate;
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

    static void readPeopleFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("peopleObject.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        List<Person> people = (List<Person>) inputStream.readObject();
        inputStream.close();

        people.forEach(System.out::println);
    }

    static void writeListOfPeople(List<Person> people) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("peopleObject.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(people);
        outputStream.close();
    }

    static List<Person> getPersonListFromFile() throws IOException {
        List<Person> people = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(new File(LIST_PATH)));
        reader.lines().forEach((String item) -> {
            Person person = new Person();
            String[] parameters = item.split(WORD_SEPARATOR);
            for (String parameter : parameters) {
                if (parameter.contains(FIRST_NAME)) {
                    person.setFirstName(parameter.split(":")[1]);
                } else if (parameter.contains(LAST_NAME)) {
                    person.setLastName(parameter.split(":")[1]);
                } else if (parameter.contains(AGE)) {
                    person.setAge(Integer.parseInt(parameter.split(":")[1].trim()));
                } else if (parameter.contains(HEIGHT)) {
                    person.setHeight(Double.parseDouble(parameter.split(":")[1].trim()));
                } else if (parameter.contains(MARRIED)) {
                    person.setMarried(Boolean.parseBoolean(parameter.split(":")[1].trim()));
                } else if (parameter.contains(BIRTH_DAY)) {
                    person.setBirthDay(LocalDate.parse(parameter.split(":")[1].trim()));
                }
            }
            people.add(person);
        });
        return people;
    }

    static void test() {
        File file = new File("Новый текстовый документ.txt");
        System.out.println("af" + file.getAbsoluteFile());
        System.out.println("ap" + file.getAbsolutePath());
        try {
            System.out.println("cp" + file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int number = -1;
            StringBuilder sBuilder = new StringBuilder();
            while ((number = fileInputStream.read()) != -1) {  // -1 end of file
                sBuilder.append((char) number);
            }
            System.out.println(sBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

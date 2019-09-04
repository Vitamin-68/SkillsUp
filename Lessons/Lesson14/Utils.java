package Lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Utils {
//    constanty
//    private static final LIST_PATH;

    static List<Person> getPersonListFromFile() throws IOException {
        List<Person> people = new ArrayList<>(  );

        BufferedReader bufferedReader = new BufferedReader( new FileReader( LIST_PATH ) );
    }

    static void writeListOfPeople(List<Person> people) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream( "peopleObject.txt" );
        ObjectOutputStream outputStream = new ObjectOutputStream( fileOutputStream );
        outputStream.writeObject( people );
        outputStream.close();
    }

    static void readPeopleFromFile(List<Person> )
}

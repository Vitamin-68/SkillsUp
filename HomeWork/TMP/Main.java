package TMP;


import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;

//        System.out.println("ID = " + findById(scanner));

        SimpleClass obj1 = new SimpleClass(10, "Iv");
        SimpleClass obj2 = new SimpleClass(20, "Ed");
        SimpleClass obj3 = new SimpleClass(30, "Pit");
        SimpleClass obj4 = new SimpleClass(40, "Ket");
        SimpleClass obj5 = new SimpleClass(50, "Lex");


        SimpleClass[] array = new SimpleClass[5];
        array[0] = obj1;
        array[1] = obj2;
        array[2] = obj3;
        array[3] = obj4;
        array[4] = obj5;

        for (SimpleClass i : array) {
            System.out.println("index = " + i);
            if (i != null && Objects.equals(i.getId(), 20)) {
                System.out.println("Bingo!" + i + " - Deleted");
                i = null;
                System.out.println("i - " + i);
//                array[1] = null;
            }
        }

        for (SimpleClass i: array) {
            System.out.println("index = " + i );
        }


        System.out.println("End");
    }

    private static int findById(Scanner scanner) {

        for (; ; ) {
            System.out.println("Enter id of contact (1-10)");
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                if (id > 0 && id <= 10) {
                    return id;
                }
            } else {
                scanner.next();
                System.out.println("You enter wrong number");
            }
        }
    }

}

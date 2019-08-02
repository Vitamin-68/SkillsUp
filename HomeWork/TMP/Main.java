package TMP;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
//        System.out.println("Enter number:");
//        while (scanner.hasNextInt() != true){
//            System.out.println("Enter right number");
////            scanner.next();
//        }

        System.out.println("ID = " + findById(scanner));

        System.out.println("End");
//        do {
//            System.out.println("first");
//            if (scanner.hasNextInt()) {
//                System.out.println("Enter number: " );
//                if (scanner.nextInt() == 0) {
//                    exit = false;
//                    break;
//                }
//                System.out.println("After nextInt " + scanner);
//
//            } else {
////                scanner.next();
//
//                System.out.println("Wrong number. Before next ");
////                String name = scanner.next();
////                String name2 = scanner.nextLine();
//                System.out.println("Name - " + scanner.next());
//
//            }
//
//        } while (exit);
    }

    private static int findById(Scanner scanner) {
        System.out.println("Enter id of contact (0-9)");
//        if (scanner.hasNextInt() == true) {
//            int id = scanner.nextInt();
////            System.out.println("i  " + id);
//            if (id > 0 && id <= 10) {
//                return id;
//            }
//            id = scanner.nextInt();
//        } while ()
        int id;
//        do {
//            id = scanner.nextInt();
//            System.out.println(id);
//        }
//        while (scanner.hasNextInt() != true & id >0);

//        if (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1: {
                    System.out.println(1);
                    break;
                }
                case 2: {
                    System.out.println(2);
                    break;
                }
            }
//        }
        return 100;
    }

}

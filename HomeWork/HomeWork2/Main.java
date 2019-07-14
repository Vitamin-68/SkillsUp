package HomeWork2;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

//        В данном примере я намеренно ограничил значения для факториала
//        и фибоначчи, меньше 2 нет смысла,
//        больше 100 - слишком огромное число в факториале, при 180 уже выход за double
        System.out.println("Введите значение для факториала,");
        printFacktorial(getNumber());

        System.out.println("Введите значение для ряда Фибоначчи,");
        printFibonacci(getNumber());
        tree();
    }

    public static int getNumber() {
        int number = 0;
        boolean isValid = false;
        do {
            System.out.println("число от 2 до 100%");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine().trim();
            try {
                number = Integer.parseInt(text);
                isValid = true;
            } catch (Exception e) {
                System.out.println("Ошибка! Необходимо вводить только цифры,");
            }
        } while (!isValid || number < 2 || number > 100);
        return number;
    }

    public static void printFacktorial(int number) {
        double result = 1;
        for (int count = 1; count <= number; count++) {
            result = (result * count);
        }
        System.out.println("Факториал !" + number + " = " + result);
    }

    public static void printFibonacci(int number) {
        double[] arr = new double[number];
        arr[0] = 0;
        arr[1] = 1;

        for (int index = 2; index < number; index++) {
            arr[index] = arr[index - 1] + arr[index - 2];
        }

        System.out.println("Ряд Фибоначчи состоящий из " + number + " чисел:");
        for (Double numbers : arr) {
            System.out.println(numbers);
        }
    }

    public static void tree() {
        String str = "*";
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(str);
            str += "**";
        }
    }
}

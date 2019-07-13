public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vova", 18, 157, 65, true );
        System.out.println(person1.toString());

        person1.name = "Vova";
        person1.age = 18;
        person1.height = 157;
        person1.weight = 65;
        person1.isCommunist = true;

        System.out.println(person1.toString());

        Person person2 = new Person();


//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();
//        System.out.println(text);
//        int number = scanner.nextInt();
//        if (scanner.hasNextInt()) {
//           number = scanner.nextInt();
//        System.out.println("Your number is " + number);
//        while (number < 100) {
//            System.out.println(number);
//            number++;

//        int[] arr = new int[10];
//        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
//        for (int index = number; index < arr.length; index++) {
//            System.out.println(arr2[index]);
//        }
//        for (int index = 0; index < arr2.length; index++){
//            arr[index] = 2+index;
//        }
//        for(Integer numbers : arr){
//            System.out.println(number);
//        }

//        }
//        System.out.println("Your number is " + number);
//        System.out.println("Your month is " + getMonth(number));
//        System.out.println(getBiggestName(number));
//
//    }
//    public static String getBiggestName (int number){
////        String name = "less";
//        if (number > 50) {
//            return "Biggest";
//        } else {
//            return "less";
//        }
////        return name;
//    }
//
//
//    public static String getNameOfSeason (int numberOfSeason){
//        switch (numberOfSeason) {
//            case 1: {
//                return "Winter";
//            }
//            case 2: {
//                return "Spring";
//            }
//            case 3: {
//                return "Summer";
//            }
//            case 4: {
//                return "Autumn";
//            }
//            default: {
//                return "not exist";
//            }
//        }
//    }
//    public static String getMonth(int numberOfMonth) {
//        String month ="";
//        switch (numberOfMonth) {
//            case 1: {
//                month = "January";
//                break;
//            }
//            case 2: {
//                month = "February";
//                break;
//            }
//            case 3: {
//                month = "March";
//                break;
//            }
//            case 4: {
//                month = "April";
//                break;
//            }
//            case 5: {
//                month = "May";
//                break;
//            }
//            case 6: {
//                month = "June";
//                break;
//            }
//            case 7: {
//                month = "July";
//                break;
//            }
//            case 8: {
//                month = "August";
//                break;
//            }
//            case 9: {
//                month = "September";
//                break;
//            }
//            case 10: {
//                month = "October";
//                break;
//            }
//            case 11: {
//                month = "November";
//                break;
//            }
//            case 12: {
//                month = "December";
//                break;
//            }
//            default: {
//                month = "Not exist";
//            }
//        }
//        return  "Not exist";
    }
}

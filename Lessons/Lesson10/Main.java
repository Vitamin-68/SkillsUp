package Lesson10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Set<String> strings = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        strings.add("Zero_STRING");
        strings.add("Second_STRING");
        strings.add("Third_STRING");
        strings.add(1,"firth_STRING");

        for (String string:strings  ) {
            System.out.println("String = " + string);

        }
        System.out.println("_______________________");
        strings.set(2, "replaced");
        for (String string: strings){
            System.out.println("String = " + string);

        }
        System.out.println("_______________________");
        strings.remove(0);
        for (String string: strings){
            System.out.println("String = " + string);

        }

//        strings.

//        Set strings = new LinkedHashSet<>();
//        strings.add(2);
//        boolean flag = strings.add("SOME_STRING")
//        for (String string:strings  ) {
//            System.out.println("String = "+ string);
//
//        }

    }
}

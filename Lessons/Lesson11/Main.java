package Lesson11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Partia> rada = new HashMap<>();
        Set<Deputy> deputies = new TreeSet<>(new DeputyComparator());

        Deputy deputy1 = new Deputy("deputy1", false);
        Deputy deputy2 = new Deputy("deputy2", false);
        Deputy deputy3 = new Deputy("deputy3", false);
        Deputy deputy4 = new Deputy("deputy4", false);
        Deputy deputy5 = new Deputy("deputy5", false);
        Deputy deputy6 = new Deputy("deputy6", false);
        Deputy deputy7 = new Deputy("deputy7", false);
        Deputy deputy8 = new Deputy("deputy8", false);

//        deputies.add(deputy5);
//        deputies.add(deputy3);
//        deputies.add(deputy7);
//        deputies.add(deputy2);
//        deputies.add(deputy1);
//        deputies.add(deputy6);
//        deputies.add(deputy4);
//        deputies.add(deputy8);

//        for (Deputy deputy : deputies) {
//            System.out.println(deputy);
//        }

        List<Deputy> deputies1 = new ArrayList<>();
        deputies1.add(deputy2);
        deputies1.add(deputy1);
        deputies1.add(deputy3);
        deputies1.add(deputy4);
        deputies1.add(deputy5);

        List<Deputy> deputies2 = new ArrayList<>();
        deputies2.add(deputy6);
        deputies2.add(deputy7);
        deputies2.add(deputy8);

        Partia coalition = new Partia(deputies1);
        Partia opposition = new Partia(deputies2);

        rada.put("Coalition", coalition);
        rada.put("Opposition", opposition);

        Utils utils = new Utils();

        utils.takeBribe(rada, "deputy6");
        utils.takeBribe(rada, "deputy7");
        utils.takeBribe(rada, "deputy8");
//        utils.getBribqToAllDeputy(rada);

        for (Deputy deputy : deputies1) {
            System.out.println(deputy);
        }
        for (Deputy deputy : deputies2) {
            System.out.println(deputy);
        }

        utils.removePartyIfAllBribeTakers(rada);


    }
}

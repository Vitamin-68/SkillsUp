package Lesson11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Map<String, Partia> rada = new HashMap<>();
        Set<Deputy> deputies = new TreeSet<>(new DeputyComperator());

        Deputy deputy1 = new Deputy("deputy1", false);

    }
}

package Lesson11;

import java.util.*;

public class Utils {
    public void takeBribe(Map<String, Partia> rada, String name) {

        Set<String> keys = rada.keySet();
        for (String key : keys) {
            for (Deputy deputy :rada.get(key).getDeputies()) {
                if (deputy.getName().equals(name)) {
                    deputy.setBribeTaker((true));
                    return;
                }
            }

        }

        Set<Map.Entry<String, Partia>> set = rada.entrySet();
        for (Map.Entry<String, Partia> partia : set) {
            for (Deputy deputy : partia.getValue().getDeputies()) {
                if (deputy.getName().equals(name)) {
                    deputy.setBribeTaker((true));
                    return;
                }
            }

        }

        List<Partia> partias = new ArrayList<>(rada.values());
        for (Partia partia : partias) {
            for (Deputy deputy : partia.getDeputies()) {
                if (deputy.getName().equals(name)){
                    deputy.setBribeTaker(true);
                    return;
                }
            }
        }
    }
}

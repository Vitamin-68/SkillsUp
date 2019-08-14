package Lesson11;


import java.util.*;

public class Utils {
    public void takeBribe(Map<String, Partia> rada, String name) {

        Set<String> keys = rada.keySet();
        for (String key : keys) {
            for (Deputy deputy : rada.get(key).getDeputies()) {
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
                if (deputy.getName().equals(name)) {
                    deputy.setBribeTaker(true);
                    return;
                }
            }
        }
    }

    public Map<String, Partia> getBribqToAllDeputy(Map<String, Partia> rada) {

        Set<String> keys = rada.keySet();
        for (String key : keys) {
            for (Deputy deputy : rada.get(key).getDeputies()) {
                takeBribe(rada, deputy.getName());
            }
        }
        return rada;
    }

    public Map<String, Partia> removePartyIfAllBribeTakers(Map<String, Partia> rada) {

        List<String> listForRemove = new ArrayList<>();
        Set<String> keys = rada.keySet();
        for (String key : keys) {
            for (Deputy deputy : rada.get(key).getDeputies()) {
                if (!deputy.isBribeTaker()) {
                    break;
                } else {
                    if (rada.get(key).getDeputies().indexOf(deputy) == rada.get(key).getDeputies().size() - 1) {
                        System.out.println("All deputy in " + key + " partia are bribes.\n" +
                                "This partia will be removed.");
                        listForRemove.add(key);
                    }
                }
            }
        }
        for (String key : listForRemove) {
            rada.remove(key);
        }
        System.out.println("Rada has " + rada.size() + " partia(-es)");
        return rada;
    }
}

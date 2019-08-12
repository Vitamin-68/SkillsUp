package Lesson11;

import java.util.Comparator;

public class DeputyComperator implements Comparator<Deputy> {

    @Override
    public int compare(Deputy o1, Deputy o2) {
        return Integer.compare(o1.compareTo(o2), 0);
    }

}

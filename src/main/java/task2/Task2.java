package task2;

import java.util.*;

public class Task2 implements UniqueNameI {

    public String findFirstUniqueName(List<String> names) {
        List<String> sortNames = new ArrayList<>();
        HashSet<String> bannedNames = new HashSet<>();
        for (String name : names) {
            if (sortNames.contains(name) && !bannedNames.contains(name)) {
                sortNames.remove(name);
                bannedNames.add(name);
            } else {
                sortNames.add(name);
            }
        }
        if (sortNames.size() > 0) {
            return sortNames.get(0);
        } else {
            return null;
        }
    }
}

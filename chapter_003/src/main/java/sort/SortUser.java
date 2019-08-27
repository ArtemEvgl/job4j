package sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser {

    public Set<User> sort(List<User> list) {
        Set<User> sortedList = new TreeSet<>();
        sortedList.addAll(list);
        return sortedList;
    }
}

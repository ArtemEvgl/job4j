package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertListToTreeSet {
    @Test
    public void whenListConvertToSortedTreeSetByAge() {
        SortUser sortUser = new SortUser();
        List<User> list = new ArrayList<>();
        list.add(new User("Simp", 20));
        list.add(new User("Tony", 18));
        list.add(new User("Bard", 35));
        Set<User> result = sortUser.sort(list);
        List<User> expect = new ArrayList<>();
        expect.add(new User("Tony", 18));
        expect.add(new User("Simp", 20));
        expect.add(new User("Bard", 35));
        assertThat(result.toString(), is(expect.toString()));
    }
}

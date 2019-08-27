package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {
    @Test
    public void sortedByLenghName() {
        SortUser sortUser = new SortUser();
        List<User> list = new ArrayList<>();
        list.add(new User("Yan", 10));
        list.add(new User("Charlton", 15));
        list.add(new User("Bobby", 22));
        List<User> expect = new ArrayList<>();
        expect.add(new User("Yan", 10));
        expect.add(new User("Bobby", 22));
        expect.add(new User("Charlton", 15));
        assertThat(sortUser.sortNameLength(list).toString(), is(expect.toString()));
    }

    @Test
    public void sortedByNameAndAge() {
        SortUser sortUser = new SortUser();
        List<User> list = new ArrayList<>();
        list.add(new User("Yan", 15));
        list.add(new User("Yan", 10));
        list.add(new User("Bobby", 33));
        list.add(new User("Bobby", 22));
        List<User> expect = new ArrayList<>();
        expect.add(new User("Bobby", 22));
        expect.add(new User("Bobby", 33));
        expect.add(new User("Yan", 10));
        expect.add(new User("Yan", 15));
        assertThat(sortUser.sortByNameAndAge(list).toString(), is(expect.toString()));
    }
}

package convert;

import org.junit.Test;
import сonvert.User;
import сonvert.UserConvert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
    @Test
    public void ListUsers2HashMap() {
        UserConvert userConvert = new UserConvert();
        List<User> list = new ArrayList<>();
        HashMap<Integer, User> expect = new HashMap<>();
        User[] users = {new User(0, "Petr", "Moscow"),
                        new User(1, "Dima", "Kursk"),
                        new User(2, "Roma", "Orel")};
        for(int i = 0; i < users.length; i++) {
            expect.put(i, users[i]);
            list.add(users[i]);
        }
        assertThat(userConvert.process(list), is(expect));
    }
}

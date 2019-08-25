package сonvert;

import java.util.HashMap;
import java.util.List;

public class UserConvert {
    /**
     * Метод конвертирует входной список пользователей в Map с ключем id и соответсвующему  ему значению.
     * @param list входной список пользователей.
     * @return HashMap с ключем id и соответсвующему  ему значению пользователя.
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> result = new HashMap<>();
        for(User user : list) {
            result.put(user.getId(), user);
        }
        return result;
    }
}

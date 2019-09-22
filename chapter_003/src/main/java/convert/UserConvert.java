package convert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserConvert {
    /**
     * Метод конвертирует входной список пользователей в Map с ключем id и соответсвующему  ему значению.
     * @param list входной список пользователей.
     * @return HashMap с ключем id и соответсвующему  ему значению пользователя.
     */
    public Map<Integer, User> process(List<User> list) {
        HashMap<Integer, User> result = new HashMap<>();
        for (User user : list) {
            result.put(user.getId(), user);
        }
        return result;
    }
}

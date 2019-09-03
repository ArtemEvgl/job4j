package bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankLab {

    private Map<User, List<Account>> map = new HashMap<>();

    /**
     * Метод добавляет пользователя и пустой список счетов в отображение.
     * @param user пользователь
     */
    public void addUser(User user) {
        this.map.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаляет пользвателя из отображения.
     * @param user пользователь
     */
    public void deleteUser(User user) {
        this.map.remove(user);
    }

    /**
     * Метод добавляет счет указанному пользователю по паролю.
     * @param passport пароль пользователя
     * @param account добавленный счет
     */
    public void addAccountToUser(String passport, Account account) {
        this.map.get(getUserByPassport(passport)).add(account);
    }

    /**
     * Метод удаляет указанный счет у пользователя с указанныйм паролем.
     * @param passport пароль пользователя.
     * @param account удаленный счет
     */
    public void delete(String passport, Account account) {
        this.map.get(getUserByPassport(passport)).remove(account);
    }

    /**
     * Метод получает счета пользователя по его паролю.
     * @param passport пароль пользователя.
     * @return счета пользователя.
     */
    public List<Account> getUserAccounts(String passport) {
        return this.map.get(getUserByPassport(passport));
    }

    /**
     * Метод отвечает за перевод денежных средств.
     * @param srcPassport пароль отправителя.
     * @param srcRequisite реквизиты счета отправителя.
     * @param destPassport пароль получателя.
     * @param destRequisite реквизиты счета получателя.
     * @param amount сумма перевода.
     * @return исход операции.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport,
                                 String destRequisite, double amount) {
        if ((getAccountByRequisite(getUserAccounts(destPassport), destRequisite) == null) || (getAccountByRequisite(getUserAccounts(srcPassport), srcRequisite) == null) || (getAccountByRequisite(getUserAccounts(srcPassport), srcRequisite).getValue() < amount)) {
            return false;
        } else {
            getAccountByRequisite(getUserAccounts(srcPassport), srcRequisite).transfer(getAccountByRequisite(getUserAccounts(destPassport), destRequisite), amount);
            return true;
        }
    }

    /**
     * Метод позволяет по паролю пользователя найти его.
     * @param passport пароль пользователя.
     * @return искомый пользователь.
     */
    public User getUserByPassport(String passport) {
        User result = null;
        for (User user : this.map.keySet()) {
            if (user.getPasport().equals(passport)) {
                result = user;
            }
        }
        return result;
    }

    /**
     * Метод позволяет из списка счетов найти нужный при мпомощи реквизитов.
     * @param accounts список счетов, в которых происходит поиск.
     * @param requisite реквизиты нужного счета.
     * @return искомый счет.
     */
    public Account getAccountByRequisite(List<Account> accounts, String requisite) {
        Account result = null;
        for (Account account : accounts) {
            if (account.getRequisites().equals(requisite)) {
                result = account;
            }
        }
        return result;
    }
}

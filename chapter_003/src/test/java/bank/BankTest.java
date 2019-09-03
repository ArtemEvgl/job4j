package bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BankTest {
    @Test
    public void whenAddNewUser() {
        BankLab bankLab = new BankLab();
        bankLab.addUser(new User("Tema", "321"));
        assertThat(bankLab.getUserByPassport("321").toString(), is("Tema 321"));
    }

    @Test
    public void whenDeleteUser() {
        BankLab bankLab = new BankLab();
        User user = new User("Tema", "321");
        bankLab.addUser(user);
        bankLab.deleteUser(user);
        assertThat(bankLab.getUserByPassport("321") == null, is(true));
    }

    @Test
    public void whenAddAccountToUser() {
        BankLab bankLab = new BankLab();
        User user = new User("Tema", "321");
        bankLab.addUser(user);
        bankLab.addAccountToUser("321", new Account("5544", 200));
        assertThat(bankLab.getAccountByRequisite(bankLab.getUserAccounts("321"), "5544").getRequisites(), is("5544"));
    }

    @Test
    public void whenDeleteAccount() {
        BankLab bankLab = new BankLab();
        User user = new User("Tema", "321");
        bankLab.addUser(user);
        Account account = new Account("5544", 200);
        bankLab.addAccountToUser("321", account);
        bankLab.delete("321", account);
        assertThat(bankLab.getAccountByRequisite(bankLab.getUserAccounts("321"), "5544") == null, is(true));
    }

    @Test
    public void whenGetUsersAccounts() {
        BankLab bankLab = new BankLab();
        bankLab.addUser(new User("Tema", "321"));
        bankLab.addAccountToUser("321", new Account("5543", 230));
        assertThat(bankLab.getUserAccounts("321").toString(), is("[5543 230.0]"));
    }

    @Test
    public void whenTransferMoneyFail() {
        BankLab bankLab = new BankLab();
        bankLab.addUser(new User("Tema", "321"));
        bankLab.addAccountToUser("321", new Account("5543", 230));
        bankLab.addUser(new User("Dima", "322"));
        bankLab.addAccountToUser("322", new Account("5542", 500));
        assertThat(bankLab.transferMoney("321", "5543", "322", "5542", 500), is(false));
    }

    @Test
    public void whenTransferSuccses() {
        BankLab bankLab = new BankLab();
        bankLab.addUser(new User("Tema", "321"));
        bankLab.addAccountToUser("321", new Account("5543", 230));
        bankLab.addUser(new User("Dima", "322"));
        bankLab.addAccountToUser("322", new Account("5542", 500));
        bankLab.transferMoney("321", "5543", "322", "5542", 20);
        assertThat(bankLab.getUserAccounts("321").toString(), is("[5543 210.0]"));
    }
}

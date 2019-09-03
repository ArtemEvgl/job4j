package bank;

public class Account {

    String requisites;
    double value;

    public Account(String requisites, int value) {
        this.requisites = requisites;
        this.value = value;
    }

    public String getRequisites() {
        return requisites;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.requisites + " " + this.value;
    }

    public void transfer(Account account, double value) {
        this.value -= value;
        account.value += value;
    }
}

package bank;

public class User {

    String name;
    String pasport;

    public User(String name, String pasport) {
        this.name = name;
        this.pasport = pasport;
    }

    public String getName() {
        return name;
    }

    public String getPasport() {
        return pasport;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(getClass() == obj.getClass())) {
            return false;
        } else {
            User user = (User) obj;
            return this.getName() == user.getName() && this.getPasport() == user.getPasport();
        }
    }

    @Override
    public int hashCode() {
        return this.getPasport().hashCode();
    }

    @Override
    public String toString() {
        return this.name + " " + this.pasport;
    }
}

package department;

public class Subdivision {

    private String name;
    private String[] codes;

    public Subdivision(String name) {
        this.name = name;
        this.codes = name.split("\\\\");
    }

    public String getName() {
        return name;
    }

    public String[] getCodes() {
        return codes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(getClass() == obj.getClass())) {
            return false;
        } else {
            Subdivision subdivision = (Subdivision) obj;
            return this.name.equals(subdivision.getName());
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return this.getName();
    }
}

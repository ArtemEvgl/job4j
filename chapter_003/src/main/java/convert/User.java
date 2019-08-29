package convert;

public class User {

    private Integer id;
    private String name;
    private String city;

    public User(Integer id, String name, String city) {
        this.id = id;
        this.city = city;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

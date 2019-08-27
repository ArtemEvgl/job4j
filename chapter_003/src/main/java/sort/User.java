package sort;

public class User implements Comparable<User>{

    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User user) {
        return this.age.compareTo(user.getAge());
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}

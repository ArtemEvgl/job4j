package school;

public class Student implements Comparable<Student> {
    private int score;
    private String surname;

    public Student(int score, String surname) {
        this.surname = surname;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return  this.surname + " " + String.valueOf(score);
    }

    @Override
    public int compareTo(Student student) {
        return this.surname.compareTo(student.getSurname());
    }
}

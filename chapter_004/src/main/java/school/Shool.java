package school;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Shool {

    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
      return students.stream().filter(predicate).collect(Collectors.toList());
    }

    public ArrayList<Student> createStandartList() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(25));
        students.add(new Student(30));
        students.add(new Student(55));
        students.add(new Student(60));
        students.add(new Student(80));
        students.add(new Student(82));
        return students;
    }
}

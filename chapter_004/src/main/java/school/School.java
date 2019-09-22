package school;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {
    Student student1 = new Student(25, "Petrov");
    Student student2 = new Student(30, "Dimidov");
    Student student3 = new Student(55, "Ivanov");
    Student student4 = new Student(60, "Rikov");
    Student student5 = new Student(80, "Pavlov");
    Student student6 = new Student(82, "Werov");


    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
      return students.stream().filter(predicate).collect(Collectors.toList());
    }

    public Map<String, Student> convertToMap(List<Student> students) {
        return students.stream().collect(Collectors.toMap(
                student -> student.getSurname(),
                student -> student, (s1, s2) -> s1

        ));
    }

    public List<Student> groupStudents(List<Student> students, int bounde) {
        Collections.sort(students);
        return students.stream().flatMap(Stream::ofNullable).
                takeWhile(student -> student.getScore() > bounde).collect(Collectors.toList());
    }

    public ArrayList<Student> createStandardList() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        return students;
    }

    public Map<String, Student> createStandardMap() {
        Map<String, Student> students = new HashMap<>();
        students.put(student1.getSurname(), student1);
        students.put(student2.getSurname(), student2);
        students.put(student3.getSurname(), student3);
        students.put(student4.getSurname(), student4);
        students.put(student5.getSurname(), student5);
        students.put(student6.getSurname(), student6);
        return students;
    }


}

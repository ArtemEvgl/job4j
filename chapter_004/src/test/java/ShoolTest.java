import org.junit.Test;
import school.Student;
import school.School;

import java.util.ArrayList;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShoolTest {

    @Test
    public void whenSortClassA() {
        School shool = new School();
        ArrayList<Student> students = shool.createStandartList();
        ArrayList<Student> expect = new ArrayList<>();
        expect.add(new Student(80, "Pavlov"));
        expect.add(new Student(82, "Werov"));
        assertThat((shool.collect(students, student -> student.getScore() <= 100 && student.getScore() >= 70)).toString(), is(expect.toString()));
    }

    @Test
    public void whenSortClassB() {
        School shool = new School();
        ArrayList<Student> students = shool.createStandartList();
        ArrayList<Student> expect = new ArrayList<>();
        expect.add(new Student(55, "Ivanov"));
        expect.add(new Student(60, "Rikov"));
        assertThat((shool.collect(students, student -> student.getScore() < 70 && student.getScore() >= 50)).toString(), is(expect.toString()));
    }

    @Test
    public void whenSortClassC() {
        School shool = new School();
        ArrayList<Student> students = shool.createStandartList();
        ArrayList<Student> expect = new ArrayList<>();
        expect.add(new Student(25, "Petrov"));
        expect.add(new Student(30, "Dimidov"));
        assertThat((shool.collect(students, student -> student.getScore() < 50 && student.getScore() > 0)).toString(), is(expect.toString()));
    }

    @Test
    public void whenListInMap() {
        School school = new School();
        ArrayList<Student> students = school.createStandartList();
        Map<String, Student> expect = school.createStandartMap();
        assertThat(school.convertToMap(students), is(expect));
    }
}

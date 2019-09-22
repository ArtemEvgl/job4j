import org.junit.Test;
import school.School;
import school.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShoolTest {

    @Test
    public void whenSortClassA() {
        School shool = new School();
        ArrayList<Student> students = shool.createStandardList();
        ArrayList<Student> expect = new ArrayList<>();
        expect.add(new Student(80, "Pavlov"));
        expect.add(new Student(82, "Werov"));
        assertThat((shool.collect(students, student -> student.getScore() <= 100 && student.getScore() >= 70)).toString(), is(expect.toString()));
    }

    @Test
    public void whenSortClassB() {
        School shool = new School();
        ArrayList<Student> students = shool.createStandardList();
        ArrayList<Student> expect = new ArrayList<>();
        expect.add(new Student(55, "Ivanov"));
        expect.add(new Student(60, "Rikov"));
        assertThat((shool.collect(students, student -> student.getScore() < 70 && student.getScore() >= 50)).toString(), is(expect.toString()));
    }

    @Test
    public void whenSortClassC() {
        School shool = new School();
        ArrayList<Student> students = shool.createStandardList();
        ArrayList<Student> expect = new ArrayList<>();
        expect.add(new Student(25, "Petrov"));
        expect.add(new Student(30, "Dimidov"));
        assertThat((shool.collect(students, student -> student.getScore() < 50 && student.getScore() > 0)).toString(), is(expect.toString()));
    }

    @Test
    public void whenListInMap() {
        School school = new School();
        ArrayList<Student> students = school.createStandardList();
        Map<String, Student> expect = school.createStandardMap();
        assertThat(school.convertToMap(students), is(expect));
    }

    @Test
    public void whenGroupStudentWhoBoundeMore60() {
        List<Student> expect = List.of(new Student(65, "Avarov"), new Student(76, "Blinov"));
        List<Student> students = new ArrayList<>();
        students.add(new Student(76, "Blinov"));
        students.add(new Student(65, "Avarov"));
        students.add(new Student(24, "Pavlov"));
        School school = new School();
        assertThat(school.groupStudents(students, 60).toString(), is(expect.toString()));
    }
}

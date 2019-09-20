import streamapi.Shool;
import streamapi.Student;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShoolTest {

    @Test
    public void whenSortClassA() {
        Shool shool = new Shool();
        ArrayList<Student> students = shool.createStandartList();
        ArrayList<Student> expect = new ArrayList<>();
        expect.add(new Student(80));
        expect.add(new Student(82));
        assertThat((shool.collect(students, student -> student.getScore() <= 100 && student.getScore() >= 70)).toString(), is(expect.toString()));
    }

    @Test
    public void whenSortClassB() {
        Shool shool = new Shool();
        ArrayList<Student> students = shool.createStandartList();
        ArrayList<Student> expect = new ArrayList<>();
        expect.add(new Student(55));
        expect.add(new Student(60));
        assertThat((shool.collect(students, student -> student.getScore() < 70 && student.getScore() >= 50)).toString(), is(expect.toString()));
    }

    @Test
    public void whenSortClassC() {
        Shool shool = new Shool();
        ArrayList<Student> students = shool.createStandartList();
        ArrayList<Student> expect = new ArrayList<>();
        expect.add(new Student(25));
        expect.add(new Student(30));
        assertThat((shool.collect(students, student -> student.getScore() < 50 && student.getScore() > 0)).toString(), is(expect.toString()));
    }
}

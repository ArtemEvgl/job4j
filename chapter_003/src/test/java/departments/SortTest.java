package departments;

import department.SortSubdivision;
import department.Subdivision;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortTest {
    public static ArrayList<Subdivision> createDepartments() {
        ArrayList<Subdivision> departments = new ArrayList<>();
        departments.add(new Subdivision("K1\\SK1"));
        departments.add(new Subdivision("K1\\SK1\\SSK1"));
        departments.add(new Subdivision("K1\\SK1\\SSK2"));
        departments.add(new Subdivision("K2\\SK1\\SSK1"));
        departments.add(new Subdivision("K2\\SK1\\SSK2"));
        departments.add(new Subdivision("K2"));
        departments.add(new Subdivision("K1\\SK2"));
        return departments;
    }

    @Test
    public void increaseSort() {
        List<Subdivision> departments = SortTest.createDepartments();
        List<Subdivision> expect = List.of(new Subdivision("K1"), new Subdivision("K1\\SK1"), new Subdivision("K1\\SK1\\SSK1"),
                new Subdivision("K1\\SK1\\SSK2"), new Subdivision("K1\\SK2"), new Subdivision("K2"), new Subdivision("K2\\SK1"),
                new Subdivision("K2\\SK1\\SSK1"), new Subdivision("K2\\SK1\\SSK2"));
        assertThat(SortSubdivision.increaseSort(SortSubdivision.getAllSubdivision(departments)), is(expect));
    }

    @Test
    public void decreaseSort() {
        List<Subdivision> departments = SortTest.createDepartments();
        List<Subdivision> expect = List.of(new Subdivision("K2"), new Subdivision("K2\\SK1"), new Subdivision("K2\\SK1\\SSK2"),
                new Subdivision("K2\\SK1\\SSK1"), new Subdivision("K1"), new Subdivision("K1\\SK2"), new Subdivision("K1\\SK1"),
                new Subdivision("K1\\SK1\\SSK2"), new Subdivision("K1\\SK1\\SSK1"));
        assertThat(SortSubdivision.decreaseSort(SortSubdivision.getAllSubdivision(departments)), is(expect));
    }

}

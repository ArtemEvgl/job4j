package sort;

import algoritms.Sort;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class QuickSortTest {
    @Test
    public void whenNeedSortMassive() {
        int[] test = {4, 2, 6, 7, 3};
        int[] expect = {2, 3, 4, 6, 7};
        Sort.quickSort(test, 0, test.length - 1);
        assertThat(test, is(expect));
    }
}

package convert;

import org.junit.Test;
import сonvert.ConvertList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class ConvertListTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList list = new ConvertList();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void whenListWith2arrayThenGeneralList() {
        ConvertList list = new ConvertList();
        List<int[]> test = new ArrayList();
        test.add(new int[]{1, 2, 3});
        test.add(new int[]{7, 9});
        List<Integer> result = list.convert(test);
        List<Integer> expect = Arrays.asList(1, 2, 3, 7, 9);
        assertThat(result, is(expect));
    }


}

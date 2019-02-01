package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class TwoSortArrayInOneTest {
	@Test
	public void twoSortArray() {
		TwoSortArrayInOne sortArray = new TwoSortArrayInOne();
		int[] first = new int[] {1, 4, 5, 8, 9};
		int[] second = new int[] {2, 6, 8, 7};
		int[] result = sortArray.twoSortArrayInOne(first, second);
		int[] expect = new int[] {1, 2, 4, 5, 6, 7, 8, 8, 9};
		assertThat(result, is(expect));
	}
}
			
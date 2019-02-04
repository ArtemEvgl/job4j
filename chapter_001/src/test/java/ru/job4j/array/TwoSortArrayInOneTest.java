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
		int[] first = new int[] {3, 7, 8, 9, 10};
		int[] second = new int[] {1, 3, 5, 7, 13, 14};
		int[] result = sortArray.twoSortArrayInOne(first, second);
		int[] expect = new int[] {1, 3, 3, 5, 7, 7, 8, 9, 10, 13, 14};
		assertThat(result, is(expect));
	}
}
			
package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class BubbleSortTest {
	@Test
	public void arraySortBubble() {
		BubbleSort sort = new BubbleSort();
		int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] result = sort.sort(input);
		int[] expect = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(result, is(expect));
	}
}
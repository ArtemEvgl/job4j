package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class ArrayDublicateTest {
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		ArrayDublicate array = new ArrayDublicate();
		String[] input = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
		String[] result = array.remove(input);
		String[] expect = new String[] {"Привет", "Мир", "Супер"};
		assertThat(result, is(expect));
	}
}
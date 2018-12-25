package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
	@Test
	public void whenArrayHasLenght5Then0() {
		FindLoop find = new FindLoop();
		int[] input = new int[] {5, 10, 3};
		int value = 5;
		int result = find.indexOf(input, value);
		assertThat(result, is(0));
	}
	@Test
	public void whenArrayHasLenght8ThenNone() {
		FindLoop loop = new FindLoop();
		int[] input = new int[] {1, 3, 5, 9};
		int value = 8;
		int result = loop.indexOf(input, value);
		assertThat(result, is(-1));
	}
}


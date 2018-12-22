package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* @author Arterm Evglevsky
* @version $Id$;
* @since 0.1;
*/
public class MaxTest {
	@Test
	public void whenFirstLessSecond() {
	Max max = new Max();
	assertThat(max.maxNumber(2, 1), is(2));
	}
	@Test
	public void whenFirstLessSecondAndThird() {
	Max max = new Max();
	assertThat(max.maxNumber(4, 3, 3), is(4));
	}	
}
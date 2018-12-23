package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* @author Arterm Evglevsky
* @version $Id$;
* @since 0.1;
*/
public class FactorialTest {
	@Test
	public void whenNumber5Factorial120() {
	Factorial factorial = new Factorial();
	assertThat(factorial.calc(5), is(120));
	}
	@Test
	public void whenNumber0Factorial1() {
		Factorial factorial = new Factorial();
		assertThat(factorial.calc(0), is(1));
	}
}
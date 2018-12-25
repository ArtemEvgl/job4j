package ru.job4j.array;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* @author Arterm Evglevsky
* @version $Id$;
* @since 0.1;
*/
public class SquareTest {
	@Test
	public void whenBound3Then149() {
		Square square = new Square();
		int[] rst = square.calculate(3);
		int[] expect = new int[]{1, 4, 9};
		assertThat(rst, is(expect));
	}
	@Test
	public void whenBound5Then1491625() {
		Square square = new Square();
		int[] rst = square.calculate(5);
		int[] expect = new int[]{1, 4, 9, 16, 25};
		assertThat(rst, is(expect));
	}
	@Test
	public void whenBound1Then1() {
		Square square = new Square();
		int[] rst = square.calculate(1);
		int[] expect = new int[]{1};
		assertThat(rst, is(expect));
	}
}
		
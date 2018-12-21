package ru.job4j.condition;
import org.junit.Test;
import ru.job4j.calculator.Calculator;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
*Test
*
*@author Artem Evglevsky
*@version $Id$
*@since 0.1
*/
public class PointTest {
	
	/*
	* Test distanceTo
	*/
	@Test
	public void makeDistanceBetweenPoints() {
		Point a = new Point(0,1);
		Point b = new Point(2, 5);
		double distance = a.distanceTo(b);
		assertThat(distance, closeTo(4.4, 0.1));
	}
}
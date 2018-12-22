package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {
	@Test
	public void whenAreaSetThreePointsTriangleArea() {
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		Point c = new Point(2, 0);
		// Создаем объект треугольник.
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		double expected = 2D;
		assertThat(result, closeTo(expected, 0.1));
	}
	}
package ru.job4j.calculator;

import org.junit.Test;
import ru.job4j.calculator.Calculator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Test
*
*@author Artem Evglevsky
*@version $Id$
*@since 0.1
*/
public class CalculatorTest {

	/**
	* Test add.
	*/
	@Test
	public void whenAddOnePlusOneThenTwo() {
    Calculator calc = new Calculator();
    calc.add(1D, 1D);
    double result = calc.getResult();
    double expected = 2D;
    assertThat(result, is(expected));
    }
	/**
	* Test Div.
	*/
	@Test
	public void whenDiv2On2Then1() {
	Calculator calc = new Calculator();
	calc.div(2D, 2D);
	double result = calc.getResult();
	double expected = 1D;
	assertThat(result, is(expected));
	}
	/**
	* Test Multiple.
	*/
	@Test
	public void whenMultiple2On2Then4() {
	Calculator calc = new Calculator();
	calc.multiple(2D, 2D);
	double result = calc.getResult();
	double expected = 4D;
	assertThat(result, is(expected));
	}
	/**
	* Test Subtract.
	*/
	@Test
	public void whenSubtract4on2Then2() {
	Calculator calc = new Calculator();
	calc.subtract(4D, 2D);
	double result = calc.getResult();
	double expected = 2D;
	assertThat(result, is(expected));
	}
	
}
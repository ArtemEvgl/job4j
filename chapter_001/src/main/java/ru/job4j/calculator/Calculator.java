package ru.job4j.calculator;


/**
 * Calculate.
 *
 * @author Artem Evglevsky
 */
public class Calculator {

	private double result;
	/**
	 * add - суммирование двух аргументов.
	 * @param first-first number, second - second number.
	 */
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	 * div - деление двух аргументов.
	 * @param first-first number, second - second number.
	 */
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**
	 * subtract - вычитание двух аргументов.
	 * @param first-first number, second - second number.
	 */
	public void subtract(double first, double second) {
		this.result = first - second;
	}
	/**
	 * multiple - умножение двух аргументов.
	 * @param first-first number, second - second number.
	 */
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	 * Method getResult.
	 * @return result of math operation.
	 */
	public double getResult() {
		return this.result;
	}
}
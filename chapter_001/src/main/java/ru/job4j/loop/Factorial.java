package ru.job4j.loop;

/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class Factorial {
	/**
	* Метод считает факториал введеного числа.
	*
	* @param n - введенное число.
	* @return Факториал введенного числа.
	*/
	public int calc(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

}
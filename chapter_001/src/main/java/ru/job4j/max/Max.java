package ru.job4j.max;

/**
* @author Arterm Evglevsky
* @version $Id$;
* @since 0.1;
*/
public class Max {
	/**
	* Выводит максимальное число из двух.
	* @param Два введенных числа.
	* @retrun Максимальное число.
	*/
	public int maxNumber(int first, int second) {
		return first > second ? first : second;
	}
}
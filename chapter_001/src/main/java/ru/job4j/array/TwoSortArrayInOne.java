package ru.job4j.array;

import java.util.Arrays;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class TwoSortArrayInOne {
	/**
	 * Метод позволяет получить из двух отсортированных массивов один.
	 *
	 * @param first  первый массив.
	 * @param second второй массив.
	 * @return один отсортированный массивов.
	 */
	public int[] twoSortArrayInOne(int[] first, int[] second) {
		int[] third = new int[first.length + second.length];
		int i = 0;
		int n = 0;
		for (int j = 0; j < third.length; j++) {
			if (i == first.length) {
				third[j] = second[n];
				n++;
			} else if (n == second.length) {
				third[j] = first[i];
				i++;
			} else if (first[i] < second[n]) {
				third[j] = first[i];
				i++;
			} else {
				third[j] = second[n];
				n++;
			}
		}
		return third;
	}
}

	
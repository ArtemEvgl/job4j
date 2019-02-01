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
	* @param first первый массив.
	* @param second второй массив.
	* @return один отсортированный массивов.
	*/
	public int[] twoSortArrayInOne(int[] first, int[] second) {
	int[] third = new int[first.length + second.length];
	System.arraycopy(first, 0, third, 0, first.length);
	System.arraycopy(second, 0, third, first.length, second.length);
	for (int j = 0; j < third.length - 1; j++) {
			for (int i = 0; i < third.length - 1 - j; i++) {
				if (third[i] > third[i + 1]) {
					int temp = third[i + 1];
					third[i + 1] = third[i];
					third[i] = temp;
				}
			}
	}
	return third;
	}
}
	
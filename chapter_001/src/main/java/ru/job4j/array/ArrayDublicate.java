package ru.job4j.array;

import java.util.Arrays;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class ArrayDublicate {
	/**
	 * Метод удаляет дубликаты в массиве.
	 * @param array входной массив.
	 * @return массив без дубликатов.
	 */
	public String[] remove(String[] array) {
		int n = 0;
		int p = array.length;
		for (int j = 0; j < array.length - n; j++) {
			for (int i = 1 + j; i < array.length - n; i++) {
				if (array[j].equals(array[i])) {
				String temp = array[array.length - n - 1];
				array[array.length - n - 1] = array[i];
				array[i] = temp;
				n++;

				}
			}
		}
		return Arrays.copyOf(array, p - n);
	}
}
package ru.job4j.array;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class FindLoop {
	/**
	* Метод производит поиск элемента в заданном массиве и возвращает его позицию.
	*
	* @param data заданный массив.
	* @param el элемент, который нужно найти.
	* @return возвращает позицию найденного элемента.
	*/
	public int indexOf(int[] data, int el) {
		int res = -1;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == el) {
				res = i;
				break;
			}
		}
		return res;
	}
}
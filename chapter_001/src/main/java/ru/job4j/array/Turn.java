package ru.job4j.array;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class Turn {
	/**
	* Метод переворачивает массив задам наперед.
	*
	* @param array введенный массив.
	* @return перевернутый массив.
	*/
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		return array;
	}
}
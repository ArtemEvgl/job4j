package ru.job4j.array;

/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class Matrix {
	/**
	* Метод позволяет посроить спомощью таблицу умножения заданного размера.
	* 
	* @param size размер таблицы.
	* @return таблицу заданного размера.
	*/
	public int[][] multiple(int size) {
		int[][] table = new int[size][size];
		for (int j = 0; j < table.length; j++) {
			for (int i = 0; i < table.length; i++) {
				table[i][j] = (i + 1) * (j + 1);
			}
		}
		return table;
	}
}
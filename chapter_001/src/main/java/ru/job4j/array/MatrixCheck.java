package ru.job4j.array;

/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class MatrixCheck {
	/**
	* Метод возвращает true если все элементы по диагонали одинаковые.
	* @param data массив булевских значений.
	* @return результат сравнения.
	*/
	public boolean mono(boolean[][] data) {
		boolean result = true;
		for (int i = 0, j = data.length -1; i < data.length - 1; i++, j--) {
			if ((data[i][i] != data[i + 1][i + 1]) || (data[j][i] != data[j -1][i + 1])) {
				result = false;
				break;
			}
		}
		return result;
	}
}
				
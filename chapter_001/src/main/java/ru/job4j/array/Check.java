package ru.job4j.array;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class Check {
	/** Метод проверяет всели значения равны false или true.
	*
	* @param data массив булевских значений.
	* @return значение true или false.
	*/
	public boolean mono(boolean[] data) {
		boolean result = true;
		for (int i = data.length - 1; i > 0; i--) {
			if (data[i - 1] != data[i]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
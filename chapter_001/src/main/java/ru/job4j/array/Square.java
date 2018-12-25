package ru.job4j.array;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class Square {
	/**
	* Метод возводит в квадрат числа от 1 до введенного.
	*
	* @param bound предел массива.
	* @return возведенные в квадрат числа.
	*/
	public int[] calculate(int bound) {
		int[] rst = new int[bound];
		for (int i = 0; i < rst.length; i++) {
			rst[i] = (i + 1) * (i + 1);
		}
		return rst;
	}
}	
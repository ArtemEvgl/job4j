package ru.job4j.loop;

/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class Counter {
	/**
	* Метод вычисляет сумму четных чисел в заданном диапозоне.
	* @param Интервал.
	* @return Сумму четных чисел.
	*/
	public int add(int start, int finish) {
		int summa = 0;
		for (int i = start; i < finish; i++) {
			if (i % 2 == 0) {
				summa += i;
			}
		}
	return summa;	
	}
}
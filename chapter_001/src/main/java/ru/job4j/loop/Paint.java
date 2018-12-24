package ru.job4j.loop;

import java.lang.StringBuilder;
import java.util.function.BiPredicate;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class Paint {
	/**
	* Метод выводит правосторонню пирамиду.
	*
	* @param height высота пирамиды.
	* @return Рисунок полупирамиды в консоли.
	*/
	public String rightTrl(int height) {
		return this.loopBy(
				height,
				height,
				(row, column) -> row >= column
		);		
	}
	/**
	* Метод рисует левосторонюю пирамиду в консоли.
	*
	* @param height высота пирамиды.
	* @return Рисунок полупирамиды в консоли.
	*/
	public String leftTrl(int height) {
		return this.loopBy(
				height,
				height,
				(row, column) -> row >= height - column - 1
		);		
	}
	/**
	* Метод рисует  пирамиду в консоли.
	*
	* @param height высота пирамиды.
	* @return Рисунок пирамиды в консоли.
	*/
	public String pyramid(int height) {
		return this.loopBy(
				height,
				2 * height - 1,
				(row, column) -> row >= height - column - 1 && row + height - 1 >= column
		);		
	}
	
	/**
	* Метод позволяющий произвести рефакторинг кода.
	*
	* @param height Высота пирамиды.
	* @param weight Ширина пирамиды.
	* @param условие проставление галки.
	* @return Нарисованную пирамиду в консоли.
	*/
	public String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
		StringBuilder screen = new StringBuilder();
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (predict.test(row, column)) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
	
}
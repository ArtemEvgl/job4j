package ru.job4j.loop;

import java.lang.StringBuilder;
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
		StringBuilder screen = new StringBuilder();
		int weight = height;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (row >= column) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
	/**
	* Метод рисует левосторонюю пирамиду в консоли.
	*
	* @param height высота пирамиды.
	* @return Рисунок полупирамиды в консоли.
	*/
	public String leftTrl(int height) {
		StringBuilder screen = new StringBuilder();
		int weight = height;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (row >= weight - column - 1) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
	/**
	* Метод рисует  пирамиду в консоли.
	*
	* @param height высота пирамиды.
	* @return Рисунок пирамиды в консоли.
	*/
	public String pyramid(int height) {
		StringBuilder screen = new StringBuilder();
		int weight = 2 * height - 1;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (row >= height - column - 1 && row + height - 1 >= column) {
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
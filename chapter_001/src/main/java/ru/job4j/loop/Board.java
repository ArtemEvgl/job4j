package ru.job4j.loop;

import java.lang.StringBuilder;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class Board {
	/**
	* Метод должен рисовать доску из символо Х и пробелов.
	*
	* @param width board.
	* @param height board.
	* @return Рисунок доски.
	*/
	public String paint(int width, int height) {
		StringBuilder screen = new StringBuilder();
		String ln = System.lineSeparator();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (((i + j) % 2 == 0) | ((i + j) == 0)) {
					screen.append("X");
				} else {
					screen.append(" ");
				}
			}
			screen.append(ln);
		}
		return screen.toString();
	}
}
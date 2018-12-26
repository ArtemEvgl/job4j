package ru.job4j.array;

/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class ArrayChar {
	private char[] data;
	
	public ArrayChar(String line) {
		this.data = line.toCharArray();
	}
	
	/**
	* Проверяет, что слово начинается с префикса.
	* @param prefix слово.
	* @return если слово начинается с префикса.
	*/
	public boolean startWith(String prefix) {
		boolean result = true;
		char[] value = prefix.toCharArray();
		for (int i = 0; i < value.length; i++) {
				if (data[i] == value[i]) {
					continue;
				} else {
					result = false;
				}
				break;
		}
		return result;
	}
}	
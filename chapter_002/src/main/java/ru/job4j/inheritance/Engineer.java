package ru.job4j.inheritance;

public class Engineer extends Profession {
	/**
	 * Метод возвращает построенный дом.
	 * @param home - дом.
	 * @return построенный дом.
	 */
	public Home buildHome (Home home) {
		return home;
	}
}
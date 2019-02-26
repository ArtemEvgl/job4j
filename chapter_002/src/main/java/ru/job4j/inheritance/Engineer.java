package ru.job4j.inheritance;

public class Engineer extends Profession {
	
	public Engineer(String name, String profession) {
		super(name, profession);
	}
	/**
	 * Метод возвращает построенный дом.
	 * @param home - дом.
	 * @return построенный дом.
	 */
	public Home buildHome(Home home) {
		return home;
	}
}
package ru.job4j.inheritance;
/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/

public class Profession {
	private String name;
	private String profession;
	
	public Profession(String name, String profession) {
	this.name = name;
	this.profession = profession;
	}		
	/**
	 * Метод возвращает имя человека.
	 * @return имя человека.
	 */
	public String getName() {
		return name;
	}
}
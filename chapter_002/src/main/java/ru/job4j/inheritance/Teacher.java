package ru.job4j.inheritance;

public class Teacher extends Profession {
	
	public Teacher(String name, String profession) {
		super(name, profession);
	}
	/**
	 * Метод возвращает умного студента.
	 * @param student - студент.
	 * @return умный студент.
	 */
	public Student teachStudent(Student student) {
		return student;
	}
}
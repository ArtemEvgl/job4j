package ru.job4j.inheritance;

public class Doctor extends Profession {
	private Diagnose diagnose;
	
	public Doctor(String name, String proffesion) {
		super(name, proffesion);
	}
	/**
	 * Метод возвращает диагноз человека.
	 * @param pacient - пациент.
	 * @return диагноз человека.
	 */
	public Diagnose heal(Pacient pacient) {
		return diagnose;
	}
}
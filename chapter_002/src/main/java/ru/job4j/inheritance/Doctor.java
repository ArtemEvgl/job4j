package ru.job4j.inheritance;

public class Doctor extends Profession {
	Diagnose diagnose;
	/**
	 * Метод возвращает диагноз человека.
	 * @param pacient - пациент.
	 * @return диагноз человека.
	 */
	public Diagnose heal (Pacient pacient) {
		return diagnose;
	}
}
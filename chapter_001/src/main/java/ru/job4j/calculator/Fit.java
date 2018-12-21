package ru.job4j.calculator;

/**
* Программа расчета идеального веса.
*/
public class Fit {
	/**
	* Идеальный вес для мужчин.
	* @param height Рост.
	* @return идеальный вес.
	*/
	public double manWeight(double height) {
	return (height - 100D) * 1.15D;
	}
	/**
	* Иделаьный вес для женщин.
	* @param height Рост.
	* @return идеальный вес.
	*/
	public double womanWeight(double height) {
	return (height - 110D) * 1.15D;
	}
}
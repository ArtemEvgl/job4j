package ru.job4j.condition;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	* Метод вычисления периметра по длинам сторон.
	*
	* Формула.
	*
	* (ab + ac + bc)/ 2
	*
	* @param ab расстояние между точками a b 
	* @param ac расстояние между точками a с
	* @param bc расстояние между точками b c
	* @return Периметр.
	*/
	public double period(double ab, double ac, double bc) {
		return (ab + ac + bc) / 2;
	}
	
	/**
	* Метод должен вычислить площадь треугольника.
	*
	* @return Вернуть прощадь, если треугольник существует или -1, если треугольника нет.
	*/
	public double area() {
		double rsl = -1;
		double ab = this.a.distanceTo(this.b);
		double ac = this.a.distanceTo(this.c);
		double bc = this.b.distanceTo(this.c);
		double p = period(ab, ac, bc);
		if (this.exist(ab, ac, bc)) {
			rsl = Math.sqrt(
							p * (p - ab) * (p - ac) * (p - bc)
							);
		}
		return rsl;
	}
		
	/**
	* Метод проверяет можно ли построить треугольник.
	*
	* @param ab расстояние между точками a b 
	* @param ac расстояние между точками a с
	* @param bc расстояние между точками b c
	* @return true если можно построить и false если нельзя.
	*/
	public boolean exist(double ab, double ac, double bc) {
		return (ab + ac > bc) & (ac + bc > ab) & (ab + bc > ac);
	}
}
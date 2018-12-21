package ru.job4j.condition;

/**
* @author Artem Evglevsky.
* @version $id$
* @since 0.1
*/
public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
	this.x = x;
	this.y = y;
	}
	
	public double distanceTo(Point that) {
	 return Math.sqrt(
	 		Math.pow(this.x - that.x, 2) + Math.pow(this.x - that.y, 2)
	 );
	 }
	
	public static void main(String[] args) {
		Point a = new Point(0, 1);
		Point b = new Point(2, 5);
		double result =  a.distanceTo(b);
		System.out.println("Расстояние между точками A и B : " + result);
	}

}
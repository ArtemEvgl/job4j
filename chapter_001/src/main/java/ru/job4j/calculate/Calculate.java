package ru.job4j.calculate;

/**
* Calculate.
*
* @author Artem Evglevsky
*/
public class Calculate{
	/**
	* Method echo.
	* @param echo Text "aah"
	* @return echo plus "aah" "aah"
	*/
	public String echo(String echo){
		return String.format("%s %s %s", echo ,echo, echo);
	}
	/**
	* Main
	* @param args-args
	*/
	public static void main(String[] args){
	Calculate calc = new Calculate();
	System.out.println(calc.echo("aah"));
	}
}
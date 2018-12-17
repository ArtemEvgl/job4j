package ru.job4j.calculate;

public class Calculate{
	
	public String echo(String echo){
		return String.format("%s %s %s", echo ,echo, echo);
	}
	
	public static void main(String[] args){
	Calculate calc = new Calculate();
	System.out.println(calc.echo("aah"));
	}
}
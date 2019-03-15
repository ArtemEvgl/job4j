package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 import java.util.*;
 
 public class ConsoleInput implements Input {
	private Scanner scanner = new Scanner(System.in);
	
	public String ask(String question) {
		System.out.println(question);
		return scanner.nextLine();
	}
 }
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
	
	public int ask(String question, int[] range) {
		int key = Integer.valueOf(this.ask(question));
		boolean exist = false;
		for (int i = 0; i < range.length; i++) {
			if (range[i] == key) {
				exist = true;
				break;
			}
		}
		if (exist) {
			return key;
		} else {
			throw new MenuOutException("out of menu range");
		}
	}
 }
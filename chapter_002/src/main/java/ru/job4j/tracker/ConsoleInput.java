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
		if (!this.checkKey(key, range)) {
			throw new MenuOutException("out of menu range");
		}
		return key;
	}

	public boolean checkKey(int key, int[] range) {
		boolean exist = false;
		for (int i = 0; i < range.length; i++) {
			if (range[i] == key) {
				exist = true;
				break;
			}
		}
		return exist;
	}
 }
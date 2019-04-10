package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {
	public int ask(String question, int[] range) {
		int value = -1;
		boolean invalid = true;
		do {
			try {
				value = super.ask(question, range);
				invalid = false;
			} catch (MenuOutException mot) {
				System.out.println("Введите корректый пункт меню");
			} catch (NumberFormatException nfe) {
				System.out.println("Введите корректные данные");
			}
		} while (invalid);
		return value;
	}
}
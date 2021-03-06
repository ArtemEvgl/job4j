package ru.job4j.tracker;

public class ValidateInput implements Input {

	private final Input input;

	public ValidateInput(final Input input) {
		this.input = input;
	}

	@Override
	public String ask(String question) {
		return this.input.ask(question);
	}

	public int ask(String question, int[] range) {
		int value = -1;
		boolean invalid = true;
		do {
			try {
				value = this.input.ask(question, range);
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
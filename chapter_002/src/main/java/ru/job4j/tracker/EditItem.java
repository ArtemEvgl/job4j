package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */

import java.util.function.Consumer;

public class EditItem extends BaseAction {
	boolean result;
	Consumer<String> consumer;

	 public EditItem(int key, String name, Consumer<String> consumer) {
		 super(key, name);
		 this.consumer = consumer;
	 }

	 @Override
	 public void execute(Tracker tracker, Input input) {
		 consumer.accept("------------ Редактирвоание заявки --------------");
		 String id = input.ask("Введите id заявки которую нужно справить : ");
		 String name = input.ask("Введите новое имя заявки :");
		 String desc = input.ask("Введите новое описание заявки :");
		 Item item = new Item(name, desc, System.currentTimeMillis());
		 result = tracker.replace(id, item);
		 if (result) {
			consumer.accept("Заявка успешно отредактирована");
		 } else {
			consumer.accept("Ошибка операции, проверьте id заявки");
		 }
	 }
 }
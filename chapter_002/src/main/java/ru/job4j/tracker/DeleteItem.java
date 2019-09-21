package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */

import java.util.function.Consumer;

public class DeleteItem extends BaseAction {
	 Consumer<String> consumer;

	 public DeleteItem(int key, String name, Consumer<String> consumer) {
		 super(key, name);
		 this.consumer = consumer;
	 }

	 @Override
	 public void execute(Tracker tracker, Input input) {
		  consumer.accept("------------ Удаление заявки --------------");
		  boolean result;
		  String id = input.ask("Введите id заявки которую нужно удалить : ");
		  result = tracker.delete(id);
		  if (result) {
		  	consumer.accept("Заявка успешно удалена.");
		  } else {
			consumer.accept("Ошибка операции, проверьте id заявки.");
		  }
	 }
 }
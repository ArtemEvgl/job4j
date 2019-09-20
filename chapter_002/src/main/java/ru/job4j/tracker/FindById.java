package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */

import java.util.function.Consumer;

public class FindById extends BaseAction {

	private Consumer<String> consumer;

	 public FindById(int key, String name, Consumer<String> consumer) {
		 super(key, name);
		 this.consumer = consumer;
	 }
	 
	 @Override
	 public void execute(Tracker tracker, Input input) {
		 consumer.accept("------------ Поиск заявки по ID --------------");
		   Item findItem;
		   String id = input.ask("Введите id заявки которую нужно найти : ");
		   findItem = tracker.findById(id);
		    if (findItem == null) {
				consumer.accept("Заявка не найдена");
		    } else {
				consumer.accept(findItem.toString());
		    }
	 }
 }
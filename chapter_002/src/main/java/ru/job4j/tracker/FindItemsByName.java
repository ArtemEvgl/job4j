package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */

import java.util.List;
import java.util.function.Consumer;

public class FindItemsByName extends BaseAction {

	private Consumer<String> consumer;
	 
	 public FindItemsByName(int key, String name, Consumer<String> consumer) {
		 super(key, name);
		 this.consumer = consumer;
	 }
	 
	 @Override
	 public void execute(Tracker tracker, Input input) {
		 consumer.accept("------------ Поиск заявок по имени--------------");
			List<Item> findItems;
			String name = input.ask("Введите название заявки которую нужно найти : ");
			findItems = tracker.findByName(name);
			if (findItems.size() == 0) {
				consumer.accept("Заявки не найдены");
			} else {
				for (Item item : findItems) {
					consumer.accept(item.toString());
				}
			}
	 }
 }
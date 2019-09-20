package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */

import java.util.List;
import java.util.function.Consumer;

public class ShowItems extends BaseAction {
	private Consumer<String> consumer;
	 
	 public ShowItems(int key, String name, Consumer<String> output) {
		 super(key, name);
		 this.consumer = output;
	 }
		 
	 @Override
	 public void execute(Tracker tracker, Input input) {
		consumer.accept("------------ Вывод всех заявок --------------");
		List<Item> items = tracker.findAll();
		for (Item item : items) {
			  consumer.accept(item.toString());
		}
	 }
	
 }
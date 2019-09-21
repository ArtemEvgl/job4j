package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */

import java.util.function.Consumer;

public class AddItem extends BaseAction {
	 private Consumer<String> consumer;

	 public AddItem(int key, String name, Consumer<String> consumer) {
		 super(key, name);
		 this.consumer = consumer;
	 }
	 
	 @Override
	 public void execute(Tracker tracker, Input input) {
		consumer.accept("------------ Добавление новой заявки --------------");
        String name = input.ask("Введите имя заявки :");
        String desc = input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, System.currentTimeMillis());
        tracker.add(item);
        consumer.accept("------------ Новая заявка с getId : " + item.getId() + "-----------");
		consumer.accept("------------ Новая заявка с name : " + item.getName() + "-----------");
		consumer.accept("------------ Новая заявка с decs : " + item.getDecs() + "-----------");
	 }

 }
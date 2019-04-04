package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class ShowItems implements UserAction {
	 @Override
	 public int key() {
		 return 1;
	 }
	 @Override
	 public void execute(Tracker tracker, Input input) {
		System.out.println("------------ Вывод всех заявок --------------");
		Item[] items = tracker.findAll();
		for (Item item : items) {
			  System.out.println(item.toString());
		}
	 }
	 @Override
	 public String info() {
		return "2. Показать все заявки";
	 }
 }
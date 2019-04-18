package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class ShowItems extends BaseAction {
	 
	 public ShowItems(int key, String name) {
		 super(key, name);
	 }
		 
	 @Override
	 public void execute(Tracker tracker, Input input) {
		System.out.println("------------ Вывод всех заявок --------------");
		Item[] items = tracker.findAll();
		for (Item item : items) {
			  System.out.println(item.toString());
		}
	 }
	
 }
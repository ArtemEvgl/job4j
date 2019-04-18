package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class FindItemsByName extends BaseAction {
	 
	 public FindItemsByName (int key, String name) {
		 super(key, name);
	 }
	 
	 @Override
	 public void execute(Tracker tracker, Input input) {
		 System.out.println("------------ Поиск заявок по имени--------------");
			Item[] findItems;
			String name = input.ask("Введите название заявки которую нужно найти : ");
			findItems = tracker.findByName(name);
			if (findItems.length == 0) {
				System.out.println("Заявки не найдены");
			} else {
				for (Item item : findItems) {
					System.out.println(item.toString());
				}
			}
	 }
 }
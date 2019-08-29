package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class FindById extends BaseAction {
	 
	 public FindById(int key, String name) {
		 super(key, name);
	 }
	 
	 @Override
	 public void execute(Tracker tracker, Input input) {
		 System.out.println("------------ Поиск заявки по ID --------------");
		   Item findItem;
		   String id = input.ask("Введите id заявки которую нужно найти : ");
		   findItem = tracker.findById(id);
		    if (findItem == null) {
				System.out.println("Заявка не найдена");
		    } else {
				System.out.println(findItem.toString());
		    }
	 }
 }
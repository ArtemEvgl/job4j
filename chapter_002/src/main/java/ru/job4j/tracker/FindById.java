package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class FindById implements UserAction {
	 
	 @Override
	 public int key() {
		 return 4;
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
	 @Override
	 public String info() {
		return "5. Найти заявку по id";
	 }
 }
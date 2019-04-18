package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class EditItem extends BaseAction {
	boolean result;

	 public EditItem (int key, String name) {
		 super(key, name);
	 }

	 @Override
	 public void execute(Tracker tracker, Input input) {
		 System.out.println("------------ Редактирвоание заявки --------------");
		 String id = input.ask("Введите id заявки которую нужно справить : ");
		 String name = input.ask("Введите новое имя заявки :");
		 String desc = input.ask("Введите новое описание заявки :");
		 Item item = new Item(name, desc, System.currentTimeMillis());
		 result = tracker.replace(id, item);
		 if (result) {
			System.out.println("Заявка успешно отредактирована");
		 } else {
			System.out.println("Ошибка операции, проверьте id заявки");
		 }
	 }
 }
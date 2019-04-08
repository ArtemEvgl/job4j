package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class EditItem implements UserAction {
	 private boolean result;
	 private String info;

	 @Override
	 public int key() {
		 return 2;
	 }

	 @Override
	 public void execute(Tracker tracker, Input input) {
		 System.out.println("------------ Редактирвоание заявки --------------");
		 String id = input.ask("Введите id заявки которую нужно справить : ");
		 String name = input.ask("Введите новое имя заявки :");
		 String desc = input.ask("Введите новое описание заявки :");
		 Item item = new Item(name, desc, System.currentTimeMillis());
		 result = tracker.replace(id, item);
		 if(result) {
			System.out.println("Заявка успешно отредактирована");
		 } else {
			System.out.println("Ошибка операции, проверьте id заявки");
		 }
	 }

	 @Override
	 public String info() {
	 	return "3. Исправить заявку";
	 }
 }
package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class DeleteItem implements UserAction {
	 private boolean result;
	 private String info;
	 
	 @Override
	 public int key() {
		 return 3;
	 }

	 @Override
	 public void execute(Tracker tracker, Input input) {
		System.out.println("------------ Удаление заявки --------------");
		  boolean result;
		  String id = input.ask("Введите id заявки которую нужно удалить : ");
		  result = tracker.delete(id);
		  if (result) {
			System.out.println("Заявка успешно удалена.");
		  } else {
			System.out.println("Ошибка операции, проверьте id заявки.");
		  }
	 }
	 @Override
	 public String info() {
	 	return "4. Удалить заявку";
	 }
 }
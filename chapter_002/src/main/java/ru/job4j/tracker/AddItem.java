package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class AddItem implements UserAction {
	 @Override
	 public int key() {
		 return 0;
	 }
	 @Override
	 public void execute(Tracker tracker, Input input) {
		System.out.println("------------ Добавление новой заявки --------------");
        String name = input.ask("Введите имя заявки :");
        String desc = input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, System.currentTimeMillis());
        tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
		System.out.println("------------ Новая заявка с name : " + item.getName() + "-----------");
		System.out.println("------------ Новая заявка с decs : " + item.getDecs() + "-----------");
	 }
	 @Override
	 public String info() {
		return "1. Добавить новую заявку";
	 }
 }
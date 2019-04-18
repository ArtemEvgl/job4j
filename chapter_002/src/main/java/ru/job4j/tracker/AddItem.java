package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class AddItem extends BaseAction {
	 
	 public AddItem(int key, String name) {
		 super(key, name);
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

 }
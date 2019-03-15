package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class StartUI {
	 /**
	 * Константа меню для добавления новой заявки.
	 */
	 private static final int ADD = 1;
	 /**
	 * Константа для вывода всех заявок.
	 */
	 private static final int SHOW_ALL = 2;
	/**
	 * Константа для замены заявки.
	 */
	 private static final int EDIT_ITEM = 3;
	 /**
	 * Константа для удаление завки.
	 */
	 private static final int DELETE_ITEM = 4;
	 /**
	 * Константа для поиска заявки по id.
	 */
	 private static final int FIND_BY_ID = 5;
	 /**
	 * Константа для поиска заявок по имени.
	 */
	 private static final int FIND_BY_NAME = 6;
	 /**
	 * Константа для выхода из цикла.
	 */
	  private static final int EXIT = 7;
	  /**
     * Получение данных от пользователя.
     */
	  private final Input input;
	  /**
     * Хранилище заявок.
     */
	  private final Tracker tracker;
	  /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
	  private StartUI(Tracker tracker, Input input) {
		  this.tracker = tracker;
		  this.input = input;
	  }
	  
	  /**
	  * Основной цикл программы.
	  */
	  public void init() {
		  boolean exit = false;
		  while (!exit) {
			  this.showMenu();
			  int answer = Integer.parseInt(this.input.ask("Введите пункт меню : "));
			  switch (answer) {
				  case ADD:
				  	this.createItem();
				  	break;
				  case SHOW_ALL:
				  	this.showItems();
				  	break;
				  case EDIT_ITEM:
				  	this.editItem();
				  	break;
				  case DELETE_ITEM:
				  	this.deleteItem();
				  	break;
				  case FIND_BY_ID:
				  	this.findItem();
				  	break;
				  case FIND_BY_NAME:
				  	this.findItems();
				  	break;
				  case EXIT:
				  	exit = true;
				  	break;
				  default:
				  	break;
			  }
		  }
	  }
	  /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
	  private void createItem() {
		System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, System.currentTimeMillis());
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
	  }
	  /**
	  * Метод реализует показ меню.
	  */
	  private void showMenu() {
		  System.out.println("Меню.");
		  System.out.println("1. Добавить новую заявку");
		  System.out.println("2. Показать все заявки");
		  System.out.println("3. Исправить заявку");
		  System.out.println("4. Удалить заявку");
		  System.out.println("5. Найти заявку по id");
		  System.out.println("6. Найти заявки по имени");
		  System.out.println("7. Выйти из программы");
	  }
	  /**
	  * Метод реализует показ всех заявок.
	  */
	  private void showItems() {
		  System.out.println("------------ Вывод всех заявок --------------");
		  Item[] items = this.tracker.findAll();
		  this.displayItems(items);
	  }
	  /**
	  * Метод реализует исправление заявки.
	  */
	  private void editItem() {
		System.out.println("------------ Редактирвоание заявки --------------");
		boolean result;
		String id = this.input.ask("Введите id заявки которую нужно справить : ");
		String name = this.input.ask("Введите новое имя заявки :");
        String desc = this.input.ask("Введите новое описание заявки :");
        Item item = new Item(name, desc, System.currentTimeMillis());
		result = this.tracker.replace(id, item);
		this.checkResult(result); 
	  }
	  /**
	  * Метод реализует удаление заявки.
	  */
	  private void deleteItem() {
		  System.out.println("------------ Удаление заявки --------------");
		  boolean result;
		  String id = this.input.ask("Введите id заявки которую нужно удалить : ");
		  result = this.tracker.delete(id);
		  this.checkResult(result); 
	  }
	  /**
	  * Метод реализует поиск заявки по id.
	  */
	  private void findItem() {
	  	   System.out.println("------------ Поиск заявки по ID --------------");
		   Item findItem;
		   String id = this.input.ask("Введите id заявки которую нужно найти : ");
		   findItem = this.tracker.findById(id);
		   if (findItem == null) {
		      System.out.println("Заявка не найдена");
		   }
		   else {
			  System.out.println("id: " + findItem.getId() + ", name:" + findItem.getName() + ", description: "
					+ findItem.getDecs() + ", time: " + findItem.getTime());
		   }
	  }
	  /**
	  * Метод реализует поиск заявок по имени.
	  */
	  private void findItems() {
	  	System.out.println("------------ Поиск заявок по имени--------------");
	  	Item[] findItems;
	  	String name = this.input.ask("Введите id заявки которую нужно найти : ");
	  	findItems = this.tracker.findByName(name);
	  	if (findItems == null) {
	  		System.out.println("Заявки не найдены");
	  	}
	  	else {
	  		this.displayItems(findItems);
	  	}
	  }
	  
	  /**
	  * Метод реализует вывод теста в зависимост от результата.
	  */
	  private void checkResult(boolean result) {
		  if (result) {
			System.out.println("Операция выполнена успешно");
		  }
		  else {
			  System.out.println("Ошибка операции");
		  }
	  }
	  /**
	  * Метод реализует вывод заявок на экран.
	  */
	  private void displayItems(Item[] items) {
		for (Item item : items) {
			  System.out.println("id: " + item.getId() + ", name:" + item.getName() + ", description: "
					  + item.getDecs() + ", time: " + item.getTime());
		}
	  }
	  
	   /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new Tracker(), new ConsoleInput()).init();
    }
}
	  
	  
	  
	  
		  

	  
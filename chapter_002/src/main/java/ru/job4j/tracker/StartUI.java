package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public class StartUI {
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
	  public StartUI(Tracker tracker, Input input) {
		  this.tracker = tracker;
		  this.input = input;
	  }
	  
	  /**
	  * Основной цикл программы.
	  */
	  public void init() {
		  MenuTracker menu = new MenuTracker(this.input, this.tracker);
		  menu.fillActions();
		  do { 
		  menu.show();
		  menu.select(Integer.valueOf(input.ask("")) - 1);
		  } while (!"y".equals(this.input.ask("Exit?(y): ")));
	  }
	   /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new Tracker(), new ConsoleInput()).init();
    }
}
	  
	  
	  
	  
		  

	  
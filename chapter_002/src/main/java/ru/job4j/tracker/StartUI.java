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
		  menu.select(input.ask("Select:", getRange(menu)) - 1);
		  } while (!"y".equals(this.input.ask("Exit?(y): ")));
	  }
	  
	  public int[] getRange(MenuTracker menu) {
		int[] range = new int[menu.getActionsLentgh()];
		for (int i = 0; i < menu.getActionsLentgh(); i++) {
			range[i] = i + 1;
		}
		return range;
	  }
	   /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new Tracker(), new ValidateInput()).init();
    }
}
	  
	  
	  
	  
		  

	  
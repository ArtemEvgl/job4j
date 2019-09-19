package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */

import java.util.function.Consumer;

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
	  * Функциональный интерфейс, для реализации патерна стратегия.
	  */
	 private final Consumer<String> output;
	 /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
	  public StartUI(Tracker tracker, Input input, Consumer<String> output) {
		  this.tracker = tracker;
		  this.input = input;
		  this.output = output;
	  }
	  
	  /**
	  * Основной цикл программы.
	  */
	  public void init() {
		  MenuTracker menu = new MenuTracker(this.input, this.tracker, output);
		  menu.fillActions();
		  int[] range = menu.getRange();
		  do { 
		  menu.show();
		  menu.select(input.ask("Select:", range) - 1);
		  } while (!"y".equals(this.input.ask("Exit?(y): ")));
	  }
	  
	  
	   /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new Tracker(), new ValidateInput(
        		new ConsoleInput()), System.out::println
		).init();
    }
}
	  
	  
	  
	  
		  

	  
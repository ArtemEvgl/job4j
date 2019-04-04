package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */
 
 public interface UserAction {
	 /**
	 * Метод возвращает ключ опции
	 * @return ключ
	 */
	 int key();
	  /**
	 * Основной метод
	 * @param input объект типа Input
	 * @param tracker объект типа Tracker
	 */
	 void execute(Tracker tracker, Input input);
	  /**
	 * Метод возвращает информацю о данном пункте меню
	 * @return Строка меню
	 */
	 String info();
 }
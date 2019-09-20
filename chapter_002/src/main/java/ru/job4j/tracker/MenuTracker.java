package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MenuTracker {
	 /**
	 @param хранит ссылку на объект
	 */
	 private Input input;	 
	/**
	 @param хранит ссылку на объект
	 */
	 private Tracker tracker;
	 /**
	 @param хранит ссылку на массив типа UserAction.
	 */
	 private List<UserAction> actions = new ArrayList<>();
	/**
	 * Функциональный интерфейс, для реализации патерна стратегия.
	 */
	private final Consumer<String> output;
	 
	 /** Констуктор
	 *
	 * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }
	/**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }
	/**
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.actions.add(new AddItem(1, "Добавить новую заявку"));
        this.actions.add(new ShowItems(2, "Показать все заявки", output));
        this.actions.add(new EditItem(3, "Исправить заявку"));
        this.actions.add(new DeleteItem(4, "Удалить заявку"));
        this.actions.add(new FindById(5, "Найти заявку по id", output));
        this.actions.add(new FindItemsByName(6, "Найти заявки по имени", output));
    }
	/**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
	 public void select(int key) {
		 this.actions.get(key).execute(this.tracker, this.input);
	 }
	 
	 public int[] getRange() {
		int[] range = new int[getActionsLentgh()];
		for (int i = 0; i < getActionsLentgh(); i++) {
			range[i] = i + 1;
		}
		return range;
	  }
	 /**
     * Метод выводит на экран меню.
     */
    public void show() {
        output.accept("Меню.");
        for (UserAction action : this.actions) {
            if (action != null) {
               output.accept(action.info());
            }
        }
    }


}
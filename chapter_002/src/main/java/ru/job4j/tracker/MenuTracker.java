package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */

import java.util.ArrayList;
import java.util.List;

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
	 
	 /** Констуктор
	 *
	 * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
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
        this.actions.add(new AddItem());
        this.actions.add(new ShowItems());
        this.actions.add(new EditItem());
        this.actions.add(new DeleteItem());
        this.actions.add(new FindById());
        this.actions.add(new FindItemsByName());
    }
	/**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
	 public void select(int key) {
		 this.actions.get(key).execute(this.tracker, this.input);
	 }
	 /**
     * Метод выводит на экран меню.
     */
    public void show() {
        System.out.println("Меню.");
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
}
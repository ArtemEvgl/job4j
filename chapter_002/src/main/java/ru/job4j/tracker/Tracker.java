package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
 public class Tracker {
	 /**
	 * Массив для хранения заявок.
	 */
	 private final List<Item> items = new ArrayList();
	 private static final Random RN = new Random();

	/**
	* Метод реализующий добавление заявки в хранилище
	* @param item новая заявка
	*/
	public Item add(Item item) {
		item.setId(this.generateId());
		items.add(item);
		return item;
	}
	
	/**
	* Метод генерирует уникальный ключ для заявки.
	* return уникальный ключ.
	*/
	private String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}
	
	/**
	* Метод заменяет ячейку в массиве.
	* @param id уникальный индетификатор ячейки.
	* @param newItem новая ячейка.
	* return уникальный ключ.
	*/
	public boolean replace(String id, Item newItem) {
		boolean result = false;
		for(Item item : items) {
			if(item.getId().equals(id)) {
				newItem.setId(id);
				items.set(items.indexOf(item), newItem);
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	* Метод удаляет ячейку в массиве.
	* @param id уникальный индетификатор ячейки.
	* return успех операции.
	*/
	public boolean delete(String id) {
		boolean result = false;
		for(Item item : items) {
			if(item.getId().equals(id)) {
				result = true;
				items.remove(item);
				break;
			}
		}
		return result;	
	}
	/**
	* Метод  возвращает копию массива this.items без null элементов.
	* return полученный массив.
	*/
	public List<Item> findAll() {
		return items;
	}
	/**
	* Метод проверяет в цикле все элементы массива this.items, сравнивая name.
	* @param key значение с которым будем сравнивать.
	* return полученный массив.
	*/
	public List<Item> findByName(String key) {
		List<Item> fidingItems = new ArrayList<>();
		for(Item item : items) {
			if(item.getName().equals(key)) {
				fidingItems.add(item);
			}
		}
	    return fidingItems;
	}
	/**
	* Метод проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id и возвращает найденный Item.
	* @param id значение с которым будем сравнивать.
	* return найденный item.
	*/
	public Item findById(String id) {
		Item findItem = null;
		for (Item item : items) {
			if(item.getId().equals(id)) {
				findItem = item;
				break;
			}
		}
		return findItem;
	}
	
 }
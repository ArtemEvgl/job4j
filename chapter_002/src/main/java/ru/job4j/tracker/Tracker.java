package ru.job4j.tracker;

/*
  @version $Id$
 * @since 0.1
 */

import java.util.Random;
 
 public class Tracker {
	 /**
	 * Массив для хранения заявок.
	 */
	 private final Item[] items = new Item[100];
	 private static final Random RN = new Random();
	 
	 /**
	 * Указатель ячейки для новой заявки.
	 */
	private int position = 0;
	
	/**
	* Метод реализующий добавление заявки в хранилище
	* @param item новая заявка
	*/
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[this.position++] = item;
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
		for (int i = 0; i != position; i++) {
			if (items[i].getId().equals(id)) {
				items[i] = newItem;
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
		for (int i = 0; i != position; i++) {
			if (this.items[i].getId().equals(id)) {
				result = true;
				System.arraycopy(this.items, i + 1, this.items, i, position - i);
				--position;
				break;
			}
		}
		return result;	
	}
	/**
	* Метод  возвращает копию массива this.items без null элементов.
	* return полученный массив.
	*/
	public Item[] findAll() {
		Item[] items = new Item[position];
		for (int i = 0; i != position; i++) {
			items[i] = this.items[i];
		}
		return items;
	}
	/**
	* Метод проверяет в цикле все элементы массива this.items, сравнивая name.
	* @param key значение с которым будем сравнивать.
	* return полученный массив.
	*/
	public Item[] findByName(String key) {
		Item[] tempItems = new Item[this.position];
		int position = 0;
		for (int i = 0; i != this.position; i++) {
            if (this.items[i].getName().equals(key)) {
                tempItems[position++] = this.items[i];
            }
        }
		Item[] items = new Item[position];
		System.arraycopy(tempItems, 0, items, 0, position);
	    return items;
	}
	/**
	* Метод проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id и возвращает найденный Item.
	* @param id значение с которым будем сравнивать.
	* return найденный item.
	*/
	public Item findById(String id) {
		Item findItem = null;
		for (int i = 0; i != position; i++) {
			if (items[i].getId().equals(id)) {
				findItem = items[i];
				break;
			}
		}
		return findItem;
	}
	
 }
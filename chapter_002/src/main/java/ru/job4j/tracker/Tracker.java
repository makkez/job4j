package ru.job4j.tracker;

import java.util.*;

/**
 * Class describes tracker for items user job.
 * @author makkez
 * @version 1.0
 * @since 14.10.2018
 */
public class Tracker {
	
	/**
	 * Generator of random values.
	 */
	private static final Random RAND = new Random();
	
	/**
	 * Array for items.
	 */
	private final Item[] items = new Item[100];
	
	/**
	 * Cell-pointer for new item.
	 */
	private int position = 0;
	
	/**
	 * Method adds new item in tracker.
	 * @param item New item.
	 * @return Reference on added item.
	 */
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[this.position++] = item;
		return item;
	}
	
	/**
	 * Method generates unique ID for item.
	 * @return The unique ID.
	 */
	private String generateId() {
		return String.valueOf(System.currentTimeMillis() + RAND.nextInt());
	}
	
	/**
	 * Method deletes item from tracker by ID.
	 * @param id ID of item to be delete.
	 * @return The result of deleting 
	 * (true - if the deleting is successful, 
	 * false - if the deleting isn't successful).
	 */
	public boolean delete(String id) {
		boolean result = false;
		for (int index = 0; index < this.position; index++) {
			if (this.items[index].getId().equals(id)) {
				this.position--;
				System.arraycopy(this.items, index + 1, this.items, index, this.position - index);
				result = true;
				break;
			}
		}
		return result;
	}
	
	/**
	 * The findAll() method returns all items of tracker.
	 * @return All items of tracker by array.
	 */
	public Item[] findAll() {
		Item[] result = new Item[this.position];
		System.arraycopy(this.items, 0, result, 0, this.position);
		return result;
	}
	
	/**
	 * The findByName() method does search items in the tracker by specified name.
	 * @param key The specified name for search.
	 * @return All items when the item's name equals specified name.
	 */
	public Item[] findByName(String key) {
		Item[] result = new Item[this.position];
		int limiter = 0;
		for (int index = 0; index < this.position; index++) {
			if (this.items[index].getName().equalsIgnoreCase(key)) {
				result[limiter] = this.items[index];
				limiter++;
			}
		}
		return Arrays.copyOf(result, limiter);
	}
	
	/**
	 * The findById() method does search item in the tracker by specified id.
	 * @param id The specified id for search.
	 * @return Found item or 'null' if not found.
	 */
	public Item findById(String id) {
		Item result = null;
		for (int index = 0; index < this.position; index++) {
			if (this.items[index].getId().equals(id)) {
				result = this.items[index];
				break;
			}
		}
		return result;
	}
	
	/**
	 * The replace() method replaces the item in tracker.
	 * Searching the item in the tracker is by specified identification value.
	 * @param id The identification value.
	 * @param item The item for replace.
	 * @return The result of replacing 
	 * (true - if the replacing is successful, 
	 * false - if the replacing isn't successful).
	 */
	public boolean replace(String id, Item item) {
		boolean result = false;
		for (int index = 0; index < this.position; index++) {
			if (this.items[index].getId().equals(id)) {
				item.setId(id);
				this.items[index] = item;
				result = true;
				break;
			}
		}
		return result;
	}
}
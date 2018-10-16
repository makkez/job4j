package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The TrackerTest class contains methods for testing the Tracker class.
 * @author makkez
 * @version 1.0
 * @since 15.10.2018
 */
public class TrackerTest {
	
	/**
	 * The test for the replace() method.
	 */
	@Test
	public void whenReplaceNameThenReturnNewName() {
		Tracker tracker = new Tracker();
		Item previous = new Item("test1", "testDescription1", 123L);
		tracker.add(previous);
		Item next = new Item("test2", "testDescription1", 1234L);
		next.setId(previous.getId());
		tracker.replace(previous.getId(), next);
		assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
	}
	
	/**
	 * The test for the add() method.
	 */
	@Test
	public void whenAddNewItemThenReturnNewItemName() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription1", 123L);
		tracker.add(item);
		assertThat(tracker.findAll()[0].getName(), is("test1"));
	}
	
	/**
	 * The test for the add() method.
	 */
	@Test
	public void whenAddOneItemThenPositionIsOne() {
		Tracker tracker = new Tracker();
		Item item = new Item();
		tracker.add(item);
		assertThat(tracker.findAll().length, is(1));
	}
	
	/**
	 * The test for the delete() method.
	 */
	@Test
	public void whenAddThreeItemsAndDeleteOneItemThenNumberOfItemsIsTwo() {
		Tracker tracker = new Tracker();
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		tracker.add(item1);
		tracker.add(item2);
		tracker.add(item3);
		tracker.delete(item1.getId());
		assertThat(tracker.findAll().length, is(2));
	}
	
	/**
	 * The test for the findByName() method.
	 */
	@Test
	public void whenAddTwoNewItemWithSameNameAndAddOneNewItemWithAnotherNameThenNumberItemsInResultOfFindByNameIsTwo() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1");
		Item item2 = new Item("test1");
		Item item3 = new Item("test3");
		tracker.add(item1);
		tracker.add(item2);
		tracker.add(item3);
		Item[] result = tracker.findByName(item1.getName());
		assertThat(result.length, is(2));
	}
}
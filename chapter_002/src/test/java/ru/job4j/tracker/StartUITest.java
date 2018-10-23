package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The StartUITest class for the test task of StartUI class.
 * @author makkez
 * @version 1.0
 * @since 23.10.2018
 */
public class StartUITest {
	
	/**
	 * A method for the createItem() method testing.
	 */
	@Test
	public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
		Tracker tracker = new Tracker();
		Input input = new StubInput(new String[] {"0", "test name", "desc", "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findAll()[0].getName(), is("test name"));
	}
	
	/**
	 * A method for the editItem() method testing.
	 */
	@Test
	public void whenUpdateThenTrackerHasUpdateValue() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "dasc"));
		Input input = new StubInput(new String[] {"2", item.getId(), "test replace", "item is changed", "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
	}
	
	/**
	 * A method for the deleteItem() method testing.
	 */
	@Test
	public void whenDeleteThenTrackerHasNotItem() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "dasc"));
		Input input = new StubInput(new String[] {"3", item.getId(), "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.findAll().length, is(0));
	}
}
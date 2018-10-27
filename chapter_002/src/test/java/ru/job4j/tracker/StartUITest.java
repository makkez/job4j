package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
	 * The default printing to the console.
	 */
	private final PrintStream stdout = System.out;
	
	/**
	 * The buffer for a result.
	 */
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	
	/**
	 * The loadOutput() method sets the new output.
	 */
	@Before
	public void loadOutput() {
		System.setOut(new PrintStream(this.out));
	}
	
	/**
	 * The backOutput() method sets the default output.
	 */
	@After
	public void backOutput() {
		System.setOut(this.stdout);
	}
	
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
	
	/**
	 * The getMenu() method gets the menu of the StartUI class as a string.
	 * @return The menu of the StartUI class as a string.
	 */
	private String getMenu() {
		StringBuilder result = new StringBuilder()
				.append("MAIN MENU:")
				.append(System.lineSeparator())
				.append("0. Add new item")
				.append(System.lineSeparator())
				.append("1. Show all items")
				.append(System.lineSeparator())
				.append("2. Edit item")
				.append(System.lineSeparator())
				.append("3. Delete item")
				.append(System.lineSeparator())
				.append("4. Find item by ID")
				.append(System.lineSeparator())
				.append("5. Find items by name")
				.append(System.lineSeparator())
				.append("6. Exit program")
				.append(System.lineSeparator())
				.append("User's select: ");
		return result.toString();
	}
	
	/**
	 * A method for the showAllItems() method testing when the tracker has two items.
	 */
	@Test
	public void whenShowAllAndTrackerHasTwoItemsThenTwoItemsIsPrinted() {
		Tracker tracker = new Tracker();
		Item item1 = tracker.add(new Item("Test name item 1", "Description 1"));
		Item item2 = tracker.add(new Item("Test name item 2", "Description 2"));
		Input input = new StubInput(new String[] {"1", "6"});
		StringBuilder expected = new StringBuilder()
				.append(this.getMenu())
				.append("\n----- SHOWING ALL ITEMS FROM THE TRACKER -----")
				.append(System.lineSeparator())
				.append(String.format("ID: %10s", item1.getId()))
				.append(System.lineSeparator())
				.append(String.format("Name: %10s", item1.getName()))
				.append(System.lineSeparator())
				.append(String.format("Description: %10s", item1.getDescription()))
				.append(System.lineSeparator())
				.append(System.lineSeparator())
				.append(String.format("ID: %10s", item2.getId()))
				.append(System.lineSeparator())
				.append(String.format("Name: %10s", item2.getName()))
				.append(System.lineSeparator())
				.append(String.format("Description: %10s", item2.getDescription()))
				.append(System.lineSeparator())
				.append(System.lineSeparator())
				.append("----- ALL ITEMS ARE SHOWN -----\n")
				.append(System.lineSeparator())
				.append(this.getMenu());
		new StartUI(input, tracker).init();
		assertThat(new String(out.toByteArray()), is(expected.toString()));
	}
	
	/**
	 * A method for the showAllItems() method testing when the tracker hasn't items.
	 */
	@Test
	public void whenShowAllAndTrackerHasNotItemsThenItemsIsNotPrinted() {
		Tracker tracker = new Tracker();
		Input input = new StubInput(new String[] {"1", "6"});
		StringBuilder expected = new StringBuilder()
				.append(this.getMenu())
				.append("\n----- SHOWING ALL ITEMS FROM THE TRACKER -----")
				.append(System.lineSeparator())
				.append("The tracker is empty!\n")
				.append(System.lineSeparator())
				.append(this.getMenu());
		new StartUI(input, tracker).init();
		assertThat(new String(out.toByteArray()), is(expected.toString()));
	}
	
	/**
	 * A method for the showItemById() method testing 
	 * when the tracker hasn't item with the specified ID.
	 */
	@Test
	public void whenShowItemByIdAndTrackerHasNotItemBySpecifiedIdThenItemIsNotPrinted() {
		Tracker tracker = new Tracker();
		tracker.add(new Item("Test name item 1", "Description 1"));
		tracker.add(new Item("Test name item 2", "Description 2"));
		Input input = new StubInput(new String[] {"4", "111", "6"});
		StringBuilder expected = new StringBuilder()
				.append(this.getMenu())
				.append("\n----- FINDING THE ITEM BY ID -----")
				.append(System.lineSeparator())
				.append("The item with specified id absents in the tracker!\n")
				.append(System.lineSeparator())
				.append(this.getMenu());
		new StartUI(input, tracker).init();
		assertThat(new String(out.toByteArray()), is(expected.toString()));
	}
	
	/**
	 * A method for the showItemById() method testing 
	 * when the tracker has item with the specified ID.
	 */
	@Test
	public void whenShowItemByIdAndTrackerHasItemBySpecifiedIdThenItemIsPrinted() {
		Tracker tracker = new Tracker();
		tracker.add(new Item("Test name item 1", "Description 1"));
		Item item = tracker.add(new Item("Test name item 2", "Description 2"));
		tracker.add(new Item("Test name item 3", "Description 3"));
		Input input = new StubInput(new String[] {"4", item.getId(), "6"});
		StringBuilder expected = new StringBuilder()
				.append(this.getMenu())
				.append("\n----- FINDING THE ITEM BY ID -----")
				.append(System.lineSeparator())
				.append(String.format("ID: %10s", item.getId()))
				.append(System.lineSeparator())
				.append(String.format("Name: %10s", item.getName()))
				.append(System.lineSeparator())
				.append(String.format("Description: %10s", item.getDescription()))
				.append(System.lineSeparator())
				.append(System.lineSeparator())
				.append("----- THE FOUND ITEM IS SHOWN -----\n")
				.append(System.lineSeparator())
				.append(this.getMenu());
		new StartUI(input, tracker).init();
		assertThat(new String(out.toByteArray()), is(expected.toString()));
	}
	
	/**
	 * A method for the showItemsByName() method testing 
	 * when the tracker hasn't items with the specified name.
	 */
	@Test
	public void whenShowItemsByNameAndTrackerHasNotItemsBySpecifiedNameThenItemsAreNotPrinted() {
		Tracker tracker = new Tracker();
		tracker.add(new Item("Test name item 1", "Description 1"));
		tracker.add(new Item("Test name item 2", "Description 2"));
		tracker.add(new Item("Test name item 3", "Description 3"));
		Input input = new StubInput(new String[] {"5", "Item with another name", "6"});
		StringBuilder expected = new StringBuilder()
				.append(this.getMenu())
				.append("\n----- FINDING ITEMS BY NAME -----")
				.append(System.lineSeparator())
				.append("Items with specified name absent in the tracker!\n")
				.append(System.lineSeparator())
				.append(this.getMenu());
		new StartUI(input, tracker).init();
		assertThat(new String(out.toByteArray()), is(expected.toString()));
	}
	
	/**
	 * A method for the showItemsByName() method testing 
	 * when the tracker has items with the specified name.
	 */
	@Test
	public void whenShowItemsByNameAndTrackerHasItemsBySpecifiedNameThenItemsArePrinted() {
		Tracker tracker = new Tracker();
		Item item1 = tracker.add(new Item("Test required name item", "Description 2"));
		Item item2 = tracker.add(new Item("Test required name item", "Description 4"));
		tracker.add(new Item("Test name item 1", "Description 1"));
		tracker.add(new Item("Test name item 3", "Description 3"));
		Input input = new StubInput(new String[] {"5", item1.getName(), "6"});
		StringBuilder expected = new StringBuilder()
				.append(this.getMenu())
				.append("\n----- FINDING ITEMS BY NAME -----")
				.append(System.lineSeparator())
				.append(String.format("ID: %10s", item1.getId()))
				.append(System.lineSeparator())
				.append(String.format("Name: %10s", item1.getName()))
				.append(System.lineSeparator())
				.append(String.format("Description: %10s", item1.getDescription()))
				.append(System.lineSeparator())
				.append(System.lineSeparator())
				.append(String.format("ID: %10s", item2.getId()))
				.append(System.lineSeparator())
				.append(String.format("Name: %10s", item2.getName()))
				.append(System.lineSeparator())
				.append(String.format("Description: %10s", item2.getDescription()))
				.append(System.lineSeparator())
				.append(System.lineSeparator())
				.append("----- FOUND ITEMS ARE SHOWN -----\n")
				.append(System.lineSeparator())
				.append(this.getMenu());
		new StartUI(input, tracker).init();
		assertThat(new String(out.toByteArray()), is(expected.toString()));
	}
}
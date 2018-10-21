package ru.job4j.tracker;

/**
 * The StartUI class is a enter-point to the programm.
 * @author makkez
 * @version 1.0
 * @since 19.10.2018
 */
public class StartUI {
	
	/**
	 * A constant of menu for adding the new item.
	 */
	private static final String ADD = "0";
	
	/**
	 * A constant of menu for showing all items.
	 */
	private static final String SHOW = "1";
	
	/**
	 * A constant of menu for editing the item.
	 */
	private static final String EDIT = "2";
	
	/**
	 * A constant of menu for deleting the item.
	 */
	private static final String DELETE = "3";
	
	/**
	 * A constant of menu for finding the item by ID.
	 */
	private static final String FIND_ID = "4";
	
	/**
	 * A constant of menu for finding items by name.
	 */
	private static final String FIND_NAME = "5";
	
	/**
	 * A constant of menu for exiting from the program.
	 */
	private static final String EXIT = "6";
	
	/**
	 * An object of the Input type for entering data by user.
	 */
	private final Input input;
	
	/**
	 * The tracker.
	 */
	private final Tracker tracker;
	
	/**
	 * A constructor with two parameters for initialization to field of this class.
	 * @param input Entering data.
	 * @param tracker The tracker.
	 */
	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	
	/**
	 * The start of programm.
	 * @param args Arguments.
	 */
	public static void main(String[] args) {
		new StartUI(new ConsoleInput(), new Tracker()).init();
	}
	
	/**
	 * The showMenu() method does printing menu for user.
	 */
	private void showMenu() {
		System.out.println("MAIN MENU:");
		System.out.println("0. Add new item");
		System.out.println("1. Show all items");
		System.out.println("2. Edit item");
		System.out.println("3. Delete item");
		System.out.println("4. Find item by ID");
		System.out.println("5. Find items by name");
		System.out.println("6. Exit program");
		System.out.print("User's select: ");
	}
	
	/**
	 * The init() method executes the main cycle of program.
	 */
	private void init() {
		boolean exit = false;
		while (!exit) {
			this.showMenu();
			String answer = this.input.ask("Select item of menu: ");
			switch (answer) {
				case ADD:
					this.createItem();
					break;
				case SHOW:
					this.showAllItems();
					break;
				case EDIT:
					this.editItem();
					break;
				case DELETE:
					this.deleteItem();
					break;
				case FIND_ID:
					this.showItemById();
					break;
				case FIND_NAME:
					this.showItemsByName();
					break;
				case EXIT:
					exit = true;
					break;
				default:
					break;
			}
		}
	}
	
	/**
	 * The createItem() method creates the new item and adds to tracker for her.
	 */
	private void createItem() {
		System.out.println("\n----- ADDING THE NEW ITEM -----");
		String name = this.input.ask("Enter the name of item: ");
		String description = this.input.ask("Enter the description of item: ");
		Item item = new Item(name, description);
		this.tracker.add(item);
		System.out.println("New item with ID: " + item.getId() + " is added!");
		System.out.println("----- ADDING IS FINISHED -----\n");
	}
	
	/**
	 * The showAllItems() method shows all items form the tracker.
	 */
	private void showAllItems() {
		System.out.println("\n----- SHOWING ALL ITEMS FROM THE TRACKER -----");
		Item[] items = this.tracker.findAll();
		if (items.length == 0) {
			System.out.println("The tracker is empty!\n");
		} else {
			for (Item item : items) {
				System.out.println(item);
			}
			System.out.println("----- ALL ITEMS ARE SHOWN -----\n");
		}
	}
	
	/**
	 * The editItem() method edits item. 
	 */
	private void editItem() {
		System.out.println("\n----- EDITING THE ITEM -----");
		String id = this.input.ask("Enter the ID of item who needs to be found: ");
		String name = this.input.ask("Enter the name of item: ");
		String description = this.input.ask("Enter the description of item: ");
		Item item = new Item(name, description);
		this.tracker.replace(id, item);
		System.out.println("----- EDITING IS FINISHED -----\n");
	}
	
	/**
	 * The deleteItem() method deletes item.
	 */
	private void deleteItem() {
		System.out.println("\n----- DELETING THE ITEM -----");
		String id = this.input.ask("Enter the ID of item who needs to be deleted: ");
		this.tracker.delete(id);
		System.out.println("----- DELETING IS FINISHED -----\n");
	}
	
	/**
	 * The showItemById() method shows the item found by ID.
	 */
	private void showItemById() {
		System.out.println("\n----- FINDING THE ITEM BY ID -----");
		String id = this.input.ask("Enter the ID of item who needs to be found: ");
		Item result = this.tracker.findById(id);
		if (result == null) {
			System.out.println("The item with specified id absents in the tracker!\n");
		} else {
			System.out.println(result);
			System.out.println("----- THE FOUND ITEM IS SHOWN -----\n");
		}
	}
	
	/**
	 * The showItemsByName() method shows items found by name.
	 */
	private void showItemsByName() {
		System.out.println("\n----- FINDING ITEMS BY NAME -----");
		String name = this.input.ask("Enter the name of items who needs to be found: ");
		Item[] result = this.tracker.findByName(name);
		if (result.length == 0) {
			System.out.println("Items with specified name absent in the tracker!\n");
		} else {
			for (Item item : result) {
				System.out.println(item);
			}
			System.out.println("----- FOUND ITEMS ARE SHOWN -----\n");
		}
	}
}
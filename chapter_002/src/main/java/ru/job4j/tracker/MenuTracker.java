package ru.job4j.tracker;

import java.util.List;
import java.util.ArrayList;

/**
 * The EditItem class is outer class.
 * The EditItem class implements the UserAction interface 
 * and describes the edit action.
 */
class EditItem extends BaseAction {
	
	/**
	 * The constructor with two parameters.
	 * @param key The key of the edit item action.
	 * @param name The name of the edit item action.
	 */
	public EditItem(int key, String name) {
		super(key, name);
	}
	
	/**
	 * The execute() method executes edit-option.
	 * @param input The object of Input-type.
	 * @param tracker The object of Tracker-type.
	 */
	public void execute(Input input, Tracker tracker) {
		System.out.println("\n----- EDITING THE ITEM -----");
		String id = input.ask("Enter the ID of item who needs to be found: ");
		String name = input.ask("Enter the name of item: ");
		String description = input.ask("Enter the description of item: ");
		Item item = new Item(name, description);
		boolean result = tracker.replace(id, item);
		if (result) {
			System.out.println("The editing is successful!");
		} else {
			System.out.println("The editing isn't successful!");
		}
		System.out.println("----- EDITING IS FINISHED -----\n");
	}
}

/**
 * The FindByNameItems class is outer class.
 * The FindByNameItems class implements the UserAction interface 
 * and describes the show items found by name action.
 */
class FindByNameItems extends BaseAction {
	
	/**
	 * The constructor with two parameters.
	 * @param key The key of the find items by name action.
	 * @param name The name of the find items by name action.
	 */
	public FindByNameItems(int key, String name) {
		super(key, name);
	}
	
	/**
	 * The execute() method executes find items by name option.
	 * @param input The object of Input-type.
	 * @param tracker The object of Tracker-type.
	 */
	public void execute(Input input, Tracker tracker) {
		System.out.println("\n----- FINDING ITEMS BY NAME -----");
		String name = input.ask("Enter the name of items who needs to be found: ");
		Item[] result = tracker.findByName(name);
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

/**
 * The MenuTracker class describes the menu of programm.
 * @author makkez
 * @version 1.0 07.11.2018
 */
public class MenuTracker {
	
	/**
	 * A constant of menu for adding the new item.
	 */
	public static final int ADD = 0;
	
	/**
	 * A constant of menu for showing all items.
	 */
	public static final int SHOW = 1;
	
	/**
	 * A constant of menu for editing the item.
	 */
	public static final int EDIT = 2;
	
	/**
	 * A constant of menu for deleting the item.
	 */
	public static final int DELETE = 3;
	
	/**
	 * A constant of menu for finding the item by ID.
	 */
	public static final int FIND_ID = 4;
	
	/**
	 * A constant of menu for finding items by name.
	 */
	public static final int FIND_NAME = 5;
		
	/**
	 * The reference of IO-object.
	 */
	private Input input;
	
	/**
	 * The tracker.
	 */
	private Tracker tracker;
	
	/**
	 * The list of actions.
	 */
	private List<UserAction> actions = new ArrayList<>(6);
	
	/**
	 * The constructor with two parameters.
	 * @param input The IO-object.
	 * @param tracker The tracker.
	 */
	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	
	/**
	 * A method for getting number of actions.
	 * @return The number of actions.
	 */
	public int getActionLength() {
		return this.actions.size();
	}
	
	/**
	 * This method does filling list of actions.
	 */
	public void fillActions() {
		this.actions.add(this.new AddItem(ADD, "Add new item"));
		this.actions.add(new MenuTracker.ShowItems(SHOW, "Show all items"));
		this.actions.add(new EditItem(EDIT, "Edit item"));
		this.actions.add(this.new DeleteItem(DELETE, "Delete item"));
		this.actions.add(new MenuTracker.FindByIdItem(FIND_ID, "Find item by ID"));
		this.actions.add(new FindByNameItems(FIND_NAME, "Find items by name"));
	}
	
	/**
	 * The fillRanges() method provides items of the menu as array.
	 * @return Items of the menu.
	 */
	public int[] fillRanges() {
		this.fillActions();
		int[] result = new int[this.actions.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = i;
		}
		return result;
	}
	
	/**
	 * The select() method does selected action by specified key.
	 * @param The specified key.
	 */
	public void select(int key) {
		this.actions.get(key).execute(this.input, this.tracker);
	}
	
	/**
	 * The show() method does showing the menu.
	 */
	public void show() {
		for (UserAction action : this.actions) {
			if (action != null) {
				System.out.println(action.info());
			}
		}
	}
	
	/**
	 * The AddItem class is inner class.
	 * The AddItem class implements the UserAction interface and describes the add action.
	 */
	private class AddItem extends BaseAction {
		
		/**
		 * The constructor with two parameters.
		 * @param key The key of the add-action.
		 * @param name The name of the add-action.
		 */
		public AddItem(int key, String name) {
			super(key, name);
		}
		
		/**
		 * The execute() method executes add-option.
		 * @param input The object of Input-type.
		 * @param tracker The object of Tracker-type.
		 */
		public void execute(Input input, Tracker tracker) {
			System.out.println("\n----- ADDING THE NEW ITEM -----");
			String name = input.ask("Enter the name of item: ");
			String description = input.ask("Enter the description of item: ");
			Item item = new Item(name, description);
			tracker.add(item);
			System.out.println("New item with ID: " + item.getId() + " is added!");
			System.out.println("----- ADDING IS FINISHED -----\n");
		}
	}
	
	/**
	 * The DeleteItem class is inner class.
	 * The DeleteItem class implements the UserAction interface 
	 * and describes the delete action.
	 */
	private class DeleteItem extends BaseAction {
		
		/**
		 * The constructor with two parameters.
		 * @param key The key of the delete-action.
		 * @param name The name of the delete-action.
		 */
		public DeleteItem(int key, String name) {
			super(key, name);
		}
		
		/**
		 * The execute() method executes delete-option.
		 * @param input The object of Input-type.
		 * @param tracker The object of Tracker-type.
		 */
		public void execute(Input input, Tracker tracker) {
			System.out.println("\n----- DELETING THE ITEM -----");
			String id = input.ask("Enter the ID of item who needs to be deleted: ");
			boolean result = tracker.delete(id);
			if (result) {
				System.out.println("The deleting is successful!");
			} else {
				System.out.println("The deleting isn't successful!");
			}
			System.out.println("----- DELETING IS FINISHED -----\n");
		}
	}
	
	/**
	 * The ShowItems class is static inner class.
	 * The ShowItems class implements the UserAction interface 
	 * and describes the show all items action.
	 */
	private static class ShowItems extends BaseAction {
		
		/**
		 * The constructor with two parameters.
		 * @param key The key of the show items action.
		 * @param name The name of the show items action.
		 */
		public ShowItems(int key, String name) {
			super(key, name);
		}
		
		/**
		 * The execute() method executes show all items option.
		 * @param input The object of Input-type.
		 * @param tracker The object of Tracker-type.
		 */
		public void execute(Input input, Tracker tracker) {
			System.out.println("\n----- SHOWING ALL ITEMS FROM THE TRACKER -----");
			Item[] items = tracker.findAll();
			if (items.length == 0) {
				System.out.println("The tracker is empty!\n");
			} else {
				for (Item item : items) {
					System.out.println(item);
				}
				System.out.println("----- ALL ITEMS ARE SHOWN -----\n");
			}
		}
	}
	
	/**
	 * The FindByIdItem class is static inner class.
	 * The FindByIdItem class implements the UserAction interface 
	 * and describes the show item found by id action.
	 */
	private static class FindByIdItem extends BaseAction {
		
		/**
		 * The constructor with two parameters.
		 * @param key The key of the find item by id action.
		 * @param name The name of the find item by id action.
		 */
		public FindByIdItem(int key, String name) {
			super(key, name);
		}
		
		/**
		 * The execute() method executes find item by id option.
		 * @param input The object of Input-type.
		 * @param tracker The object of Tracker-type.
		 */
		public void execute(Input input, Tracker tracker) {
			System.out.println("\n----- FINDING THE ITEM BY ID -----");
			String id = input.ask("Enter the ID of item who needs to be found: ");
			Item result = tracker.findById(id);
			if (result == null) {
				System.out.println("The item with specified id absents in the tracker!\n");
			} else {
				System.out.println(result);
				System.out.println("----- THE FOUND ITEM IS SHOWN -----\n");
			}
		}
	}
}
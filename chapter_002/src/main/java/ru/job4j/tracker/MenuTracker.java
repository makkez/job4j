package ru.job4j.tracker;

import java.util.List;
import java.util.ArrayList;

/**
 * The EditItem class is outer class.
 * The EditItem class implements the UserAction interface 
 * and describes the edit action.
 */
class EditItem implements UserAction {
	
	/**
	 * The key() method for returning the key of the edit-option.
	 * @return The key of edit-option.
	 */
	public int key() {
		return MenuTracker.EDIT;
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
	
	/**
	 * The method info() for returning of the information about the item of menu.
	 * @return The string of menu.
	 */
	public String info() {
		return String.format("%s. %s", this.key(), "Edit item");
	}
}

/**
 * The FindByNameItems class is outer class.
 * The FindByNameItems class implements the UserAction interface 
 * and describes the show items found by name action.
 */
class FindByNameItems implements UserAction {
	
	/**
	 * The key() method for returning the key of the find items by name option.
	 * @return The key of the find items by name option.
	 */
	public int key() {
		return MenuTracker.FIND_NAME;
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
	
	/**
	 * The method info() for returning of the information about the item of menu.
	 * @return The string of menu.
	 */
	public String info() {
		return String.format("%s. %s", this.key(), "Find items by name");
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
		this.actions.add(this.new AddItem());
		this.actions.add(new MenuTracker.ShowItems());
		this.actions.add(new EditItem());
		this.actions.add(this.new DeleteItem());
		this.actions.add(new MenuTracker.FindByIdItem());
		this.actions.add(new FindByNameItems());
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
	private class AddItem implements UserAction {
		
		/**
		 * The key() method for returning the key of the add-option.
		 * @return The key of add-option.
		 */
		public int key() {
			return MenuTracker.ADD;
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
		
		/**
		 * The method info() for returning of the information about the item of menu.
		 * @return The string of menu.
		 */
		public String info() {
			return String.format("%s. %s", this.key(), "Add new item");
		}
	}
	
	/**
	 * The DeleteItem class is inner class.
	 * The DeleteItem class implements the UserAction interface 
	 * and describes the delete action.
	 */
	private class DeleteItem implements UserAction {
		
		/**
		 * The key() method for returning the key of the delete-option.
		 * @return The key of delete-option.
		 */
		public int key() {
			return MenuTracker.DELETE;
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
		
		/**
		 * The method info() for returning of the information about the item of menu.
		 * @return The string of menu.
		 */
		public String info() {
			return String.format("%s. %s", this.key(), "Delete item");
		}
	}
	
	/**
	 * The ShowItems class is static inner class.
	 * The ShowItems class implements the UserAction interface 
	 * and describes the show all items action.
	 */
	private static class ShowItems implements UserAction {
		
		/**
		 * The key() method for returning the key of the show all items option.
		 * @return The key of the show all items option.
		 */
		public int key() {
			return MenuTracker.SHOW;
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
		
		/**
		 * The method info() for returning of the information about the item of menu.
		 * @return The string of menu.
		 */
		public String info() {
			return String.format("%s. %s", this.key(), "Show all items");
		}
	}
	
	/**
	 * The FindByIdItem class is static inner class.
	 * The FindByIdItem class implements the UserAction interface 
	 * and describes the show item found by id action.
	 */
	private static class FindByIdItem implements UserAction {
		
		/**
		 * The key() method for returning the key of the find item by id option.
		 * @return The key of the find item by id option.
		 */
		public int key() {
			return MenuTracker.FIND_ID;
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
		
		/**
		 * The method info() for returning of the information about the item of menu.
		 * @return The string of menu.
		 */
		public String info() {
			return String.format("%s. %s", this.key(), "Find item by ID");
		}
	}
}
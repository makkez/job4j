package ru.job4j.tracker;

/**
 * In the UserAction interface the methods of events are declared.
 * @author makkez
 * @version 1.0_06.11.2018
 */
public interface UserAction {
	
	/**
	 * The key() method for returning the key of option.
	 * @return The key of option.
	 */
	int key();
	
	/**
	 * The execute() method is the main method for action.
	 * @param input The object of Input-type.
	 * @param tracker The object of Tracker-type.
	 */
	void execute(Input input, Tracker tracker);
	
	/**
	 * The method info() for returning of the information about the item of menu.
	 * @return The string of menu.
	 */
	String info();
}
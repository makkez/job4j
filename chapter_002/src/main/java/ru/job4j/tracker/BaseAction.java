package ru.job4j.tracker;

/**
 * The BaseAction class is the abstract class.
 * @author makkez
 * @version 1.0 21.11.2018
 */
public abstract class BaseAction implements UserAction {
	
	/**
	 * The key of action.
	 */
	private final int key;
	
	/**
	 * The name of action.
	 */
	private final String name;
	
	/**
	 * The constructor with two parameters.
	 * @param key The key of action.
	 * @param name The name of action.
	 */
	protected BaseAction(final int key, final String name) {
		this.key = key;
		this.name = name;
	}
	
	/**
	 * The key() method for returning the key of action.
	 * It's overrided method from the UserAction interface.
	 * @return The key of add-option.
	 */
	@Override
	public int key() {
		return this.key;
	}
	
	/**
	 * The info() method for returning the information about the action.
	 * It's overrided method from the UserAction interface.
	 * @return The key of add-option.
	 */
	@Override
	public String info() {
		return String.format("%s. %s", this.key, this.name);
	}
	
	/**
	 * The execute() method is the main method for action.
	 * It's overrided method from the UserAction interface.
	 * @param input The object of Input-type.
	 * @param tracker The object of Tracker-type.
	 */
	@Override
	public abstract void execute(Input input, Tracker tracker);
}
package ru.job4j.tracker;

/**
 * The MenuOutException class describes exception generated
 * when user's entered incorrectly for menu items.
 * @author makkez
 * @version 1.0 11.11.2018
 */
public class MenuOutException extends RuntimeException {
	
	/**
	 * The constructor with the message.
	 * @param message The message for describing exception. 
	 */
	public MenuOutException(String message) {
		super(message);
	}
}
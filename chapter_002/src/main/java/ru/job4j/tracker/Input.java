package ru.job4j.tracker;

/**
 * The Input interface contains methods for appeal to user.
 * @author makkez
 * @version 1.0
 * @since 20.10.2018
 */
public interface Input {
	
	/**
	 * The ask() method uses for appeal to user.
	 * @param question The question to user.
	 * @return The response from user.
	 */
	String ask(String question);
}
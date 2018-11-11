package ru.job4j.tracker;

import java.util.Scanner;

/**
 * The ConsoleInput class is needed for work with the console.
 * This class implements the Input interface from the tracker package.
 * @author makkez
 * @version 1.0
 * @since 21.10.2018
 */
public class ConsoleInput implements Input {
	
	/**
	 * The scanner object for receiving data from the user.
	 */
	private Scanner scanner = new Scanner(System.in);
	
	/**
	 * The ask() method prints the question for the user and receives the responce from the user.
	 * @param question The question for the user.
	 * @return The responce from the user.
	 */
	@Override
	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}
	
	/**
	 * The ask() method prints the question for the user 
	 * and receives the responce from the user.
	 * The responce of user compares with values from the range-parameter.
	 * If user's responce isn't equal values from the range-parameter 
	 * then generates MenuOutException.
	 * @param question The question for the user.
	 * @param range The range of value.
	 * @return The responce from the user.
	 */
	@Override
	public int ask(String question, int[] range) {
		int key = Integer.valueOf(this.ask(question));
		boolean exist = false;
		for (int value : range) {
			if (value == key) {
				exist = true;
				break;
			}
		}
		if (exist) {
			return key;
		} else {
			throw new MenuOutException("Out of menu range.");
		}
	}
}
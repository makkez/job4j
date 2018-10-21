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
	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}
}
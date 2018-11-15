package ru.job4j.tracker;

/**
 * The ValidateInput class is needed for work with the console.
 * This class extends the ConsoleInput class from the tracker package.
 * @author makkez
 * @version 1.0 11.11.2018
 */
public class ValidateInput implements Input {
	
	/**
	 * The source of data.
	 */
	private final Input input;
	
	/**
	 * The constructor with a parameter.
	 * @input The source of data.
	 */
	public ValidateInput(final Input input) {
		this.input = input;
	}
	
	/**
	 * The ask() method prints the question for the user 
	 * and receives the responce from the user.
	 * @param question The question for the user.
	 * @return The responce from the user.
	 */
	@Override
	public String ask(String question) {
		return this.input.ask(question);
	}
	
	/**
	 * The ask() method provides exception handling for user's input.
	 * @param question The question for the user.
	 * @param range The range of value.
	 * @return The responce from the user.
	 */
	public int ask(String question, int[] range) {
		boolean invalid = true;
		int value = -1;
		do {
			try {
				value = this.input.ask(question, range);
				invalid = false;
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter validate data again.");
			} catch (MenuOutException moe) {
				System.out.println("Please select key from menu.");
			}
		} while (invalid);
		return value;
	}
}
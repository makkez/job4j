package ru.job4j.tracker;

/**
 * The ValidateInput class is needed for work with the console.
 * This class extends the ConsoleInput class from the tracker package.
 * @author makkez
 * @version 1.0 11.11.2018
 */
public class ValidateInput extends ConsoleInput {
	
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
				value = super.ask(question, range);
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
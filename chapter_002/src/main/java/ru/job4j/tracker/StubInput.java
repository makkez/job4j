package ru.job4j.tracker;

/**
 * The StubInput class for the emulation work of user.
 * @author makkez
 * @version 1.0
 * @since 23.10.18
 */
public class StubInput implements Input {
	
	/**
	 * The list of user's answers.
	 */
	private final String[] answers;
	
	/**
	 * The position in the list of answers.
	 */
	private int position = 0;
	
	/**
	 * The constructor with the array of answers.
	 * @param answers The array of answers.
	 */
	public StubInput(final String[] answers) {
		this.answers = answers;
	}
	
	/**
	 * The ask() method emulations work of user.
	 * This method form the Input interface.
	 * @param question This parameter is not used in the ask() method of the StubInput class.
	 * @return The next answer.
	 */
	@Override
	public String ask(String question) {
		return this.answers[this.position++];
	}
	
	/**
	 * The ask() method emulations work of user.
	 * This method form the Input interface.
	 * @param question The question to user.
	 * @param range The range of value.
	 * @return The response from user.
	 */
	@Override
	public int ask(String question, int[] range) {
		return -1;
	}
}
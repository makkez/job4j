package ru.job4j.tracker;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * The ValidateInputTest class for testing the ValidateInput class.
 * @author makkez
 * @version 1.0 14.11.2018
 */
public class ValidateInputTest {
	
	/**
	 * The buffer for a result.
	 */
	private final ByteArrayOutputStream memory = new ByteArrayOutputStream();
	
	/**
	 * The default printing to the console.
	 */
	private final PrintStream out = System.out;
	
	/**
	 * The loadMemory() method sets the new output.
	 */
	@Before
	public void loadMemory() {
		System.setOut(new PrintStream(this.memory));
	}
	
	/**
	 * The loadSystem() method sets the default output.
	 */
	@After
	public void loadSystem() {
		System.setOut(this.out);
	}
	
	/**
	 * The whenInvalidInput() method for the ask(String, int[]) method
	 * when NumberFormatException.
	 */
	@Test
	public void whenInvalidInput() {
		ValidateInput input = new ValidateInput(new StubInput(new String[] {"invalid", "1"}));
		input.ask("Enter", new int[] {1});
		assertThat(this.memory.toString(), is("Please enter validate data again." + System.lineSeparator()));
	}
	
	/**
	 * The whenInvalidInput() method for the ask(String, int[]) method
	 * when MenuOutException.
	 */
	@Test
	public void whenMenuOutInput() {
		ValidateInput input = new ValidateInput(new StubInput(new String[] {"7", "1"}));
		input.ask("Enter", new int[] {1});
		assertThat(this.memory.toString(), is("Please select key from menu." + System.lineSeparator()));
	}
}
package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Check.
 *
 * @author makkez
 * @version 1.0
 * @since 13.09.2018
 */
public class CheckTest {
	
	/**
	 * Test for mono() when array has all elements by true.
	 */
	@Test
	public void whenDataMonoByTrueThenTrue() {
		Check check = new Check();
		boolean[] input = {true, true, true};
		boolean result = check.mono(input);
		assertThat(result, is(true));
	}
	
	/**
	 * Test for mono() when array has different elements.
	 */
	@Test
	public void whenDataNotMonoByTrueThenFalse() {
		Check check = new Check();
		boolean[] input = {true, false, true};
		boolean result = check.mono(input);
		assertThat(result, is(false));
	}
}
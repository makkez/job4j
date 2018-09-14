package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for ArrayChar.
 * 
 * @author makkez
 * @version 1.0
 * @since 14.09.2018
 */
public class ArrayCharTest {
	
	/**
	 * Test for startWith() when word has prefix.
	 */
	@Test
	public void whenStartWithPrefixThenTrue() {
		ArrayChar word = new ArrayChar("Hello");
		boolean result = word.startWith("He");
		assertThat(result, is(true));
	}
	
	/**
	 * Test for startWith() when word hasn`t prefix.
	 */
	@Test
	public void whenNotStartWithPrefixThenFalse() {
		ArrayChar word = new ArrayChar("Hello");
		boolean result = word.startWith("Hi");
		assertThat(result, is(false));
	}
	
	/**
	 * Test for startWith() when word less prefix.
	 */
	@Test
	public void whenNotStartWithPrefix2ThenFalse() {
		ArrayChar word = new ArrayChar("Hello");
		boolean result = word.startWith("Hello World");
		assertThat(result, is(false));
	}
}
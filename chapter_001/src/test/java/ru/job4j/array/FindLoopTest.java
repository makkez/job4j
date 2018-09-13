package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for FindLoop.
 * 
 * @author makkez
 * @version 1.0
 * @since 13.09.2018
 */
public class FindLoopTest {
	
	/**
	 * Test for indexOf() when array has element 5 by index 0.
	 */
	@Test
	public void whenArrayHasLengh5Then0() {
		FindLoop find = new FindLoop();
		int[] input = {5, 10, 3};
		int value = 5;
		int result = find.indexOf(input, value);
		int expect = 0;
		assertThat(result, is(expect));
	}
	
	/**
	 * Test for indexOf() when array hasn`t element 6.
	 */
	@Test
	public void whenArrayHasNotLengh6ThenMinus1() {
		FindLoop find = new FindLoop();
		int[] input = {5, 10, 3};
		int value = 6;
		int result = find.indexOf(input, value);
		int expect = -1;
		assertThat(result, is(expect));
	}
}
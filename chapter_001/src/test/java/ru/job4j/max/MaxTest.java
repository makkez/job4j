package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Max.
 * 
 * @version 1.0
 * @since 07.09.2018
 * @author makkez
 */
public class MaxTest {
	
	/**
	 * Test for max() with two parameters.
	 */
	@Test
	public void whenFirstLessSecondThenSecond() {
		Max maxim = new Max();
		int result = maxim.max(1, 2);
		assertThat(result, is(2));
	}
	
	/**
	 * Test for max() with three parameters.
	 */
	@Test
	public void whenFirstAndSecondLessThirdThenThird() {
		Max maxim = new Max();
		int result = maxim.max(1, 2, 3);
		assertThat(result, is(3));
	}
}
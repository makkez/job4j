package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Factorial.
 * 
 * @version 1.0
 * @since 09.09.2018
 * @author makkez
 */
public class FactorialTest {
	
	/**
	 * Test for calc() when number > 0.
	 */
	@Test
	public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(5);
		assertThat(result, is(120));
	}
	
	/**
	 * Test for calc() when number = 0.
	 */
	@Test
	public void whenCalculateFactorialForZeroThenOne() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(0);
		assertThat(result, is(1));
	}
}
package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Turn.
 *
 * @author makkez
 * @version 1.0
 * @since 13.09.2018
 */
public class TurnTest {
	
	/**
	 * Test for back() when array with even amount of elements.
	 */
	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turner = new Turn();
		int[] input = {4, 1, 6, 2};
		int[] result = turner.back(input);
		int[] expect = {2, 6, 1, 4};
		assertThat(result, is(expect));
	}
	
	/**
	 * Test for back() when array with odd amount of elements.
	 */
	@Test
	public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		Turn turner = new Turn();
		int[] input = {1, 2, 3, 4, 5};
		int[] result = turner.back(input);
		int[] expect = {5, 4, 3, 2, 1};
		assertThat(result, is(expect));
	}
}
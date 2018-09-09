package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Counter.
 * 
 * @version 1.0
 * @since 09.09.2018
 * @author makkez
 */
public class CounterTest {
	
	/**
	 * Test for add().
	 */
	@Test
	public void whenSumEvenNumbersFromOneToTenThenThirty() {
		Counter counter = new Counter();
		int result = counter.add(1, 10);
		assertThat(result, is(30));
	}
}
package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for BubbleSort.
 *
 * @author makkez
 * @version 1.0
 * @since 14.09.2018
 */
public class BubbleSortTest {
	
	/**
	 * Test for sort().
	 */
	@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort sorter = new BubbleSort();
		int[] array = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] result = sorter.sort(array);
		int[] expect = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(result, is(expect));
	}
}
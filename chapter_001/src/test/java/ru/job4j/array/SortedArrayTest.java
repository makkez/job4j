package ru.job4j.array;

import org.junit.Test;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Sorted Array.
 * @author makkez
 * @version 1.0
 * @since 18.09.2018
 */
public class SortedArrayTest {
	
	/**
	 * Test for uniteArray().
	 */
	@Test
	public void whenTwoSortedArrayThenNewSortedArray() {
		int[] firstArray = {1, 2, 3, 4};
		int[] secondArray = {3, 5, 8, 9, 10, 12};
		SortedArray sortedArray = new SortedArray();
		int[] result = sortedArray.uniteArray(firstArray, secondArray);
		System.out.println(Arrays.toString(result));
		int[] expect = {1, 2, 3, 3, 4, 5, 8, 9, 10, 12};
		assertThat(result, is(expect));
	}
}
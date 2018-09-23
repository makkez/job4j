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
	 * Test for uniteArray() when {1, 2, 3, 4} and {3, 5, 8, 9, 10, 12}.
	 */
	@Test
	public void whenTwoSortedArrayThenNewSortedArray1() {
		int[] firstArray = {1, 2, 3, 4};
		int[] secondArray = {3, 5, 8, 9, 10, 12};
		SortedArray sortedArray = new SortedArray();
		int[] result = sortedArray.uniteArray(firstArray, secondArray);
		int[] expect = {1, 2, 3, 3, 4, 5, 8, 9, 10, 12};
		assertThat(result, is(expect));
	}

	/**
	 * Test for uniteArray() when {1, 1, 1} and {1, 1, 1, 1, 1}.
	 */
	@Test
	public void whenTwoSortedArrayThenNewSortedArray2() {
		int[] firstArray = {1, 1, 1};
		int[] secondArray = {1, 1, 1, 1, 1};
		SortedArray sortedArray = new SortedArray();
		int[] result = sortedArray.uniteArray(firstArray, secondArray);
		int[] expect = {1, 1, 1, 1, 1, 1, 1, 1};
		assertThat(result, is(expect));
	}

	/**
	 * Test for uniteArray() when {-5, 0, 2} and {-9, -4, 0, 3, 7}.
	 */
	@Test
	public void whenTwoSortedArrayThenNewSortedArray3() {
		int[] firstArray = {-5, 0, 2};
		int[] secondArray = {-9, -4, 0, 3, 7};
		SortedArray sortedArray = new SortedArray();
		int[] result = sortedArray.uniteArray(firstArray, secondArray);
		int[] expect = {-9, -5, -4, 0, 0, 2, 3, 7};
		assertThat(result, is(expect));
	}

	/**
	 * Test for uniteArray() when {-8, -4, -2, -1} and {-9, -7, -5, -4, -1}.
	 */
	@Test
	public void whenTwoSortedArrayThenNewSortedArray4() {
		int[] firstArray = {-8, -4, -2, -1};
		int[] secondArray = {-9, -7, -5, -4, -1};
		SortedArray sortedArray = new SortedArray();
		int[] result = sortedArray.uniteArray(firstArray, secondArray);
		int[] expect = {-9, -8, -7, -5, -4, -4, -2, -1, -1};
		assertThat(result, is(expect));
	}
}
package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Test for ArrayDuplicate.
 *
 * @author makkez
 * @version 1.0
 * @since 16.09.2018
 */
public class ArrayDuplicateTest {
	
	/**
	 * Test for remove().
	 */
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		ArrayDuplicate duplicate = new ArrayDuplicate();
		String[] input = {"One", "One", "Two", "Two", "Three", "Three"};
		String[] result = duplicate.remove(input);
		String[] expect = {"One", "Two", "Three"};
		assertThat(result, arrayContainingInAnyOrder(expect));
	}
}
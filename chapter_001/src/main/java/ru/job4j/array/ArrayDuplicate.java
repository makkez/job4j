package ru.job4j.array;

import java.util.Arrays;

/**
 * Class for remove duplicates from array.
 *
 * @author makkez
 * @version 1.0
 * @since 16.09.2018
 */
public class ArrayDuplicate {
	
	/**
	 * Remove duplicates from array.
	 *
	 * @param array Array for removing duplicates.
	 * @return Array without duplicates.
	 */
	public String[] remove(String[] array) {
		int unique = array.length;
		for (int out = 0; out < unique; out++) {
			for (int in = out + 1; in < unique; in++) {
				if (array[out].equals(array[in])) {
					array[in] = array[--unique];
					in--;
				}
			}
		}
		return Arrays.copyOf(array, unique);
	}
}
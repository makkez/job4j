package ru.job4j.array;

/**
 * Class completes two sorted array and intended for constructing third array.
 * @author makkez
 * @version 1.0
 * @since 18.09.2018
 */
public class SortedArray {
	
	/**
	 * Unites two sorted arrays.
	 * @param first First sorted array.
	 * @param second Second sorted array.
	 * @return Sorted array as association first array and second array.
	 */
	public int[] uniteArray(int[] first, int[] second) {
		int[] result = new int[first.length + second.length];
		int firstLimiter = 0;
		int secondLimiter = 0;
		int i = 0;
		while (firstLimiter < first.length && secondLimiter < second.length) {
			if (first[firstLimiter] <= second[secondLimiter]) {
				result[i++] = first[firstLimiter++];
			} else {
				result[i++] = second[secondLimiter++];
			}
		}
		if (first[first.length - 1] > second[second.length - 1]) {
			System.arraycopy(first, firstLimiter, result, i, first.length - firstLimiter);
		} else {
			System.arraycopy(second, secondLimiter, result, i, second.length - secondLimiter);
		}
		return result;
	}
}
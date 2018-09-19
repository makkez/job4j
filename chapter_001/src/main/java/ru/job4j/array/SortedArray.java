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
	 * @param firstArray First sorted array.
	 * @param secondArray Second sorted array.
	 * @return Sorted array as association first array and second array.
	 */
	public int[] uniteArray(int[] firstArray, int[] secondArray) {
		int[] result = new int[firstArray.length + secondArray.length];
		//int criterion = Math.min(firstArray.length, secondArray.length);
		int fLim = 0;
		int sLim = 0;
		int i = 0;
		while (fLim < firstArray.length && sLim < secondArray.length) {
			if (firstArray[fLim] <= secondArray[sLim]) {
				result[i] = firstArray[fLim];
				fLim++;
			} else {
				result[i] = secondArray[sLim];
				sLim++;
			}
			i++;
		}
		if (firstArray[firstArray.length - 1] > secondArray[secondArray.length - 1]) {
			System.arraycopy(firstArray, fLim, result, i, firstArray.length - fLim);
		} else {
			System.arraycopy(secondArray, sLim, result, i, secondArray.length - sLim);
		}
		return result;
	}
}
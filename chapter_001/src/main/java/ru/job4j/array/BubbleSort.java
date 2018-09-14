package ru.job4j.array;

/**
 * Класс для сортировки пузырьком.
 * 
 * @author makkez
 * @version 1.0
 * @since 14.09.2018
 */
public class BubbleSort {
	
	/**
	 * Метод выполняет сортировку пузырьком массива целых чисел.
	 * 
	 * @param array Массив, в котором нужно выполнить сортировку.
	 * @return Отсортированный массив.
	 */
	public int[] sort(int[] array) {
		int tmp;
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					tmp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}
}
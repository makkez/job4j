package ru.job4j.array;

/**
 * Класс содержит метод для обращения массива.
 * 
 * @author makkez
 * @version 1.0
 * @since 13.09.2018
 */
public class Turn {
	
	/**
	 * Метод осуществляет обращение массива.
	 * 
	 * @param array Массив, который необходимо перевернуть.
	 * @return Перевёрнутый массив.
	 */
	public int[] back(int[] array) {
		int predicate = array.length / 2;
		int tmp;
		for (int i = 0; i < predicate; i++) {
			tmp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = tmp;
		}
		return array;
	}
}
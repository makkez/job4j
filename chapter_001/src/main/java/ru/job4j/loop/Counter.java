package ru.job4j.loop;

/**
 * Класс Counter описывает счётчик.
 *
 * @version 1.0
 * @since 09.09.2018
 * @author makkez
 */
public class Counter {
	
	/**
	 * Метод вычисляет сумму чётных чисел в заданном дапазоне, включая границы.
	 * 
	 * @param start Начало диапазона.
	 * @param finish Конец диапазона.
	 * @return Сумма чётных чисел.
	 */
	public int add(int start, int finish) {
		int count = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				count += i;
			}
		}
		return count;
	}
}
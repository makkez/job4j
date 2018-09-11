package ru.job4j.loop;

/**
 * Класс для вычисления факториала числа.
 *
 * @version 1.0
 * @since 09.09.2018
 * @author makkez
 */
public class Factorial {
	
	/**
	 * Метод вычисляет факториал заданного числа.
	 *
	 * @param n Число, факториал которого нужно вычислить.
	 * @return Вычисленный факториал числа, 
	 * возврящает 1, если задан 0 или отрицательное число.
	 */
	public int calc(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
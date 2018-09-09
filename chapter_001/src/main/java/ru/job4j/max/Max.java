package ru.job4j.max;

/**
 * Класс для вычисления максимального значения.
 *
 * @version 1.0
 * @since 07.09.2018
 * @author makkez
 */
public class Max {
	
	/**
	 * Метод возвращает максимальное из значений, переданных в параметрах.
	 * 
	 * @param first Первое значение.
	 * @param second Второе значение.
	 * @return Максимальное из двух значений.
	 */
	public int max(int first, int second) {
		return first > second ? first : second;
	}
	
	/**
	 * Метод возвращает максимальное из значений, переданных в параметрах.
	 * 
	 * @param first Первое значение.
	 * @param second Второе значение.
	 * @param third Третье значение.
	 * @return Максимальное из трёх значений.
	 */
	public int max(int first, int second, int third) {
		return this.max(this.max(first, second), third);
	}
}
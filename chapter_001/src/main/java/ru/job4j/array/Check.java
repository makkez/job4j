package ru.job4j.array;

/**
 * Класс реализует проверку условия.
 *
 * @author makkez
 * @version 1.0
 * @since 13.09.2018
 */
public class Check {
	
	/**
	 * Метод выполняет проверку содержит ли заданный массив 
	 * одинаковые элементы типа boolean.
	 * 
	 * @param data Массив для проверки.
	 * @return Возвращает true, если все элементы массива имеют 
	 * одинаковые значения, false, если элементы массива имеют разные значения. 
	 */
	public boolean mono(boolean[] data) {
		boolean result = true;
		for (int i = 1; i < data.length; i++) {
			if (data[i - 1] != data[i]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
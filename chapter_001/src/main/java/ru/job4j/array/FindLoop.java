package ru.job4j.array;

/**
 * Класс реализует способ поиска элемента в массиве.
 * 
 * @author makkez
 * @version 1.0
 * @since 13.09.2018
 */
public class FindLoop {
	
	/**
	 * Метод осуществляет ипоиск заданного элемента 
	 * в заданном массиве элементов типа int.
	 * 
	 * @param data Массив элементов типа int.
	 * @param el Элемент, который необходимо найти в массиве.
	 * @return Индекс элемента в массиве или -1, 
	 * если такого элемента в массиве нет.
	 */
	public int indexOf(int[] data, int el) {
		int result = -1;
		for (int index = 0; index < data.length; index++) {
			if (data[index] == el) {
				result = index;
				break;
			}
		}
		return result;
	}
}
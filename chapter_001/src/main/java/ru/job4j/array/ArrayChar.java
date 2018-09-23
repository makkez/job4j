package ru.job4j.array;

/**
 * Обёртка над строкой.
 *
 * @author makkex
 * @version 1.0
 * @since 14.09.2018
 */
public class ArrayChar {
	
	private char[] data;
	
	/**
	 * Создаёт ArrayChar на основе заданной строки.
	 *
	 * @param line Строка.
	 */
	public ArrayChar(String line) {
		this.data = line.toCharArray();
	}
	
	/**
	 * Проверяет, начинается ли слово с заданного префикса.
	 *
	 * @param prefix Префикс.
	 * @return true, если слово начинается с префикса, 
	 * false, если слово не начинается с префикса.
	 */
	public boolean startWith(String prefix) {
		boolean result = true;
		char[] value = prefix.toCharArray();
		if (this.data.length < value.length) {
			result = false;
		} else {
			for (int i = 0; i < value.length; i++) {
				if (this.data[i] != value[i]) {
					result = false;
				}
			}
		}
		return result;
	}
}
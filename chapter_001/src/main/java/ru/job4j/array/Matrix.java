package ru.job4j.array;

/**
 * Класс описывает матрицу.
 * 
 * @author
 * @version 1.0
 * @since 15.09.2018
 */
public class Matrix {
	
	/**
	 * Метод создаёт таблицу умножения заданного размера.
	 *
	 * @param size Размер таблицы умножения.
	 * @return Таблица умножения.
	 */
	public int[][] multiple(int size) {
		int[][] table = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				table[i][j] = (i + 1) * (j + 1);
			}
		}
		return table;
	}
}
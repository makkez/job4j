package ru.job4j.loop;

/**
 * Класс описывает шахматную доску.
 * 
 * @version 1.0
 * @since 10.09.2018
 * @author makkez
 */
public class Board {
	
	/**
	 * Метод создаёт шахматную доску в виде строки.
	 *
	 * @param width Ширина шахматной доски.
	 * @param height Высота шахматной доски.
	 * @return Строка, представляющая шахматную доску.
	 */
	public String paint(int width, int height) {
		StringBuilder screen = new StringBuilder();
		String ln = System.lineSeparator();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((i + j) % 2 == 0) {
					screen.append("X");
				} else {
					screen.append(" ");
				}
			}
			screen.append(ln);
		}
		return screen.toString();
	}
}
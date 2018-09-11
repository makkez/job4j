package ru.job4j.loop;

/**
 * Класс осуществляет рисование объектов.
 * 
 * @author makkez
 * @version 1.0
 * @since 11.09.2018
 */
public class Paint {
	
	/**
	 * Метод создаёт правую сторону пирамиды в виде строки,
	 * состоящей из символов '^'.
	 *
	 * @param height Параметр задаёт высоту пирамиды.
	 * @return Возвращает строку, состоющую из символов '^' и
	 * представляющую правую сторону пирамиды.
	 */
	public String rightTrl(int height) {
		StringBuilder screen = new StringBuilder();
		int width = height;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != width; column++) {
				if (row >= column) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
	
	/**
	 * Метод создаёт левую сторону пирамиды в виде строки,
	 * состоящей из символов '^'.
	 *
	 * @param height Параметр задаёт высоту пирамиды.
	 * @return Возвращает строку, состоющую из символов '^' и
	 * представляющую левую сторону пирамиды.
	 */
	public String leftTrl(int height) {
		StringBuilder screen = new StringBuilder();
		int width = height;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != width; column++) {
				if (row >= width - column - 1) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
	
	/**
	 * Метод создаёт пирамиду в виде строки,
	 * состоящей из символов '^'.
	 *
	 * @param height Параметр задаёт высоту пирамиды.
	 * @return Возвращает строку, состоющую из символов '^' и
	 * представляющую пирамиду.
	 */
	public String pyramid(int height) {
		StringBuilder screen = new StringBuilder();
		int width = 2 * height - 1;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != width; column++) {
				if (row >= height - column - 1 && row + height - 1 >= column) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
}
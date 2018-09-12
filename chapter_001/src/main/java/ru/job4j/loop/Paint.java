package ru.job4j.loop;

import java.util.function.BiPredicate;

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
		return this.loopBy(
				height, 
				height, 
				(row, column) -> row >= column);
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
		return this.loopBy(
				height, 
				height, 
				(row, column) -> row >= height - column - 1);
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
		return this.loopBy(
				height, 
				2 * height - 1,
				(row, column) -> row >= height - column - 1 && row + height - 1 >= column);
	}
	
	/**
	 * Метод создаёт пирамиду в виде строки,
	 * состоящей из символов '^'.
	 * 
	 * @param height Высота пирамиды.
	 * @param width Ширина пирамиды.
	 * @param predict Условия использования символа '^'.
	 * @return Строка, состоющая из символов '^' и
	 * представляющая пирамиду.
	 */
	private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
		StringBuilder screen = new StringBuilder();
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != width; column++) {
				if (predict.test(row, column)) {
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
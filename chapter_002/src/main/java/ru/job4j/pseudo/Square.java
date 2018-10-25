package ru.job4j.pseudo;

/**
 * The Square class describes a square. This class implements the Shape interface.
 * @author makkez
 * @version 1.0
 * @since 24.10.2018
 */
public class Square implements Shape {
	
	/**
	 * The draw() method creates the string containing the square.
	 * This method located in the Shape interface.
	 * @return The string-view of square.
	 */
	@Override
	public String draw() {
		StringBuilder picture = new StringBuilder()
				.append("+++++++")
				.append(System.lineSeparator())
				.append("+++++++")
				.append(System.lineSeparator())
				.append("+++++++")
				.append(System.lineSeparator())
				.append("+++++++");
		return picture.toString();
	}
}
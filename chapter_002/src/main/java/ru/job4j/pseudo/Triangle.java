package ru.job4j.pseudo;

/**
 * The Triangle class describes a triangle. This class implements the Shape interface.
 * @author makkez
 * @version 1.0
 * @since 24.10.2018
 */
public class Triangle implements Shape {
	
	/**
	 * The draw() method creates the string containing the triangle.
	 * This method located in the Shape interface.
	 * @return The string-view of triangle.
	 */
	@Override
	public String draw() {
		StringBuilder picture = new StringBuilder()
				.append("   +")
				.append(System.lineSeparator())
				.append("  +++")
				.append(System.lineSeparator())
				.append(" +++++")
				.append(System.lineSeparator())
				.append("+++++++");
		return picture.toString();
	}
}
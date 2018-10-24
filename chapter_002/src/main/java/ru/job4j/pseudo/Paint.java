package ru.job4j.pseudo;

/**
 * The Paint class for drawing pictures by pseudographics.
 * @author makkez
 * @version 1.0
 * @since 24.10.2018
 */
public class Paint {
	
	/**
	 * The draw() method for printing the specified shape.
	 * @param shape The shape for printing.
	 */
	public void draw(Shape shape) {
		System.out.println(shape.draw());
	}
}
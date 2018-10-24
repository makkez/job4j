package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The SquareTest class for testing the Square class.
 * @author makkez
 * @version 1.0
 * @since 24.10.2018
 */
public class SquareTest {
	
	/**
	 * The test for the draw() method.
	 */
	@Test
	public void whenDrawSquare() {
		Square square = new Square();
		StringBuilder expected = new StringBuilder()
				.append("+++++++\n")
				.append("+++++++\n")
				.append("+++++++\n")
				.append("+++++++");
		assertThat(square.draw(), is(expected.toString()));
	}
}
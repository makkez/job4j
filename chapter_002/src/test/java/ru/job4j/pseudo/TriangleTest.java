package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The TriangleTest class for testing the Triangle class.
 * @author makkez
 * @version 1.0
 * @since 24.10.2018
 */
public class TriangleTest {
	
	/**
	 * The test for the draw() method.
	 */
	@Test
	public void whenDrawTriangle() {
		Triangle triangle = new Triangle();
		StringBuilder expected = new StringBuilder()
				.append("   +")
				.append(System.lineSeparator())
				.append("  +++")
				.append(System.lineSeparator())
				.append(" +++++")
				.append(System.lineSeparator())
				.append("+++++++");
		assertThat(triangle.draw(), is(expected.toString()));
	}
}
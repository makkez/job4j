package ru.job4j.pseudo;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The PaintTest class for testing of the Paint class.
 */
public class PaintTest {
	
	/**
	 * The testing of draw() method when a square is drawn.
	 */
	@Test
	public void whenDrawSquare() {
		PrintStream stdout = System.out;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		new Paint().draw(new Square());
		StringBuilder expected = new StringBuilder()
				.append("+++++++")
				.append(System.lineSeparator())
				.append("+++++++")
				.append(System.lineSeparator())
				.append("+++++++")
				.append(System.lineSeparator())
				.append("+++++++")
				.append(System.lineSeparator());
		assertThat(new String(out.toByteArray()), is(expected.toString()));
		System.setOut(stdout);
	}
	
	/**
	 * The testing of draw() method when a triangle is drawn.
	 */
	@Test
	public void whenDrawTriangle() {
		PrintStream stdout = System.out;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		new Paint().draw(new Triangle());
		StringBuilder expected = new StringBuilder()
				.append("   +")
				.append(System.lineSeparator())
				.append("  +++")
				.append(System.lineSeparator())
				.append(" +++++")
				.append(System.lineSeparator())
				.append("+++++++")
				.append(System.lineSeparator());
		assertThat(new String(out.toByteArray()), is(expected.toString()));
		System.setOut(stdout);
	}
}
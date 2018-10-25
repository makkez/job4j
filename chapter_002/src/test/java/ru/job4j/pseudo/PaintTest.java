package ru.job4j.pseudo;

import org.junit.After;
import org.junit.Before;
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
	 * The default printing to the console.
	 */
	private final PrintStream stdout = System.out;
	
	/**
	 * The buffer for a result.
	 */
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	
	/**
	 * The loadOutput() method sets the new output.
	 */
	@Before
	public void loadOutput() {
		System.setOut(new PrintStream(this.out));
	}
	
	/**
	 * The backOutput() method sets the default output.
	 */
	@After
	public void backOutput() {
		System.setOut(this.stdout);
	}
	
	/**
	 * The testing of draw() method when a square is drawn.
	 */
	@Test
	public void whenDrawSquare() {
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
	}
	
	/**
	 * The testing of draw() method when a triangle is drawn.
	 */
	@Test
	public void whenDrawTriangle() {
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
	}
}
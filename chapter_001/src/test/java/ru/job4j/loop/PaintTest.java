package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Test for Paint.
 *
 * @author makkez
 * @version 1.0
 * @since 11.09.2018
 */
public class PaintTest {
	
	/**
	 * Test for rightTrl().
	 */
	@Test
	public void whenPyramid4Right() {
		Paint paint = new Paint();
		String rst = paint.rightTrl(4);
		assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("^   ")
				.add("^^  ")
				.add("^^^ ")
				.add("^^^^").toString()));
	}
	
	/**
	 * Test for leftTrl().
	 */
	@Test
	public void whenPyramid4Left() {
		Paint paint = new Paint();
		String rst = paint.leftTrl(4);
		assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("   ^")
				.add("  ^^")
				.add(" ^^^")
				.add("^^^^").toString()));
	}
	
	/**
	 * Test for pyramid()
	 */
	@Test
	public void whenPyramid4() {
		Paint paint = new Paint();
		String rst = paint.pyramid(4);
		assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("   ^   ")
				.add("  ^^^  ")
				.add(" ^^^^^ ")
				.add("^^^^^^^").toString()));
	}
}
package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Square.
 * 
 * @author makkez
 * @version 1.0
 * @since 12.09.2018
 */
public class SquareTest {
	
	/**
	 * Test for calculate() when bound = 3.
	 */
	@Test
	public void whenBound3Then149() {
		int bound = 3;
		Square square = new Square();
		int[] rst = square.calculate(bound);
		int[] expect = {1, 4, 9};
		assertThat(rst, is(expect));
	}
	
	/**
	 * Test for calculate() when bound = 5.
	 */
	@Test
	public void whenBound5Then1491625() {
		int bound = 5;
		Square square = new Square();
		int[] rst = square.calculate(bound);
		int[] expect = {1, 4, 9, 16, 25};
		assertThat(rst, is(expect));
	}
	
	/**
	 * Test for calculate() when bound = 7.
	 */
	@Test
	public void whenBound7Then14916253649() {
		int bound = 7;
		Square square = new Square();
		int[] rst = square.calculate(bound);
		int[] expect = {1, 4, 9, 16, 25, 36, 49};
		assertThat(rst, is(expect));
	}
	
	/**
	 * Test for calculate() when bound = 9.
	 */
	@Test
	public void whenBound7Then149162536496481() {
		int bound = 9;
		Square square = new Square();
		int[] rst = square.calculate(bound);
		int[] expect = {1, 4, 9, 16, 25, 36, 49, 64, 81};
		assertThat(rst, is(expect));
	}
	
	/**
	 * Test for calculate() when bound = 11.
	 */
	@Test
	public void whenBound7Then149162536496481100121() {
		int bound = 11;
		Square square = new Square();
		int[] rst = square.calculate(bound);
		int[] expect = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121};
		assertThat(rst, is(expect));
	}
}
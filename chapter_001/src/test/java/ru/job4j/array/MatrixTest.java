package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Matrix.
 *
 * @author makkez
 * @version 1.0
 * @since 15.09.2018
 */
public class MatrixTest {
	
	/**
	 * Test for multuple.
	 */
	@Test
	public void when2on2() {
		Matrix matrix = new Matrix();
		int[][] table = matrix.multiple(2);
		int[][] expect = {
			{1, 2},
			{2, 4}
		};
		assertThat(table, is(expect));
	}
}
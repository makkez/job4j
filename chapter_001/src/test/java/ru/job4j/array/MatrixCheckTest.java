package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for MatrixCheck.
 *
 * @author makkez
 * @version 1.0
 * @since 15.09.2018
 */
public class MatrixCheckTest {
	
	/**
	 * Test for mono() when matrix is 3x3 and diagonals has true only.
	 */
	@Test
	public void whenDataMonoByTrueThenTrue() {
		MatrixCheck check = new MatrixCheck();
		boolean[][] input = {
			{true, true, true},
			{false, true, true},
			{true, false, true}
		};
		boolean result = check.mono(input);
		assertThat(result, is(true));
	}
	
	/**
	 * Test for mono() when matrix is 3x3 and diagonals has true and false.
	 */
	@Test
	public void whenDataNotMonoByTrueThenFalse() {
		MatrixCheck check = new MatrixCheck();
		boolean[][] input = {
			{true, true, false},
			{false, false, true},
			{true, false, true}
		};
		boolean result = check.mono(input);
		assertThat(result, is(false));
	}
	
	/**
	 * Test for mono() when matrix is 4x4 and diagonals has different values, 
	 * same by diagonal.
	 */
	@Test
	public void whenDataMonoEvenByTrueAndFalseOnlyThenTrue() {
		MatrixCheck check = new MatrixCheck();
		boolean[][] input = {
			{true, true, true, false},
			{false, true, false, true},
			{true, false, true, false},
			{false, true, false, true}
		};
		boolean result = check.mono(input);
		assertThat(result, is(true));
	}
	
	/**
	 * Test for mono() when matrix is 4x4 and diagonals has different values.
	 */
	@Test
	public void whenDataMonoEvenByTrueAndFalseThenFalse() {
		MatrixCheck check = new MatrixCheck();
		boolean[][] input = {
			{true, true, true, false},
			{false, true, false, true},
			{true, true, true, false},
			{false, true, false, true}
		};
		boolean result = check.mono(input);
		assertThat(result, is(false));
	}
}
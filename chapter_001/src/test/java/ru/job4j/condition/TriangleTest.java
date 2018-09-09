package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test for Triangle.
 *
 * @version 1.0
 * @since 09.09.2018
 * @author makkez
 */
public class TriangleTest {
	 
	/**
	 * Test on area(), whet triangle is exist.
	 */
	@Test
	public void whenAreaSetThreePointsThenTriangleArea() {
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		Point c = new Point(2, 0);
		
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		
		double expected = 2.0;
		assertThat(result, closeTo(expected, 0.1));
	}
	
	/**
	 * Test on area(), when triangle is not exist.
	 */
	@Test
	public void whenSetThreePointsOnLineThenTriangleIsNotExist() {
		Point a = new Point(0, 0);
		Point b = new Point(2, 2);
		Point c = new Point(4, 4);
		
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		
		double expected = -1.0;
		assertThat(result, closeTo(expected, 0.1));
	}
}
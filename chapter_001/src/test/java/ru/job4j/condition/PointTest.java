package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test for Point
 *
 * @version 1.0
 * @since 06.09.2018
 * @author makkez
 */
public class PointTest {

    /**
     * Test for distanceTo()
     */
    @Test
    public void distanceTo() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);

        double result = a.distanceTo(b);
        double expected = Math.sqrt(20.0);

        assertThat(result, closeTo(expected, 0.1));
    }
}

package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test for Fit
 *
 * @version 1.0
 * @since 04.09.2018
 * @author makkez
 */
public class FitTest {

    /**
     * Test for manWeight()
     */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180.0);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    /**
     * Test for womanWeight()
     */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170.0);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}

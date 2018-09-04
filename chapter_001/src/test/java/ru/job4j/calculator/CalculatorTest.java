package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Calculator
 *
 * @author makkez
 * @since 03.09.2018
 * @version 1.0
 */
public class CalculatorTest {

    /**
     * Test for add()
     */
    @Test
    public void whenAdd1Plus1Then2() {
        Calculator calc = new Calculator();
        calc.add(1.0, 1.0);
        double result = calc.getResult();
        double expected = 2.0;
        assertThat(result, is(expected));
    }

    /**
     * Test for subtract()
     */
    @Test
    public void whenSubtract2Minus1Then1() {
        Calculator calc = new Calculator();
        calc.subtract(2.0, 1.0);
        double result = calc.getResult();
        double expected = 1.0;
        assertThat(result, is(expected));
    }

    /**
     * Test for div()
     */
    @Test
    public void whenDiv4On2Then2() {
        Calculator calc = new Calculator();
        calc.div(4.0, 2.0);
        double result = calc.getResult();
        double expected = 2.0;
        assertThat(result, is(expected));
    }

    /**
     * Test for multiple()
     */
    @Test
    public void whenMultiple2On2Then4() {
        Calculator calc = new Calculator();
        calc.multiple(2.0, 2.0);
        double result = calc.getResult();
        double expected = 4.0;
        assertThat(result, is(expected));
    }
}

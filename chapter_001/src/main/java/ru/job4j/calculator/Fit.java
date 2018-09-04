package ru.job4j.calculator;

/**
 * Класс содержит методы расчёта идеального веса.
 *
 * @version 1.0
 * @since 04.09.2018
 * @author makkez
 */
public class Fit {

    /**
     * Метод для расчёта идеального веса мужчины в зависимости от роста.
     *
     * @param height Рост.
     * @return Идевльный вес.
     */
    public double manWeight(double height) {
        return (height - 100.0) * 1.15;
    }

    /**
     * Метод для расчёта идеального веса женщины в зависимости от роста.
     *
     * @param height Рост.
     * @return Идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110.0) * 1.15;
    }
}

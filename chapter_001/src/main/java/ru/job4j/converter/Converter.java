package ru.job4j.converter;

/**
 * Конвертер валюты
 * @version 1.0
 * @since 04.09.2018
 * @author makkez
 */
public class Converter {

    /**
     * Метод конвертирует рубли в евро
     * @param value Рубли
     * @return Евро
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Метод конвертирует рубли в доллары
     * @param value Рубли
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Метод конвертирует евро в рубли
     * @param value Евро
     * @return Рубли
     */
    public int euroToRuble(int value) {
        return value * 70;
    }

    /**
     * Метод конвертирует доллары в рубли
     * @param value Доллары
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        return value * 60;
    }
}

package ru.job4j.calculator;

/**
 * Класс реализует арифметические операции
 *
 * @author makkez
 * @since 03.09.2018
 * @version 1.0
 */
public class Calculator {

    /**
     * Хранит результат арифметической операции
     */
    private double result;

    /**
     * Метод реализует операцию сложения двух действительных чисел, содержащихся в параметрах first и second,
     * результат сохраняется в поле result
     * @param first Действительное число
     * @param second Действительное число
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Метод реализует операцию вычитания действительного числа, содержащегося в параметре second,
     * из действительного числа, содержащегося в параметре first, результат сохраняется в поле result
     * @param first Действительное число
     * @param second Действительное число
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Метод реализует операцию деления действительного числа, содержащегося в параметре first,
     * на действительное число, содержащееся в параметре second, результат сохраняется в поле result
     * @param first Действительное число
     * @param second Действительное число
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Метод реализует операцию произведения двух действительнх чисел, содержащихся в параметрах first и second,
     * результат сохраняется в поле result
     * @param first Действительное число
     * @param second Действительное число
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Метод возвращает значение поля result
     * @return Поле result
     */
    public double getResult() {
        return this.result;
    }
}

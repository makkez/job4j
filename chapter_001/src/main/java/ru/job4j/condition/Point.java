package ru.job4j.condition;

/**
 * Класс Point описывает точку на двухмерной плоскости.
 *
 * @version 1.0
 * @since 05.09.2018
 * @author makkez
 */
public class Point {

    /**
     * Координата X.
     */
    private int x;

    /**
     * Координата Y.
     */
    private int y;

    /**
     * Конструктор, принимающий параметры - координаты точки.
     *
     * @param x Координата X.
     * @param y Координата Y.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод вычисляет расстояние на двухмерной плоскости от текущей точки до точки, переданной в качестве параметра.
     *
     * @param that Точка на двухмерной плоскости, до которой необходимо вычислить расстояние.
     * @return Расстояние на двухмерной плоскости между двумя точками.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2.0) + Math.pow(this.y - that.y, 2.0));
    }

    /**
     * Метод создаёт две точки на двухмерной плоскости, вычисляет растояние между ними и
     * выводит вычисленное расстояние на консоль.
     *
     * @param args Массив строк.
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);

        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками A и B: " + result);
    }
}

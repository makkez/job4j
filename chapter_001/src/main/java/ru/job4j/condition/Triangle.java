package ru.job4j.condition;

/**
 * Класс, описывающий треугольник.
 *
 * @version 1.0
 * @since 09.09.2018
 * @author makkez
 */
 public class Triangle {
	
	/**
	 * Точка А.
	 */
	private Point a;
	
	/**
	 * Точка В.
	 */
	private Point b;
	
	/**
	 * Точка С.
	 */
	private Point c;
	
	/**
	 * Конструктор, создающий треугольник по трём заданным точкам.
	 *
	 * @param a Заданая точка А.
	 * @param b Заданая точка B.
	 * @param c Заданая точка C.
	 */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Метод вычисления полупериметра по длинам сторон. 
	 * Формула для вычисления: (ab + ac + bc) / 2.
	 *
	 * @param ab Расстояние между точками a и b.
	 * @param ac Расстояние между точками a и c.
	 * @param bc Расстояние между точками b и c.
	 * @return Полупериметр треугольника.
	 */
	public double period(double ab, double ac, double bc) {
		return (ab + ac + bc) / 2.0;
	}
	
	/**
	 * Метод вычисляет площадь треугольника.
	 *
	 * @return Площадь треугольника, если треугольник существует, 
	 * или -1, если треугольника не существует.
	 */
	public double area() {
		double result = -1.0;
		double ab = this.a.distanceTo(this.b);
		double ac = this.a.distanceTo(this.c);
		double bc = this.b.distanceTo(this.c);
		double p = this.period(ab, ac, bc);
		if (this.exist(ab, ac, bc)) {
			result = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
		}
		return result;
	}
	
	/**
	 * Метод определяет возможность существования треугольника.
	 * 
	 * @param ab Расстояние между точками a и b.
	 * @param ac Расстояние между точками a и c.
	 * @param bc Расстояние между точками b и c.
	 * @return Результат true - если треугольник существует, 
	 * false - если треугольника не существует.
	 */
	private boolean exist(double ab, double ac, double bc) {
		return ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
	}
 }
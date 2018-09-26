package ru.job4j.inheritance;

/**
 * Class describes for teacher.
 * @author makkez
 * @version 1.0
 * @since 26.09.2018
 */
public class Teacher extends Profession {
	
	/**
	 * Constructor.
	 * @param name Name.
	 */
	public Teacher(String name) {
		super(name);
	}
	
	/**
	 * To teach for student.
	 * @param student Student.
	 */
	public void teachStudent(Student student) { }
}
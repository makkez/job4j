package ru.job4j.inheritance;

/**
 * Class describes for student.
 * @author makkez
 * @version 1.0
 * @since 26.09.2018
 */
public class Student {
	
	private String name;
	
	/**
	 * Constructor.
	 * @param name Name.
	 */
	public Student(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for name.
	 * @return Name of student.
	 */
	public String getName() {
		return this.name;
	}
}
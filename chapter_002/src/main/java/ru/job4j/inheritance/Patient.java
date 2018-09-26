package ru.job4j.inheritance;

/**
 * Class describes for patient.
 * @author makkez
 * @version 1.0
 * @since 26.09.2018
 */
public class Patient {
	
	private String name;
	
	/**
	 * Constructor.
	 * @param name Name.
	 */
	public Patient(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for name.
	 * @return Name of patient.
	 */
	public String getName() {
		return this.name;
	}
}
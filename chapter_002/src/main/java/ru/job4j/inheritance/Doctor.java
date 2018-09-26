package ru.job4j.inheritance;

/**
 * Class describes for doctor.
 * @author makkez
 * @version 1.0
 * @since 26.09.2018
 */
public class Doctor extends Profession {
	
	/**
	 * Constructor.
	 * @param name Name.
	 */
	public Doctor(String name) {
		super(name);
	}
	
	/**
	 * To cure for patient.
	 * @param patient Patient.
	 */
	public void cure(Patient patient) { }
}
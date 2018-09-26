package ru.job4j.inheritance;

/**
 * Class describes for engineer.
 * @author makkez
 * @version 1.0
 * @since 26.09.2018
 */
public class Engineer extends Profession {
	
	/**
	 * Constructor.
	 * @param name Name.
	 */
	public Engineer(String name) {
		super(name);
	}
	
	/**
	 * To build for house.
	 * @param house House.
	 */
	public void buildHouse(House house) { }
}
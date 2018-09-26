package ru.job4j.inheritance;

/**
 * Class describes for house.
 * @author makkez
 * @version 1.0
 * @since 26.09.2018
 */
public class House {
	
	private String address;
	
	/**
	 * Constructor.
	 * @param address Address.
	 */
	public House(String address) {
		this.address = address;
	}
	
	/**
	 * Getter for address.
	 * @return Address of house.
	 */
	public String getAddress() {
		return this.address;
	}
}
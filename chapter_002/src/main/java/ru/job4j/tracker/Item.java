package ru.job4j.tracker;

/**
 * Class describes user's item.
 * @author makkez
 * @version 1.0
 * @since 14.10.2018
 */
public class Item {
	
	/**
	 * Comments for item.
	 */
	private String[] comments;
	
	/**
	 * The creation date of item.
	 * The date-value saved by long-type.
	 */
	private long created;
	
	/**
	 * The description of item.
	 */
	private String description;
	
	/**
	 * The unique identification value for item.
	 */
	private String id;
	
	/**
	 * The name of item.
	 */
	private String name;
	
	/**
	 * The default constructor.
	 */
	public Item() {	}
	
	/**
	 * The constructor with the name parameter.
	 * @param name The name of item.
	 */
	public Item(String name) {
		this.name = name;
	}
	
	/**
	 * The constructor with the name and the description parameters.
	 * @param name The name of item.
	 * @param description The description of item.
	 */
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	/**
	 * The constructor with the name, the description and the creation date parameter.
	 * @param name The name of item.
	 * @param description The description of item.
	 * @param created The creation date of item.
	 */
	public Item(String name, String description, long created) {
		this.name = name;
		this.description = description;
		this.created = created;
	}
	
	/**
	 * The setId() method does set identification value for item.
	 * @param id The identification value for item.
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * The setName() method does set name for item.
	 * @param name The name for item.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * The setDescription() method does set description for item.
	 * @param description The description for item.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * The setCreated() method does set date for item.
	 * @param created The date-value by long-type.
	 */
	public void setCreated(long created) {
		this.created = created;
	}
	
	/**
	 * The getId() method provides the identification value of item.
	 * @return The identification value of item.
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * The getName() method provides the name of item.
	 * @return The name of item.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * The getDescription() method provides the description of item.
	 * @return The description of item.
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * The getCreated() method provides the creation date of item.
	 * @return The creation date of item by long-type.
	 */
	public long getCreated() {
		return this.created;
	}
	
	/**
	 * The getComments() method provides the comments of item.
	 * @return The comments of item.
	 */
	public String[] getComments() {
		return this.comments;
	}
	
	/**
	 * The toString() method returns the data of item as the string representation.
	 * This method is overrided by the Object class.
	 * @return The data of item as the string representation.
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		if (this.id != null) {
			result.append(String.format("ID: %10s\n", this.id));
		}
		if (this.name != null) {
			result.append(String.format("Name: %10s\n", this.name));
		}
		if (this.created != 0L) {
			result.append(String.format("Creation date: %10d\n", this.created));
		}
		if (this.description != null) {
			result.append(String.format("Description: %10s\n", this.description));
		}
		if (this.comments != null) {
			result.append("Comments:\n");
			for (String comment : this.comments) {
				result.append(String.format("\t%s \n", comment));
			}
		}
		return result.toString();
	}
}
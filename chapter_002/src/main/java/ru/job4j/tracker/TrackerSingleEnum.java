package ru.job4j.tracker;

/**
 * The enum for a singleton for the Tracker.
 * @author makkez
 */
public enum TrackerSingleEnum {
	
	INSTANCE;
	
	public final Tracker tracker = new Tracker();
}
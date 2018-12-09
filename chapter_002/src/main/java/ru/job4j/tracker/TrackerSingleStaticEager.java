package ru.job4j.tracker;

/**
 * The class for a singleton for the Tracker by eager loading.
 * @author makkez
 */
public class TrackerSingleStaticEager {
	
	private static final TrackerSingleStaticEager INSTANCE = new TrackerSingleStaticEager();
	
	/**
	 * The method provides the singleton implementation.
	 * @return The object of the TrackerSingleStaticLazy class.
	 */
	public static TrackerSingleStaticEager getInstance() {
		return INSTANCE;
	}
	
	private Tracker tracker;
	
	private TrackerSingleStaticEager() {
		this.tracker = new Tracker();
	}
	
	/**
	 * @return The tracker.
	 */
	public Tracker getTracker() {
		return this.tracker;
	}
}
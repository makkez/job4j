package ru.job4j.tracker;

/**
 * The class for a singleton for the Tracker by lazy loading.
 * @author makkez
 */
public class TrackerSingleStaticLazy {
	
	private static TrackerSingleStaticLazy instance;
	
	/**
	 * The method provides the singleton implementation.
	 * @return The object of the TrackerSingleStaticLazy class.
	 */
	public static TrackerSingleStaticLazy getInstance() {
		if (instance == null) {
			instance = new TrackerSingleStaticLazy();
		}
		return instance;
	}
	
	private Tracker tracker;
	
	private TrackerSingleStaticLazy() {
		this.tracker = new Tracker();
	}
	
	/**
	 * @return The tracker.
	 */
	public Tracker getTracker() {
		return this.tracker;
	}
}
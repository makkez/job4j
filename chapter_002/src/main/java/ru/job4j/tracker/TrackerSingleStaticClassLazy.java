package ru.job4j.tracker;

/**
 * The class for a singleton for the Tracker by lazy loading.
 * @author makkez
 */
public class TrackerSingleStaticClassLazy {
	
	private Tracker tracker;
	
	private TrackerSingleStaticClassLazy() {
		this.tracker = new Tracker();
	}
	
	/**
	 * The method provides the singleton implementation.
	 * @return The object of the TrackerSingleStaticLazy class.
	 */
	public static TrackerSingleStaticClassLazy getInstance() {
		return Holder.INSTANCE;
	}
	
	public Tracker getTracker() {
		return this.tracker;
	}
	
	private static final class Holder {
		private static final TrackerSingleStaticClassLazy INSTANCE = new TrackerSingleStaticClassLazy();
	}
}
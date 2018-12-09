package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The class for the singleton tracker testing.
 * @author makkez
 */
public class TrackerSingleStaticClassLazyTest {
	
	/**
	 * The test for singleton for the tracker by a static final class.
	 */
	@Test
	public void whenTrackerByStaticFinalClassAndAnotherTrackerThenTheyAreEqual() {
		Tracker tracker1 = TrackerSingleStaticClassLazy.getInstance().getTracker();
		Tracker tracker2 = TrackerSingleStaticClassLazy.getInstance().getTracker();
		assertThat(tracker1.equals(tracker2), is(true));
	}
}
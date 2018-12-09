package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The class for the singleton tracker testing.
 * @author makkez
 */
public class TrackerSingleStaticLazyTest {
	
	/**
	 * The test for singleton for the tracker by a static field.
	 */
	@Test
	public void whenTrackerByStaticFieldAndAnotherTrackerThenTheyAreEqual() {
		Tracker tracker1 = TrackerSingleStaticLazy.getInstance().getTracker();
		Tracker tracker2 = TrackerSingleStaticLazy.getInstance().getTracker();
		assertThat(tracker1.equals(tracker2), is(true));
	}
}
package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The class for the singleton tracker testing.
 * @author makkez
 */
public class TrackerSingleStaticEagerTest {
	
	/**
	 * The test for singleton for the tracker by a static final field.
	 */
	@Test
	public void whenTrackerByStaticFinalFieldAndAnotherTrackerThenTheyAreEqual() {
		Tracker tracker1 = TrackerSingleStaticEager.getInstance().getTracker();
		Tracker tracker2 = TrackerSingleStaticEager.getInstance().getTracker();
		assertThat(tracker1.equals(tracker2), is(true));
	}
}
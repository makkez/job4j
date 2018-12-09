package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The class for the singleton tracker testing.
 * @author makkez
 */
public class TrackerSingleEnumTest {
	
	/**
	 * The test for singleton for the tracker by an enum.
	 */
	@Test
	public void whenTrackerByEnumAndAnotherTrackerThenTheyAreEqual() {
		Tracker tracker1 = TrackerSingleEnum.INSTANCE.tracker;
		Tracker tracker2 = TrackerSingleEnum.INSTANCE.tracker;
		assertThat(tracker1.equals(tracker2), is(true));
	}
}
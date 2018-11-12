package ru.job4j.tracker;

import java.util.List;
import java.util.ArrayList;

/**
 * The StartUI class is a enter-point to the programm.
 * @author makkez
 * @version 1.0
 * @since 19.10.2018
 */
public class StartUI {
	
	private int[] ranges = MenuTracker.getMenuItems();
	
	/**
	 * An object of the Input type for entering data by user.
	 */
	private final Input input;
	
	/**
	 * The tracker.
	 */
	private final Tracker tracker;
	
	/**
	 * A constructor with two parameters for initialization to field of this class.
	 * @param input Entering data.
	 * @param tracker The tracker.
	 */
	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	
	/**
	 * The start of programm.
	 * @param args Arguments.
	 */
	public static void main(String[] args) {
		new StartUI(new ValidateInput(), new Tracker()).init();
	}
	
	/**
	 * The init() method executes the main cycle of program.
	 */
	public void init() {
		MenuTracker menu = new MenuTracker(this.input, this.tracker);
		List<Integer> range = new ArrayList<>();
		menu.fillActions();
		for (int i = 0; i < menu.getActionLength(); i++) {
			range.add(i);
		}
		do {
			menu.show();
			menu.select(input.ask("User's select: ", this.ranges));
		} while (!"y".equals(this.input.ask("Exit? (y): ")));
	}
}
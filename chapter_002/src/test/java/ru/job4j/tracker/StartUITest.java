package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
	@Test
	public void whenUserAddItemThenHasNewItemWithSameName() {
		Tracker tracker = new Tracker();
		Input input = new StubInput(new String[]{"1", "test name", "desc", "7"});
		new StartUI(tracker, input).init();
		assertThat(tracker.findAll()[0].getName(), is("test name"));
	}
	
	@Test
	public void whenUpdateThenTrackerItemWithSameName() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "decs", System.currentTimeMillis()));
		Input input = new StubInput(new String[]{"3", item.getId(), "test replace", "заменили заявку", "7"});
		new StartUI(tracker, input).init();
		assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
	}
	
	@Test 
	public void whenDeleteThenTrackerItemWithSameName() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "decs",System.currentTimeMillis()));
		Input input = new StubInput(new String[]{"4", item.getId(), "7"});
		new StartUI(tracker, input).init();
		boolean result = false;
		if (tracker.findById(item.getId()) == null) {
			result = true;
			
		}
		assertThat(result, is(true));
	}
}
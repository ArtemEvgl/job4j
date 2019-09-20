package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class StartUITest {
	// буфер для результата.
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	private final Consumer<String> output = new Consumer<String>() {
		// поле содержит дефолтный вывод в консоль.
		private final PrintStream stdout = new PrintStream(out);
		@Override
		public void accept(String s) {
			stdout.println(s);
		}
	};
	@Test
	public void whenUserAddItemThenHasNewItemWithSameName() {
		Tracker tracker = new Tracker();
		Input input = new StubInput(new String[]{"1", "test name", "desc", "y"});
		new StartUI(tracker, input, output).init();
		assertThat(tracker.findAll().get(0).getName(), is("test name"));
	}
	
	@Test
	public void whenUpdateThenTrackerItemWithSameName() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "decs", System.currentTimeMillis()));
		Input input = new StubInput(new String[]{"3", item.getId(), "test replace", "заменили заявку", "y"});
		new StartUI(tracker, input, output).init();
		assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
	}
	
	@Test 
	public void whenDeleteThenTrackerItemWithSameName() {
		Tracker tracker = new Tracker();
		Item item = tracker.add(new Item("test name", "decs", System.currentTimeMillis()));
		Input input = new StubInput(new String[]{"4", item.getId(), "y"});
		new StartUI(tracker, input, output).init();
		boolean result = false;
		if (tracker.findById(item.getId()) == null) {
			result = true;
		}
		assertThat(result, is(true));
	}
}
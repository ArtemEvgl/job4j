package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
	
	@Test
	public void whenReplaceNameThenReturnNewName() {
    Tracker tracker = new Tracker();
    Item previous = new Item("test1", "testDescription", 123L);
    // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
    tracker.add(previous);
    // Создаем новую заявку.
    Item next = new Item("test2", "testDescription2", 1234L);
    // Проставляем старый id из previous, который был сгенерирован выше.
    next.setId(previous.getId());
    // Обновляем заявку в трекере.
    tracker.replace(previous.getId(), next);
    // Проверяем, что заявка с таким id имеет новые имя test2.
    assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
	}

    @Test
    public void testFindId() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getId(), is(item.getId()));
    }

    @Test
    public void deleteTest() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        Item item2 = new Item("test2", "testDescriptio2", created);
        tracker.add(item);
        tracker.add(item2);
        tracker.delete(item.getId());
        Item item3 = tracker.findById(item.getId());
        boolean result = false;
        if (item3 == null) {
            result = true;
        }
        assertThat(result, is(true));
    }

    @Test
    public void testFindAll() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        Item item2 = new Item("test2", "testDescriptio2", created);
        tracker.add(item);
        tracker.add(item2);
        List<Item> items = tracker.findAll();
        assertThat(items.size(), is(2));
    }

    @Test
    public void testFindKey() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        Item item2 = new Item("test2", "testDescriptio2", created);
        Item item3 = new Item("test1", "testDescriptio3", created);
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        List<Item> items = tracker.findByName("test1");
        assertThat(items.get(0).getName(), is("test1"));
    }

    @Test
    public void testEnum() {
        boolean result;
        TrackerEnum trackerOne = TrackerEnum.INSTANCE;
        TrackerEnum trackeTwo = TrackerEnum.INSTANCE;
        result = trackerOne == trackeTwo;
        assertThat(result, is(true));
    }

    @Test
    public void testStaticEager() {
        boolean result;
        TrackerStaticEager trackerOne = TrackerStaticEager.getInstance();
        TrackerStaticEager trackerTwo = TrackerStaticEager.getInstance();
        result = trackerOne == trackerTwo;
        assertThat(result, is(true));
    }

    @Test
    public void testTrackerLazy() {
        boolean result;
        TrackerStaticLazy trackerOne = TrackerStaticLazy.getInstance();
        TrackerStaticLazy trackerTwo = TrackerStaticLazy.getInstance();
        result = trackerOne == trackerTwo;
        assertThat(result, is(true));
    }

    @Test
    public void testTrackerClassLazy() {
        boolean result;
        TrackerClassLazy trackerOne = TrackerClassLazy.getInstance();
        TrackerClassLazy trackerTwo = TrackerClassLazy.getInstance();
        result = trackerOne == trackerTwo;
        assertThat(result, is(true));
    }
}

package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* @author Arterm Evglevsky
* @version $Id$;
* @since 0.1;
*/
public class CounterTest {
		@Test
		public void whenStart1andFinish10Result30() {
		Counter count = new Counter();
		assertThat(count.add(1, 10), is(30));
		}
}
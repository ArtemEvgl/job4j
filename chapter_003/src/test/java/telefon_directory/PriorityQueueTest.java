package telefon_directory;

import org.junit.Test;
import queue_priority.PriorityQueue;
import queue_priority.Task;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent",1));
        queue.put(new Task("middle",3));
        Task result = queue.take();
        assertThat(result.getDecs(), is("urgent"));
    }
}

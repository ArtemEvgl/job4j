import org.junit.Test;
import task.Task;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestTask {

    @Test
    public void whenArrayToBigNumber() {
        int[] testArray = {1, 2, 3, 4};
        int result = 20;
        assertThat(Task.work(testArray), is(result));
    }
}

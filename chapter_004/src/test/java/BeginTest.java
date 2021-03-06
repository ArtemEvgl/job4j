import begin.Calculator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BeginTest {
    @Test
    public void whenAdd1Until3() {
        Calculator calculator = new Calculator();
        List<Double> buffer = new ArrayList<>();
        calculator.multiple(0, 3, 1, (value, index) -> (double) value + index, result -> buffer.add(result));
        assertThat(buffer, is(Arrays.asList(1D, 2D, 3D)));
    }
}

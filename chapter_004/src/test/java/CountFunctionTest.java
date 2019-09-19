import begin.Function;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CountFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        Function function = new Function();
        List<Double> result = function.diaposon(5, 8, x -> 2 * x + 1);
        List<Double> expect = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSquareFunctionLinearResult() {
        Function function = new Function();
        List<Double> result = function.diaposon(3, 5, x -> Math.pow(x, 2) + 1);
        List<Double> expect = Arrays.asList(10D, 17D);
        assertThat(result, is(expect));
    }

    @Test
    public void whenLogFunctionLogResult() {
        Function function = new Function();
        List<Double> result = function.diaposon(4, 6, x -> (double) Math.round(Math.log(x)) + 1);
        List<Double> expect = Arrays.asList(2D, 3D);
        assertThat(result, is(expect));
    }
}

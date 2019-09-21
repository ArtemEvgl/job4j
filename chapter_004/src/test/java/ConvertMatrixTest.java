import convert.ConvertMatrix;
import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrixTest {
    @Test
    public void whenConvertMatrixToList() {
        Integer[][] test = {{1,2}, {4,5}};
        List<Integer> expect = List.of(1,2,4,5);
        ConvertMatrix convertMatrix = new ConvertMatrix();
        List<Integer> result = convertMatrix.convertMatrixToList(test);
        assertThat(convertMatrix.convertMatrixToList(test), is(expect));
    }
}

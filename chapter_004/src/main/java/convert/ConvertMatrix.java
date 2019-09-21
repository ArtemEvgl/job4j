package convert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertMatrix {

    public List<Integer> convertMatrixToList(Integer[][] matrix) {
        return Stream.of(matrix).flatMap(e -> Arrays.stream(e)).collect(Collectors.toList());
    }
}

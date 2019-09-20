package begin;

import java.util.ArrayList;
import java.util.List;

public class Function {

    public List<Double> diaposon(int start, int end, java.util.function.Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(func.apply((double) i));
        }
        return result;
    }
}

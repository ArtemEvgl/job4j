package convert;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    /**
     * Метод конвертирует значения из двумерного массива в список.
     * @param array входной двумерный массив целых чисел.
     * @return список с целыми числами.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int number : row) {
                list.add(number);
            }
        }
        return list;
    }

}

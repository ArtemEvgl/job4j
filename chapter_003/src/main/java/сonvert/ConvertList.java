package Convert;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    /**
     * Метод конвертирует список в двумерный массив с заданным количеством строк.
     * @param list - спиксок чисел, rows - количество строк.
     * @return двумерный массив.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int)Math.ceil((double) list.size() / rows);
        int[][] array = new int[rows][cells];
        int cell = 0;
        int row = 0;
        for (Integer number : list) {
            array[row][cell] = number;
            cell++;
            if(cell == cells) {
                cell = 0;
                row++;
            }
        }
     return array;
    }

    /**
     * Метод проходит по всем элементам всех массивов в списке list
     * и добавляет их в один общий лист Integer.
     * @param list входный список массивов.
     * @return полученный список со всеми элментами масивов.
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<Integer>();
        for(int[] array : list) {
            for(Integer number : array) {
                result.add(number);
            }
        }
        return result;
    }
}

package queue_priority;

import java.util.List;

public class ConvertList2Array {
    /**
     * Метод конвертирует список в двумерный массив с заданным количеством строк.
     * @param list - спиксок чисел, rows - количество строк.
     * @return двумерный массив.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int)Math.ceil((double) list.size() / rows);
        int array[][] = new int[rows][cells];
        int additional = rows - list.size() % rows;
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
}

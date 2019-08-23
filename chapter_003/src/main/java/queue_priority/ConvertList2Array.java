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
        
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cells; j++) {
                if(index < list.size()) {
                    array[i][j] = list.get(index);
                    index++;
                } else {
                    array[i][j] = 0;
                }
            }
        }
     return array;
    }
}

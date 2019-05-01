package ru.job4j.chess;

import ru.job4j.chess.excep.FigureNotFoundException;
import ru.job4j.chess.excep.ImpossibleMoveException;
import ru.job4j.chess.excep.OccupiedWayException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Logic {
    private final Figure[] figures = new Figure[32];
    private int index = 0;

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    public void move(Cell source, Cell dest) throws ImpossibleMoveException, FigureNotFoundException, OccupiedWayException {
       // boolean rst = false;
        int index = this.findBy(source);

        if (index == -1) {
            throw new FigureNotFoundException("Ход невозможен");
        }
            Cell[] steps = this.figures[index].way(source, dest);
//            for(int i = 0; i < steps.length; i++) {
//                if(this.figures[this.findBy(steps[i])] != null ) {
//                    throw new ImpossibleMoveException("Ход невозможен");
//                }
//            }
            if (steps.length > 0 && steps[steps.length - 1].equals(dest)) {
              //  rst = true;
                if (this.hasAnother(steps)) {
                    throw new OccupiedWayException("Ячейка занята");
                }
                this.figures[index] = this.figures[index].copy(dest);
            }
       // }
      //  return rst;
    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    private boolean hasAnother(Cell[] path) {
        boolean result = false;
        for(Cell cell : path) {
            for (Figure figure : this.figures) {
                if(cell.equals(figure.position())) {
                    result = true;
                    break;
                }
            }
            if(result) {
                break;
            }
        }
        return result;
    }
}

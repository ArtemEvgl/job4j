package ru.job4j.chess.firuges.white;

import ru.job4j.chess.excep.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopWhite implements Figure {
    private final Cell position;

    public BishopWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        if (!this.isDiagonal(source, dest)) {
            throw new ImpossibleMoveException("Слон не может так ходить");
        }
        Cell[] steps = new Cell[Math.max(source.x, dest.x) - Math.min(source.x, dest.x)];
        int deltaX = dest.x > source.x ? 1 : -1;
        int deltaY = dest.y > source.y ? 1 : -1;
        for (int index = 1; index <= steps.length; index++) {
            steps[index - 1] = Cell.getCell(source.x + index * deltaX, source.y + index * deltaY);
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopWhite(dest);
    }

    private boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(source.x - dest.x) == Math.abs(source.y - dest.y);
    }
}

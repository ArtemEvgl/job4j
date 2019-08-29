package ru.job4j;

import org.junit.Test;
import ru.job4j.chess.excep.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.white.BishopWhite;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopWhiteTest {

    @Test
    public void whenSourceCellD4DestCellH8ThenArrayE5F6G7H8() {
        BishopWhite bishop = new BishopWhite(Cell.D4);
        Cell[] expect = {Cell.E5, Cell.F6, Cell.G7, Cell.H8};
        try {
            assertThat(bishop.way(Cell.D4, Cell.H8), is(expect));
        } catch (ImpossibleMoveException e) {
            System.err.print(e);
        }
    }
}

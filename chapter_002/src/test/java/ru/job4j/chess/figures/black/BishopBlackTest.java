package ru.job4j.chess.figures.black;

import org.junit.Test;
import ru.job4j.chess.exceptions.ImposibleMoveException;
import ru.job4j.chess.figures.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The test-class for the BishopBlack figure testing.
 * @author makkez
 * @version 1.0 15.12.2018
 */
public class BishopBlackTest {

    /**
     * The method for the testing of the way() method when the destination cell on the diagonal by the source cell
     * and the way is top and right.
     */
    @Test
    public void whenSourceCellD4DestCellH8ThenArrayE5F6G7H8() {
        BishopBlack bishop = new BishopBlack(Cell.D4);
        Cell[] expected = {Cell.E5, Cell.F6, Cell.G7, Cell.H8};
        try {
            assertThat(bishop.way(Cell.D4, Cell.H8), is(expected));
        } catch (ImposibleMoveException exc) {
            System.err.println(exc);
        }
    }

    /**
     * The method for the testing of the way() method when the destination cell on the diagonal by the source cell
     * and the way is bottom and right.
     */
    @Test
    public void whenSourceCellD4DestCellG1ThenArrayE3F2G1() {
        BishopBlack bishop = new BishopBlack(Cell.D4);
        Cell[] expected = {Cell.E3, Cell.F2, Cell.G1};
        try {
            assertThat(bishop.way(Cell.D4, Cell.G1), is(expected));
        } catch (ImposibleMoveException exc) {
            System.err.println(exc);
        }
    }

    /**
     * The method for the testing of the way() method when the destination cell on the diagonal by the source cell
     * and the way is bottom and left.
     */
    @Test
    public void whenSourceCellD4DestCellA1ThenArrayC3B2A1() {
        BishopBlack bishop = new BishopBlack(Cell.D4);
        Cell[] expected = {Cell.C3, Cell.B2, Cell.A1};
        try {
            assertThat(bishop.way(Cell.D4, Cell.A1), is(expected));
        } catch (ImposibleMoveException exc) {
            System.err.println(exc);
        }
    }

    /**
     * The method for the testing of the way() method when the destination cell on the diagonal by the source cell
     * and the way is top and left.
     */
    @Test
    public void whenSourceCellD4DestCellA7ThenArrayC5B6A7() {
        BishopBlack bishop = new BishopBlack(Cell.D4);
        Cell[] expected = {Cell.C5, Cell.B6, Cell.A7};
        try {
            assertThat(bishop.way(Cell.D4, Cell.A7), is(expected));
        } catch (ImposibleMoveException exc) {
            System.err.println(exc);
        }
    }
}

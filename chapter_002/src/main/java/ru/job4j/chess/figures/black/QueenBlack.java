package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/**
 * Class descriptions the QueenBlack figure.
 * @author makkez
 * @version 1.0 23.11.2018
 */
public class QueenBlack extends Figure {

    /**
     * A constructor which sets the position for figure.
     * @param position The position for figure.
     */
    public QueenBlack(final Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        return new Cell[] {dest};
    }

    @Override
    public Figure copy(Cell dest) {
        return new QueenBlack(dest);
    }
}

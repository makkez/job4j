package ru.job4j.chess.figures.white;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/**
 * Class descriptions the RookWhite figure.
 * @author makkez
 * @version 1.0 23.11.2018
 */
public class RookWhite extends Figure {

    /**
     * A constructor which sets the position for figure.
     * @param position The position for figure.
     */
    public RookWhite(final Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        return new Cell[] {dest};
    }

    @Override
    public Figure copy(Cell dest) {
        return new RookWhite(dest);
    }
}

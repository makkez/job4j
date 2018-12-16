package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/**
 * Class descriptions the KingBlack figure.
 * @author makkez
 * @version 1.0 23.11.2018
 */
public class KingBlack extends Figure {

    /**
     * A constructor which sets the position for figure.
     * @param position The position for figure.
     */
    public KingBlack(final Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        return new Cell[] {dest};
    }

    @Override
    public Figure copy(Cell dest) {
        return new KingBlack(dest);
    }
}

package ru.job4j.chess.figures.black;

import ru.job4j.chess.exceptions.ImposibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/**
 * Class descriptions the BishopBlack figure.
 * @author makkez
 * @version 1.0 23.11.2018
 */
public class BishopBlack extends Figure {

    /**
     * A constructor which sets the position for figure.
     * @param position The position for figure.
     */
    public BishopBlack(final Cell position) {
        super(position);
    }

    private boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(source.x - dest.x) == Math.abs(source.y - dest.y);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImposibleMoveException {
        if (!this.isDiagonal(source, dest)) {
            throw new ImposibleMoveException();
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
        return new BishopBlack(dest);
    }
}

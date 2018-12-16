package ru.job4j.chess.figures;

import ru.job4j.chess.exceptions.ImposibleMoveException;

/**
 * The Figure is the abstract class. It sets the functionality of the figure.
 * @author makkez
 * @version 1.0 23.11.2018
 */
public abstract class Figure {

    private final Cell position;

    /**
     * A constructor which sets the position for figure.
     * @param position The position for figure.
     */
    protected Figure(final Cell position) {
        this.position = position;
    }

    /**
     * Method determines a position of the figure.
     * @return Cell-object with a position of the figure.
     */
    public Cell position() {
        return this.position;
    }

    /**
     * Method determines available cells for the figure.
     * It generates the ImposibleMoveException if the figure can't pass to the destination.
     * @param source The source cell for the figure.
     * @param dest The destination cell for the figure.
     * @return An array of cells that the figure must pass.
     */
    public abstract Cell[] way(Cell source, Cell dest) throws ImposibleMoveException;

    /**
     * Method determines a name of the figure.
     * Method has the default implementation.
     * @return A name of the figure.
     */
    public String icon() {
        return String.format("%s.png", this.getClass().getSimpleName());
    }

    /**
     * Method copies figure.
     * @param dest Cell - destination.
     * @return The figure.
     */
    public abstract Figure copy(Cell dest);
}

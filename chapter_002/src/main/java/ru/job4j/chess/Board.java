package ru.job4j.chess;

import ru.job4j.chess.exceptions.*;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

public class Board {

    private final Figure[] figures = new Figure[32];
    private int index = 0;

    /**
     * The method adds new figure on the board.
     * @param figure The new figure for adding to the board.
     */
    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    /**
     * The method implements the moving for the figure from source-cell to destination-cell.
     * @param source The cell from which the figure moves.
     * @param dest The cell to which the figure moves.
     * @throws ImposibleMoveException Generated when the figure can't moving.
     * @throws FigureNotFoundException Generated when the figure is missing on the source-cell.
     * @throws OccupiedWayException Generated when the required way have any figures.
     */
    public void move(Cell source, Cell dest)
            throws ImposibleMoveException, FigureNotFoundException, OccupiedWayException {
        this.index = this.findBy(source);
        if (this.index == -1) {
            throw new FigureNotFoundException();
        }
        Cell[] steps = this.figures[this.index].way(source, dest);
        if (steps.length > 0 && steps[steps.length - 1].equals(dest)) {
            if (this.hasAnother(steps)) {
                throw new OccupiedWayException();
            }
            this.figures[this.index] = this.figures[this.index].copy(dest);
        }
    }

    /**
     * The method checks the specified cell has the figure.
     * @param cell The specified cell.
     * @return An index of the figure if it's on the specified cell, or not -1.
     */
    private int findBy(Cell cell) {
        int result = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                result = index;
                break;
            }
        }
        return result;
    }

    /**
     * The method checks the specified path for a figure has any figure.
     * @param path The specified path for a figure.
     * @return If the path has any figure then true, or not false.
     */
    private boolean hasAnother(Cell[] path) {
        boolean result = false;
        for (Cell cell : path) {
            for (Figure figure : this.figures) {
                if (cell.equals(figure.position())) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }

    /**
     * The method cleans the board.
     */
    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }
}

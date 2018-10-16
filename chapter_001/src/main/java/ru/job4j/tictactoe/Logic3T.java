package ru.job4j.tictactoe;

import java.util.function.Predicate;

/**
 * Describe logic of game.
 * @author makkez
 * @version 1.0
 * @since 19.09.2018
 */
public class Logic3T {

    private final Figure3T[][] table;

    /**
     * Constructor for create new object of logic.
     * @param table Table.
     */
    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    /**
     * Checking win X.
     * @return True or false.
     */
    public boolean isWinnerX() {
        return this.checkWinner(Figure3T::hasMarkX);
    }

    /**
     * Checking win O.
     * @return True or false.
     */
    public boolean isWinnerO() {
        return this.checkWinner(Figure3T::hasMarkO);
    }

    /**
     * Board has empty cells checking.
     * @return True or false.
     */
    public boolean hasGap() {
        boolean result = false;
        for (Figure3T[] figures : this.table) {
            for (Figure3T figure : figures) {
                if (!figure.hasMarkX() && !figure.hasMarkO()) {
                    result = true;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }

    /**
     * Checking sequence for tic tac toe winning combination.
     * @param predicate Template for reference.
     * @param startX Coordinate X of start cell.
     * @param startY Coordinate Y of start cell.
     * @param deltaX Offset by coordinate X.
     * @param deltaY Offset by coordinate Y.
     * @return True or false.
     */
    private boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }

    private boolean checkWinner(Predicate<Figure3T> predicate) {
        boolean result = false;
        for (int index = 0; index < this.table.length; index++) {
            if (this.fillBy(predicate, index, 0, 0, 1) 
					|| this.fillBy(predicate, 0, index, 1, 0)) {
                result = true;
                break;
            }
        }
        return result || this.fillBy(predicate, 0, 0, 1, 1) 
				|| this.fillBy(predicate, this.table.length - 1, 0, -1, 1);
    }
}

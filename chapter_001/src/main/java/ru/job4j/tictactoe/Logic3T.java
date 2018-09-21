package ru.job4j.tictactoe;

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
        boolean result = false;
        boolean check;
        Figure3T[][] winLines = getWinningLines(this);
        for (Figure3T[] figures : winLines) {
            check = true;
            for (Figure3T figure : figures) {
                if (!figure.hasMarkX()) {
                    check = false;
                    break;
                }
            }
            if (check) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Checking win O.
     * @return True or false.
     */
    public boolean isWinnerO() {
        boolean result = false;
        boolean check;
        Figure3T[][] winLines = getWinningLines(this);
        for (Figure3T[] figures : winLines) {
            check = true;
            for (Figure3T figure : figures) {
                if (!figure.hasMarkO()) {
                    check = false;
                    break;
                }
            }
            if (check) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Board has empty cells checking.
     * @return True or false.
     */
    public boolean hasGap() {
        boolean result = false;
        outer:
        for (Figure3T[] figures : this.table) {
            for (Figure3T figure : figures) {
                if (!figure.hasMarkX() && !figure.hasMarkO()) {
                    result = true;
                    break outer;
                }
            }
        }
        return result;
    }

    private static Figure3T[][] getWinningLines(Logic3T logic) {
        Figure3T[][] result = {
                {logic.table[0][0], logic.table[1][0], logic.table[2][0]},
                {logic.table[0][1], logic.table[1][1], logic.table[2][1]},
                {logic.table[0][2], logic.table[1][2], logic.table[2][2]},
                {logic.table[0][0], logic.table[0][1], logic.table[0][2]},
                {logic.table[1][0], logic.table[1][1], logic.table[1][2]},
                {logic.table[2][0], logic.table[2][1], logic.table[2][2]},
                {logic.table[0][0], logic.table[1][1], logic.table[2][2]},
                {logic.table[2][0], logic.table[1][1], logic.table[0][2]}
        };
        return result;
    }
}

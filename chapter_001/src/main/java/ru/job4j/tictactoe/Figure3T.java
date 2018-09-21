package ru.job4j.tictactoe;

import javafx.scene.shape.Rectangle;

/**
 * Describe cell on board.
 * @author makkez
 * @version 1.0
 * @since 17.09.2018
 */
public class Figure3T extends Rectangle {

    private boolean markX = false;
    private boolean markO = false;

    /**
     * Default constructor.
     */
    public Figure3T() { }

    /**
     * Constructor creates new cell and marks his by marker.
     * @param markX Marker.
     */
    public Figure3T(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }

    /**
     * Method marks cell by marker.
     * @param markX Marker.
     */
    public void take(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }

    /**
     * Checking, cell has marker X or not.
     * @return Marker X.
     */
    public boolean hasMarkX() {
        return this.markX;
    }

    /**
     * Checking, cell has marker O or not.
     * @return Marker O.
     */
    public boolean hasMarkO() {
        return this.markO;
    }
}

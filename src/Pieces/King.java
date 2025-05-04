package Pieces;

import Enums.Status;

public class King implements Piece {

    @Override
    public String color() {
        return "";
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public int eliminate(int x, int y) {
        return 0;
    }

    @Override
    public Status status() {
        return null;
    }
}

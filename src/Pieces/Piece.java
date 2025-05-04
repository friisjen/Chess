package Pieces;

import Enums.Status;

public interface Piece {

    public String color();
    public void move(int x, int y);
    public int eliminate(int x, int y);
    public Status status();
}

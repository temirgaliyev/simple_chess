package pieces.black;

import pieces.Cell;
import pieces.Piece;

public class PawnBlack implements Piece {
    private final Cell position;

    public PawnBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        if (source.y == dest.y + 1 && source.x == dest.x) {
            steps = new Cell[] { dest };
        }
        return steps;
    }

    @Override
    public Piece copy(Cell dest) {
        return new PawnBlack(dest);
    }
}

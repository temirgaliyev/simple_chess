package pieces.black;

import pieces.Cell;
import pieces.Piece;

public class KnightBlack implements Piece {
    private final Cell position;

    public KnightBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        return new Cell[] { dest };
    }

    @Override
    public Piece copy(Cell dest) {
        return new KnightBlack(dest);
    }
}

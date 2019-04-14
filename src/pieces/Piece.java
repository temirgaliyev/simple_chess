package pieces;

public interface Piece {
    Cell position();

    Cell[] way(Cell source, Cell dest);

    default String icon() {
        return String.format("resources/%s.png", this.getClass().getSimpleName());
    }

    Piece copy(Cell dest);

}

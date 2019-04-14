import pieces.Cell;
import pieces.Piece;

public class Logic {
    private final Piece[] Pieces = new Piece[32];
    private int index = 0;

    public void add(Piece Piece) {
        this.Pieces[this.index++] = Piece;
    }

    public boolean move(Cell source, Cell dest) {
        boolean rst = false;
        int index = this.findBy(source);
        if (index != -1) {
            Cell[] steps = this.Pieces[index].way(source, dest);
            if (steps.length > 0 && steps[steps.length - 1].equals(dest)) {
                rst = true;
                this.Pieces[index] = this.Pieces[index].copy(dest);
            }
        }
        return rst;
    }

    public void clean() {
        for (int position = 0; position != this.Pieces.length; position++) {
            this.Pieces[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.Pieces.length; index++) {
            if (this.Pieces[index] != null && this.Pieces[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}

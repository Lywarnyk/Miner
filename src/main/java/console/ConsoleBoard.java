package console;
import Logic.Board;
import Logic.Cell;

/**
 * Created by lywar on 06.08.2017.
 */
public class ConsoleBoard implements Board {

    private Cell[][] cells;

    public void drawBoard(Cell[][] cells) {
        this.cells = cells;
        this.redraw(false);
    }

    public void drawCell(int x, int y) {
        System.out.println("***** SELECT *****");
        this.redraw(false);
    }

    public void drawBang() {
        System.out.println("***** BANG *****");
        this.redraw(true);
    }

    public void drawCongrats() {
        System.out.println("***** CONGRATULATE *****");
    }

    private void redraw(boolean real){
        for (Cell[] row : cells){
            for (Cell cell : row){
                cell.draw(System.out, real);
            }
            System.out.println();
        }
        System.out.println();
    }
}

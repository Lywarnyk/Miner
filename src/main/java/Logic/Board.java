package Logic;

/**
 * Created by lywar on 06.08.2017.
 */
public interface Board {
    /**
     * Рисует доску исходя из входящего массива ячеек.
     * @param cells Масив ячеек
     */
    void drawBoard(Cell[][] cells);

    /**
     * Рисует ячейку
     * @param x позиция по горизонтали
     * @param y позиция по вертикали
     */
    void drawCell(int x,int y);


    /**
     * Рисует взрыв всех бомб
     */
    void drawBang();

    /**
     * Рисует поздравления
     */
    void drawCongrats();

}

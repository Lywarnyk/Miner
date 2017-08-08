package Logic;

/**
 * Created by lywar on 06.08.2017.
 */
public interface MinerLogic {

    void loadBoard(Cell[][] cells);

    boolean shouldBang(int x , int y);

    boolean finish();

    void suggest(int x, int y, boolean bomb);
}

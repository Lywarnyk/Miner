package Logic;

import console.ConsoleBoard;
import console.ConsoleCell;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lywar on 06.08.2017.
 */
public class BaseActionTest {

    final BaseAction action = new BaseAction(
            new Easy(), new ConsoleBoard(),
            new GeneratorBoard() {
                public Cell[][] generate() {
                    return new Cell[][]{
                            {new ConsoleCell(true), new ConsoleCell(false)},
                            {new ConsoleCell(true), new ConsoleCell(false)}};
                }
            }
    );

    @Test
    public void successGame(){
        action.initGame();
        action.select(0,0, true);
        action.select(1,0,true);
        action.select(0,1,false);
        action.select(1,1, false);
    }

    @Test
    public void failureGame(){
        action.initGame();
        action.select(0,0,true);
        action.select(1,0, false);
    }
}

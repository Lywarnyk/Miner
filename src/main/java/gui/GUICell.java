package gui;

import Logic.Cell;

import java.awt.*;

/**
 * Created by lywar on 06.08.2017.
 */
public class GUICell implements Cell<Graphics> {
    public boolean isBomb() {
        return false;
    }

    public boolean isSuggestBomb() {
        return false;
    }

    public boolean isSuggestEmpty() {
        return false;
    }

    public void suggestEmpty() {

    }

    public void suggestBomb() {

    }

    public void draw(Graphics paint, boolean real) {
      //  paint.dr
    }
}

package gui;

import Logic.BaseAction;
import Logic.Board;
import Logic.GeneratorBoard;
import Logic.MinerLogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by lywar on 06.08.2017.
 */
public class GUIAction extends BaseAction implements ActionListener, MouseListener {

    private GUIBoard board;

    public GUIAction(MinerLogic logic, GUIBoard board, GeneratorBoard generator) {
        super(logic, board, generator);
        this.board = board;
        this.board.addMouseListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        this.initGame();
    }

    public void mouseClicked(MouseEvent e) {
        board.repaint();
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}

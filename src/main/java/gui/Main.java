package gui;

import Logic.Cell;
import Logic.Easy;
import Logic.GeneratorBoard;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by lywar on 06.08.2017.
 */
public class Main {

    private static final JPanel controlPanel = new JPanel();
    private static final GUIBoard board = new GUIBoard();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                final JFrame frame = new JFrame();
                frame.setVisible(true);
                frame.setTitle("Miner");
                frame.setLayout(new BorderLayout());
                frame.setSize(800, 800);
                frame.add(board, BorderLayout.CENTER);
                board.setBorder(new EmptyBorder(10,10,10,10));
                frame.add(controlPanel, BorderLayout.PAGE_END);
                controlPanel.setLayout(new FlowLayout());
                final JButton generate = new JButton("Start");
                generate.addActionListener(new GUIAction(
                        new Easy(), board, new GeneratorBoard() {
                    public Cell[][] generate() {
                        return new Cell[][] {createCells(),createCells(),createCells(),createCells(),createCells(),createCells(),createCells(),createCells(),
                        createCells(),createCells(),createCells(),createCells(),createCells()};//{{new GUICell(),new GUICell()},{new GUICell(),new GUICell()}};
                    }
                }
                ));
                controlPanel.add(generate);
                centre(frame);
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        closePerform(frame);
                    }
                });
            }
        });
    }

    private static Cell[] createCells() {
        Cell[] cell = new GUICell[10];
        for (int i= 0; i<10;i++){
            cell[i] = new GUICell();
        }
        return cell;
    }


    private static void centre(Window w) {
        Dimension us = w.getSize();
        Dimension them = Toolkit.getDefaultToolkit().getScreenSize();
        int newX = (them.width - us.width) / 2;
        int newY = (them.height - us.height) /2;
        w.setLocation(newX, newY);
    }

    public static void closePerform(JFrame frame){
        frame.setVisible(false);
        frame.dispose();
        System.exit(0);
    }
}

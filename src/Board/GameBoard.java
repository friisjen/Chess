package Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GameBoard extends JFrame implements MouseListener, MouseMotionListener {

    public GameBoard() {
        // Init the frame
        JFrame gameWindow = new JFrame("Chess by Friis");
        gameWindow.setLocationRelativeTo(null);

        // Init the panel to paint the board with the squares
        JPanel pl = new JPanel(){
            @Override
            public void paint(Graphics g) {
                for(int x = 0; x < 8; x++) {
                    for(int y = 0; y < 8; y++) {
                        if((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
                            g.setColor(Color.gray);
                        } else {
                            g.setColor(Color.white);
                        }
                        g.fillRect(x*64, y*64, 64, 64);
                    }
                }
            }
        };
        // Board consists of 64 squares -> 8 * 8
        pl.setPreferredSize(new Dimension(512, 512));
        gameWindow.add(pl);
        gameWindow.pack();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.setVisible(true);
    }

    public static void main(String[] args) {
        new GameBoard();
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
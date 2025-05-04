package Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GameBoard extends JFrame implements MouseListener, MouseMotionListener {

    public GameBoard() {
        // Init the frame
        setTitle("Game Board");
        setLocationRelativeTo(null);
        setResizable(false);

        // Init the panel to paint the board with the squares
        JPanel pl = new JPanel(){
            @Override
            public void paint(Graphics g) {

                int squareSize = 64;

                int offset = 20;

                for(int x = 0; x < 8; x++) {
                    for(int y = 0; y < 8; y++) {
                        // Modulo (%) operator returns the remainder of a division, i.e., 10 / 3 = 3 with remainder 1.
                        if((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
                            g.setColor(Color.white);
                        } else {
                            g.setColor(Color.gray);
                        }
                        g.fillRect((x+1)*squareSize, (y+1)*squareSize, squareSize, squareSize);
                    }
                }
                g.setFont(new Font("Helvetica", Font.BOLD, 12));
                g.setColor(Color.black);

                for(int col = 0; col < 8; col++) {
                    String cLabel = String.valueOf((char) ('A' + col));
                    g.drawString(cLabel, (col+1) * squareSize + squareSize / 2 - 6, squareSize - offset / 2);
                }

                for (int row = 0; row < 8; row++) {
                    String label = String.valueOf(8 - row);
                    g.drawString(label, squareSize - offset, (row+1) * squareSize + squareSize / 2 + 6);
                }
            }
        };
        // Board consists of 64 squares -> 8 * 8 (dimension there 512 * 512 with extra for row and column ids)
        pl.setPreferredSize(new Dimension(576, 576));
        add(pl);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
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